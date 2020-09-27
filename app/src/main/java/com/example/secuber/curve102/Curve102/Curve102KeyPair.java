package com.example.secuber.curve102.Curve102;

/**
 * A tuple that contains a Curve102 public and private key.
 *
 *
 */
public class Curve102KeyPair {

  private final Curve102Key publicKey;
  private final Curve102Key privateKey;
  
  Curve102KeyPair(Curve102Key publicKey, Curve102Key privateKey)
  {
    this.publicKey = publicKey;
    this.privateKey = privateKey;
  }
  
  /**
   * @return The Curve102 public key.
   */
  public byte[] getPublicKey()
  {
	  return publicKey.getBytes();
  }
  
  /**
   * @return The Curve102 private key.
   */
  public byte[] getPrivateKey()
  {
	 return privateKey.getBytes();
  }
}
