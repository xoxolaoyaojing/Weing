package com.example.secuber.curve102.Curve102;

interface Curve102Provider {

	public static final int KEY_LEN = 64;

	public boolean isNative();
	public byte[] calculateAgreement(byte[] ourPrivate, byte[] theirPublic);
	public Curve102Key generatePublicKey(String id);
	public void setRandomProvider(SecureRandomProvider provider);
	public Curve102Key generatePrivateKey(byte[] publicKey, byte[] random);
}
