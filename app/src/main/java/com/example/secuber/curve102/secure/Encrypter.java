package com.example.secuber.curve102.secure;

import com.google.common.base.Optional;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Encrypter {

	public static byte[] SHA1Encode(String sourceString, int length) {
		String tmpStr = new String(sourceString);
		byte[] resultString = new byte[length];
		byte[] tmpBytes = null;
		int count = 0;
		try {
			MessageDigest md;
			md = MessageDigest.getInstance("SHA-1");
			tmpBytes = tmpStr.getBytes();
			do {
				if (tmpBytes != null) {
					tmpBytes = md.digest(tmpBytes);
					if (count + tmpBytes.length < length) {
						System.arraycopy(tmpBytes, 0, resultString, count, tmpBytes.length);
						count += tmpBytes.length;
					} else {
						System.arraycopy(tmpBytes, 0, resultString, count, length - count);
						count = length;
					}
				}
			} while (count < length);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return resultString;
	}

	public static Cipher getCipher(int mode, byte[] key_material, byte[] iv_material) {

		Cipher cipher;
		SecretKeySpec key = new SecretKeySpec(key_material, "AES");
		IvParameterSpec iv = new IvParameterSpec(iv_material);
		try {
			cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			cipher.init(mode, key, iv);
			return cipher;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			throw new AssertionError(e);
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
			throw new AssertionError(e);
		} catch (InvalidKeyException e) {
			e.printStackTrace();
			throw new AssertionError(e);
		} catch (InvalidAlgorithmParameterException e) {
			e.printStackTrace();
			throw new AssertionError(e);
		}
	}

	private static String process(String strProcess, String key, int mode) {
		// genreate key and iv
		byte[] key_material = new byte[32];
		byte[] iv_material = new byte[16];

		byte[] tmpBytes = SHA1Encode(key, 48);
		System.arraycopy(tmpBytes, 0, key_material, 0, 32);
		System.arraycopy(tmpBytes, 32, iv_material, 0, 16);

		Cipher cipher = getCipher(mode, key_material, iv_material);

		byte[] byte_msg;
		byte[] byte_processed;
		Optional<String> str_processedText;
		try {

			if (mode == cipher.ENCRYPT_MODE) {
				byte_msg = strProcess.getBytes();
				byte_processed = cipher.doFinal(byte_msg);
				str_processedText = Optional.fromNullable(com.example.secuber.curve102.util.Base64.encodeBytes(byte_processed));
			} else {
				byte_msg = com.example.secuber.curve102.util.Base64.decode(strProcess);
				byte_processed = cipher.doFinal(byte_msg);
				str_processedText = Optional.fromNullable(new String(byte_processed));
			}
			return str_processedText.get();
		} catch (BadPaddingException e) {
			throw new AssertionError(e);
		} catch (IllegalBlockSizeException e) {
			e.printStackTrace();
			return strProcess;
		} catch(IOException e) {
			e.printStackTrace();
			throw new AssertionError(e);
		}
	}

	public static String ecnrypt(String plainText, String key) {
		return process(plainText, key, Cipher.ENCRYPT_MODE);
	}

	public static String decrypt(String cipherText, String key) {
		return process(cipherText, key, Cipher.DECRYPT_MODE);
	}

}
