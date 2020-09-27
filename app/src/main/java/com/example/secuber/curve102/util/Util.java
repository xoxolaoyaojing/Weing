package com.example.secuber.curve102.util;

public class Util {

	public static byte[] long2byte(long source)
	{
		long tmp = source;
		byte[] result = new byte[8];
		for(int i = 0;i<8;i++){
			result[i] = new Long(tmp&0xff).byteValue();
			tmp = tmp>>8;
		}
		return result;
	}

	public static long byte2long(byte[] source)
	{
		byte[] tmp = new byte[8];
		System.arraycopy(source,0,tmp,0,8);
		long result = 0;
		for(int i=7;i>=0;i--){
			result = result << 8;
			result = result | ((long)tmp[i]&0xff);
		}
		return result;
	}
}
