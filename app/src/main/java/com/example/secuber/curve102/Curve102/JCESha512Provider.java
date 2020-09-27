package com.example.secuber.curve102.Curve102;

import com.example.secuber.curve102.ecc.Sha512;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class JCESha512Provider implements Sha512 {

	public void calculateDigest(byte[] out, byte[] in, long length)
	{
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("SHA-512");
			messageDigest.update(in,0,(int)length);
			byte[] digest = messageDigest.digest();
			System.arraycopy(digest,0,out,0,digest.length);
		} catch (NoSuchAlgorithmException e) {
			throw new AssertionError(e);
		}
	}
}
