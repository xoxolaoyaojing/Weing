package com.example.secuber.curve102.Curve102;

/**
 * A Curve102 interface for generating keys.
 *
 */
public class Curve102 {

  public static final String NATIVE = "native";
  public static final String JAVA   = "java";
  public static final String TEST   = "test";
  
  public static Curve102 getInstance(String type)
    throws NoSuchProviderException
  {
    return getInstance(type,null);
  }
  
  public static Curve102 getInstance(String type, SecureRandomProvider random)
    throws NoSuchProviderException
  {
    if (JAVA.equals(type)) return new Curve102(constructJavaProvider(random));
    else if(TEST.equals(type)) return new Curve102(constructTmpProvider(random));
    else                     throw new NoSuchProviderException(type);
  }
  
  private final Curve102Provider provider;
  
  private Curve102(Curve102Provider provider)
  {
    this.provider = provider;
  }
  
  /**
   * {@link Curve102} is backed by either a native (via JNI)
   * or pure-Java provider. By default it prefers the native provider, and falls back to
   * the pure-Java provider if the native library fails to load.
   *
   * @return true if backed by a native provider, false otherwise.
   */
  public boolean isNative()
  {
    return provider.isNative();
  }
  
  /**
   * Generates a id-based keypair.
   *
   * @param id The String (yours) id.
   *
   * @return A Curve102 public key for your id.
   */
  public Curve102Key publicKeyFromId(String id)
  {
    return provider.generatePublicKey(id);
  }
  
  public Curve102Key privateKeyFromPublicKey(String id,byte[] random)
  {
    Curve102Key publicKey = provider.generatePublicKey(id);
    byte[] publicKeyBytes = publicKey.getBytes();
    return provider.generatePrivateKey(publicKeyBytes,random);
  }
  public Curve102Key privateKeyFromPublicKey(byte[] publicKeyBytes,byte[] random)
  {
    return provider.generatePrivateKey(publicKeyBytes,random);
  }
  
  /**
   * Generates a Curve102 keypair.
   *
   * @return A randomly generated Curve102 keypair.
   */
  public Curve102KeyPair generateKeyPair()
  {
    return null;
  }
  
  /**
   * Calculates an zero interaction key agreement.
   *
   * @param publicKey The Curve102 (typically remote party's) public key.
   * @param privateKey The Curve102 (typically yours) private key.
   * @return A 32-byte shared secret.
   */
  public byte[] calculateAgreement0(byte[] publicKey, byte[] privateKey)
  {
    return provider.calculateAgreement(privateKey, publicKey);
  }
  
  /** 
   * Calculates an key agreement with single interaction
   *
   *
   * @return A 32-byte shared secret.
   */
  public byte[] calculateAgreement1()
  {
    //TODO: key agreement with single interaction.
  return null;
  }
  
  /**
   * Calculates an key agreement with double interaction.
   *
   *
   * @return A 32-byte shared secret.
   */
  public byte[] calculateAgreement2()
  {
    //TODO: key agreement with double interaction.
  return null;
  }
  
  private static Curve102Provider constructJavaProvider(SecureRandomProvider random)
    throws NoSuchProviderException
  {
    return constructClass("JavaCurve102Provider", random);
    
  }
  private static Curve102Provider constructTmpProvider(SecureRandomProvider random)
    throws NoSuchProviderException
  {
    return constructClass("TmpJavaCurve102Provider", random);
    
  }
  
  private static Curve102Provider constructClass(String name, SecureRandomProvider random)
    throws NoSuchProviderException
  {
    try{
      Curve102Provider provider = (Curve102Provider)Class.forName("com.example.secuber.curve102.Curve102." + name).newInstance();
      
      if(random != null){
        provider.setRandomProvider(random);
      }
      
      return provider;
    } catch (InstantiationException e) {
      throw new NoSuchProviderException(e);
    } catch (IllegalAccessException e) {
      throw new NoSuchProviderException(e);
    } catch (ClassNotFoundException e) {
      throw new NoSuchProviderException(e);
    }
  }
}

