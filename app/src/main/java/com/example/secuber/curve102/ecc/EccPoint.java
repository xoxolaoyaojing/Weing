package com.example.secuber.curve102.ecc;

import com.example.secuber.curve102.util.Util;

public class EccPoint{

  protected EccNum x;
  protected EccNum y;

  public EccPoint()
  {
    this(new long[8], new long[8]);
  }
  public EccPoint(long[] x, long[] y)
  {
    this(new EccNum(x), new EccNum(y));
  }
  public EccPoint(EccNum x,EccNum y)
  {
    this.x = x;
    this.y = y;
  }
  public EccPoint(byte[] xBytes, byte[] yBytes)
  {
    this(new EccNum(xBytes, 32), new EccNum(yBytes, 32));
  }
  public EccPoint(byte[] pointBytes)
  {
    byte[] xBytes = new byte[32];
    byte[] yBytes = new byte[32];
    System.arraycopy(pointBytes,0,xBytes,0,32);
    System.arraycopy(pointBytes,32,yBytes,0,32);
    this.x = new EccNum(xBytes, 32);
    this.y = new EccNum(yBytes, 32);
  }
  
  public byte[] getBytes()
  {
    byte[] keyBytes = new byte[64];
    byte[] xBytes = new byte[32];
    byte[] yBytes = new byte[32];
    x.getBytes(xBytes);
    y.getBytes(yBytes);
    System.arraycopy(xBytes,0,keyBytes,0,32);
    System.arraycopy(yBytes,0,keyBytes,32,32);
    return keyBytes;
  }
  public String getString()
  {
    return "("+x.getString()+","+y.getString()+")";
  }
  
  public long[] getX()
  {
    return x.getBuffer();
  }
  public long[] getY()
  {
    return y.getBuffer();
  }
  
  public byte[] getXBytes()
  {
    byte[] xBytes = new byte[32];
    x.getBytes(xBytes);
    return xBytes;
  }
  public byte[] getYBytes()
  {
    byte[] yBytes = new byte[32];
    y.getBytes(yBytes);
    return yBytes;
  }

  public static final EccPoint generateRandomPoint()
  {
      EccPoint p = new EccPoint();
      ecc.ecc_setRandomPoint(p.x.getBuffer(),p.y.getBuffer());
      System.out.println(p.x.getBuffer().length+","+p.y.getBuffer().length);
      return p;
  }

  public static final EccPoint scalarMultiplication(EccPoint p, EccNum num)
  {
    EccPoint result = new EccPoint();
    ecc.ecc_ec_mult_len(p.x.getBuffer(),
                        p.y.getBuffer(),
                        num.getBuffer(),
                        4,
                        result.x.getBuffer(),
                        result.y.getBuffer());
    return result;
  }
  public static final EccFeElement pairing(EccPoint p,EccPoint q)
  {
      EccFeElement result = new EccFeElement();
      ecc.a_pairing_proj(result.x.getBuffer(),
                         result.y.getBuffer(),
                         p.x.getBuffer(),
                         p.y.getBuffer(),
                         q.x.getBuffer(),
                         q.y.getBuffer());
      return result;
  }  
  
  public static final EccPoint fromHash(byte[] x)
    throws InvalidHashValueException
  {
    if(x.length < 32) {
      // String value = new String();
      // for(int i=0;i<x.length;i++)
      //   value += Byte.toHexString(x[i]&0xff);
      throw new InvalidHashValueException("invalid hashed value: too short!");
    }
    long[] xLong = new long[8];
    for(int i=0;i<8;i++) {
      byte[] tmp = new byte[8];
      System.arraycopy(x,i*4,tmp,0,4);
      xLong[i] = Util.byte2long(tmp);
    }
    long[] xout = new long[8];
    long[] yout = new long[8];
    ecc.from_hash(xout,yout,xLong,8);
    return new EccPoint(xout,yout);
  }
  
  public static final EccPoint fromHash2(byte[] x)
    throws InvalidHashValueException
  {
    if(x.length < 32) {
      // String value = new String();
      // for(int i=0;i<x.length;i++)
      //   value += Byte.toHexString(x[i]&0xff);
      throw new InvalidHashValueException("invalid hashed value: too short!");
    }
    long[] xLong = new long[8];
    for(int i=0;i<8;i++) {
      byte[] tmp = new byte[8];
      System.arraycopy(x,i*4,tmp,0,4);
      xLong[i] = Util.byte2long(tmp);
    }
    ecc.ecc_fieldModO(xLong,xLong,4);
    
    long[] xout = new long[8];
    long[] yout = new long[8];
    
    EccPoint basePoint = new EccPoint(ecc.BasePointx,ecc.BasePointy);
    EccPoint point = EccPoint.scalarMultiplication(basePoint,new EccNum(xLong));
    return point;
  }
}
