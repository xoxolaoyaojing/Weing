package com.example.secuber.curve102.Curve102;

import com.example.secuber.curve102.ecc.EccFeElement;
import com.example.secuber.curve102.ecc.EccNum;
import com.example.secuber.curve102.ecc.EccPoint;
import com.example.secuber.curve102.ecc.InvalidHashValueException;
import com.example.secuber.curve102.ecc.Sha512;

abstract class BaseJavaCurve102Provider implements Curve102Provider {

  protected final Sha512  sha512provider;
  protected        SecureRandomProvider secureRandomProvider;

  protected BaseJavaCurve102Provider(Sha512 sha512provider,
                                      SecureRandomProvider secureRandomProvider)
  {
    this.sha512provider = sha512provider;
    this.secureRandomProvider = secureRandomProvider;
  }

  public abstract boolean isNative();

  public void setRandomProvider(SecureRandomProvider secureRandomProvider)
  {
    this.secureRandomProvider = secureRandomProvider;
  }

  public byte[] calculateAgreement(byte[] ourPrivate, byte[] theirPublic)
  {
    byte[] agreement = new byte[64];
    // calculate
    Curve102Key ourPrivateKey = new Curve102Key(ourPrivate);
    Curve102Key theirPublicKey = new Curve102Key(theirPublic);
    EccFeElement sharedKey = EccPoint.pairing(ourPrivateKey.getKey(),theirPublicKey.getKey());
    agreement = sharedKey.getBytes();
    return agreement;
  }

  public Curve102Key generatePublicKey(String id)
  {
    
    // generate
    // hash
    byte[] id_hashed = new byte[64];
    byte[] x = new byte[32];
    byte[] id_bytes = id.getBytes();
    //x = hash(id);
    sha512provider.calculateDigest(id_hashed,id_bytes,id_bytes.length);
    System.arraycopy(id_hashed,0,x,0,32);
    // from hash
    try{
      EccPoint point = EccPoint.fromHash(x);
      return new Curve102Key(point);
    } catch(InvalidHashValueException e) {
      e.printStackTrace();
    }
    return null;
  }
  
  public Curve102Key generatePrivateKey(byte[] publicKey, byte[] random)
  {
    Curve102Key key = new Curve102Key(publicKey);
    EccNum s = new EccNum(random,16);
    EccPoint privateKey = EccPoint.scalarMultiplication(key.getKey(),s);
    return new Curve102Key(privateKey);
  }

    /*
  public byte[] generatePrivateKey()
  {
    byte[] privateKey = new byte[64];
    //generate

    return privateKey;
  }
  */
}
