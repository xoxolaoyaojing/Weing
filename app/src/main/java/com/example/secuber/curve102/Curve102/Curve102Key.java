package com.example.secuber.curve102.Curve102;

import com.example.secuber.curve102.ecc.EccPoint;

public class Curve102Key {

  private EccPoint key;

  public Curve102Key(long[] x, long[] y)
  {
    this(new EccPoint(x,y));
  }

  public Curve102Key(EccPoint key)
  {
    this.key = key;
  }

  public Curve102Key(byte[] key)
  {
    this.key = new EccPoint(key);
  }

  public String getString()
  {
    return key.getString();
  }

  public EccPoint getKey()
  {
    return key;
  }
  
  public byte[] getBytes()
  {
    return key.getBytes();
  }

}
