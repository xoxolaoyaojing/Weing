package com.example.secuber.libibcaxolotl;

import android.util.Base64;

import com.google.common.base.Optional;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * Created by root on 16-3-18.
 */
public class Encrypter {

    public static Cipher getCipher(int mode, SecretKeySpec key, IvParameterSpec iv)
    {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(mode, key, iv);
            return cipher;
        }catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException |
                InvalidAlgorithmParameterException e){
            throw new AssertionError(e);
        }
    }

    public static String getEncodingText(String msg, byte[] key_material, byte[] iv_material)
    {
        SecretKeySpec key = new SecretKeySpec(key_material,"AES/CBC/PKCS5Padding");
        IvParameterSpec iv = new IvParameterSpec(iv_material);
        Cipher cipher = getCipher(Cipher.ENCRYPT_MODE,key,iv);
        byte[] byte_msg;
        byte[] byte_cipherText;
        Optional<String> str_cipherText;
        try {
            byte_msg = msg.getBytes();
            byte_cipherText = cipher.doFinal(byte_msg);
            str_cipherText = Optional.fromNullable(Base64.encodeToString(byte_cipherText, Base64.DEFAULT));
            return str_cipherText.get();
        }catch (BadPaddingException | IllegalBlockSizeException e){
            e.printStackTrace();
            return msg;
        }
    }

    public static String getDecodingText(String cipherText, byte[] key_material, byte[] iv_material) {
        SecretKeySpec key = new SecretKeySpec(key_material, "AES/CBC/PKCS5Padding");
        IvParameterSpec iv = new IvParameterSpec(iv_material);
        Cipher cipher = getCipher(Cipher.DECRYPT_MODE, key, iv);
        byte[] byte_msg;
        byte[] byte_cipherText;
        Optional<String> msg;
        try {
            String content = cipherText;
            byte_cipherText = Base64.decode(content, Base64.DEFAULT);
            byte_msg = cipher.doFinal(byte_cipherText);
            if (byte_msg == null) {
                return cipherText;
            }
            msg = Optional.fromNullable(new String(byte_msg));
            if (msg.isPresent() && msg.get().length()>0) {
                return msg.get();
            } else {
                return cipherText;
            }
        }catch (IllegalArgumentException e) {
            e.printStackTrace();
            return cipherText;
        }catch (BadPaddingException | IllegalBlockSizeException e){
            e.printStackTrace();
            return cipherText;
        }
    }

}
