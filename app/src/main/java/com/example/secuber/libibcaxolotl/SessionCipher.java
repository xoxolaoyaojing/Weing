package com.example.secuber.libibcaxolotl;

import android.util.Log;

import com.example.secuber.curve102.Curve102.Curve102;
import com.example.secuber.curve102.PKG.*;
import com.example.secuber.libibcaxolotl.state.PrvKeyStore;
import com.example.secuber.libibcaxolotl.IncorrectPrvKeyStateException;
import com.example.secuber.libibcaxolotl.Encrypter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xkey on 2017/8/16.
 */
public class SessionCipher {
    private static final String TAG = SessionCipher.class.getSimpleName();

    private static final Object SESSION_LOCK = new Object();
    private PrvKeyStore prvKeyStore = null;
    private String remoteId;

    private static Map<String,byte[]> listSessionKey = new HashMap<>();
    /**
     * the global SessionCipher instance
     */
    private static SessionCipher instance = null;

    /**
     * forbidden constructor
     */
    private SessionCipher() {}

    /**
     * get instance of SessionCipher
     */
    public synchronized static SessionCipher getInstance() {
        if(instance == null) {
            instance = new SessionCipher();
        }
        return instance;
    }

    /**
     * set private key store
     */
    public void setPrvKeyStore(PrvKeyStore prvKeyStore) {
        this.prvKeyStore = prvKeyStore;
    }

    /**
     * set remote id
     */
    public void setRemoteId(String remoteId) {
        this.remoteId = remoteId;
    }

    /**
     * Encrypt a message
     *
     * @param plainTextMessage The plaintext string message.
     * @return A String message encrypted
     */
    public String encrypt(String plainTextMessage) {

        byte[] sessionKey;
        try {
        sessionKey = getSokSessionKey();
        } catch (IncorrectPrvKeyStateException e) {
            e.printStackTrace();
            return plainTextMessage;
        }

        Log.d(TAG, "Session key: ");


        byte[] key_material = new byte[32];
        byte[] iv_material = new byte[16];
        System.arraycopy(sessionKey,0,key_material,0,32);
        System.arraycopy(sessionKey,0,iv_material,0,16);
        Log.d(TAG, "Encrypt key: ");

        Log.d(TAG, "iv: ");

        return Encrypter.getEncodingText(plainTextMessage, key_material, iv_material);
    }

    /**
     * Decrypt a encrypted message
     *
     * @param encryptedMessage The encrypted message.
     * @return A String plain message
     */
    public String decrypt(String encryptedMessage) {
        Log.d(TAG, encryptedMessage);

        byte[] sessionKey;
        try {
            sessionKey = getSokSessionKey();
        } catch (IncorrectPrvKeyStateException e) {
            e.printStackTrace();
            return encryptedMessage;
        }

        byte[] key_material = new byte[32];
        byte[] iv_material = new byte[16];
        System.arraycopy(sessionKey,0,key_material,0,32);
        System.arraycopy(sessionKey,0,iv_material,0,16);

        String decryptedMessage = Encrypter.getDecodingText(encryptedMessage, key_material, iv_material);
        return decryptedMessage;
    }

    /**
     * get sok key
     */
    private byte[] getSokSessionKey() throws IncorrectPrvKeyStateException{
        byte[] sessionKey;
        if(listSessionKey.containsKey(remoteId)) {
            Log.d(TAG, "Has a session key");
            sessionKey = listSessionKey.get(remoteId);
        } else {
            Log.d(TAG, "No session key!");
            // load private key from PrvKeyStore
            byte[] localPrvKey = new byte[0];
            try {
//                if (remoteId.equals("1111")) {
//                    localPrvKey = com.example.secuber.curve102.PKG.KeyManager.getPrivate2();
//                }else{
                    localPrvKey = com.example.secuber.curve102.PKG.KeyManager.getPrivate();
//                }

            } catch (InvalidMainPasswdException e) {
                e.printStackTrace();
            }
            if (null == localPrvKey) {
                Log.e(TAG, "Has no private key!");
                throw new IncorrectPrvKeyStateException("Has no private key!");
            }
            // map public key by Curve102
            byte[] remotePubKey = Curve102.getInstance("java").publicKeyFromId(remoteId).getBytes();
            // calc session key
            sessionKey = Curve102.getInstance("java").calculateAgreement0(remotePubKey, localPrvKey);
            listSessionKey.put(remoteId,sessionKey);
        }
        return sessionKey;
    }
}
