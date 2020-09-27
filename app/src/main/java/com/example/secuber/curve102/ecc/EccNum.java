package com.example.secuber.curve102.ecc;

import com.example.secuber.curve102.util.Util;

public class EccNum{
  private long[] buffer;
  private int length;
  public EccNum()
  {
      buffer = new long[8];
      length = 4;
  }
  public EccNum(long[] buffer,int length)
  {
    this();
    System.arraycopy(buffer,0,this.buffer,0,length);
    this.length = length;
  }
  public EccNum(long[] buffer)
  {
    this();
    System.arraycopy(buffer,0,this.buffer,0,buffer.length);
    this.length = buffer.length;
  }
  public EccNum(byte[] buffer, int length)	//length :
						//      16 for number, 32 for coordinate of a point
  {
    this();
    byte[] bufferBytes = new byte[32];
    long[] bufferLong  = new long[8];
    
    System.arraycopy(buffer,0,bufferBytes,0,length);
    
    byte[] tmp = new byte[8];
    
    for(int i=0;i<length/4;i++) {
      System.arraycopy(bufferBytes,i*4,tmp,0,4);
      bufferLong[i] = Util.byte2long(tmp);
    }
    
    System.arraycopy(bufferLong,0,this.buffer,0,length/4);
    this.length = length/4;
  }
  public String getString()
  {
    String strBuffer = new String();
    for(int i = length-1; i >= 0;i--){
      strBuffer += Long.toHexString(buffer[i]&0x0ffffffffL);
    }
    return strBuffer;
  }
  public int getBytes(byte[] out)
  {
    long[] keyLong =  new long[8];
    System.arraycopy(buffer,0,keyLong,0,this.length);
    byte[] tmp;
    for(int i=0;i<this.length;i++) {
      tmp = Util.long2byte(keyLong[i]);
      System.arraycopy(tmp,0,out,i*4,4);
    }
    return getLength()*4;
  }
  public long[] getBuffer()
  {
    return buffer;
  }
  public int getLength()
  {
    return length;
  }
  
  public static EccNum generateRandomNum()
  {
      EccNum num = new EccNum();
      ecc.ecc_setRandomO(num.buffer,4);
      num.length = 4;
      return num;
  }

}
