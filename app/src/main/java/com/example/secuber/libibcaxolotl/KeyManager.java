package com.example.secuber.libibcaxolotl;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;

import com.example.secuber.libibcaxolotl.secure.PrvKey;
import com.example.secuber.libibcaxolotl.secure.PubKey;
import com.example.secuber.libibcaxolotl.secure.SessionKey;
import com.example.secuber.libibcaxolotl.state.PrvKeyStore;
import com.google.common.base.Optional;

import static android.content.Context.MODE_PRIVATE;

/**
 * Created by xkey on 2017/7/4.
 */
public class KeyManager implements PrvKeyStore{

    private static final String TAG = KeyManager.class.getSimpleName();

    private static KeyManager instance = null;

    public static KeyManager getInstance() {
        if(instance == null) {
            instance = new KeyManager();
        }
        return instance;
    }

    public void init(Context context) {
        instance = new KeyManager(context);
    }

    Context context;

    private String id;
    private PrvKey prvKey;
    private PubKey pubKey;
    private SessionKey sessionKey;

    private KeyManager() {}

    private KeyManager(Context context) {
        this.context = context;
        this.prvKey = new PrvKey(this.context);
    }

    @Override
    public byte[] loadPrvKey() {
//        byte[] privateKeysBytes = new byte[0];
//        privateKeysBytes = Base64.decode("Cq19iE3VvMPbqvWsYc09eHh8IRZxSC/SPmu06YHeq05Lgrf02bwEUWlO2qT4yzdmsl3t6N7XKNNqs7QDQwrOKw==", Base64.DEFAULT);
//        return privateKeysBytes;
        //sp = getSharedPreferences("config", MODE_PRIVATE);
        SharedPreferences sp = context.getSharedPreferences("config",MODE_PRIVATE);
        String PrvKey = sp.getString("privateKey","");
        byte[] privateKeysBytes = Base64.decode(PrvKey, Base64.DEFAULT);
        return privateKeysBytes;
        /*
        Optional<String> prvKeyOptional = getPrvKey();
        if(prvKeyOptional.isPresent()) {
            // 解析为byte[]
            byte[] privateKeysBytes = Base64.decode(prvKeyOptional.get(), Base64.DEFAULT);
            return privateKeysBytes;
        } else {
            Log.e(TAG, "canno load private key!");
            return null;
        }*/
    }

    public void savePrvKey() {
        // TODO: save private key into preferences or private key
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public void startGetingPrvKey() {
        try {
            prvKey.gettingPrvKey();
        }catch (IncorrectPrvKeyStateException e) {
            e.printStackTrace();
        }
    }
    public void setPrvKey(String strPrvKey) {
        prvKey.setKey(strPrvKey);
        try {
            prvKey.setPrvKey(strPrvKey);
        } catch (IncorrectPrvKeyStateException e) {
            e.printStackTrace();
        }
    }
    public Optional<String> getPrvKey() {
        try {
            return Optional.fromNullable(prvKey.getPrvKey());
        } catch (IncorrectPrvKeyStateException e) {
            e.printStackTrace();
            return Optional.absent();
        }
    }

    public void failed() {
        try{
            prvKey.failed();
        } catch (IncorrectPrvKeyStateException e) {
            e.printStackTrace();
        }
    }
}
