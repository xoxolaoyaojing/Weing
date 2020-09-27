package com.example.secuber.curve102.ecc;

import java.util.Random;

public class test_helper {
	static public void ecc_printNumber(long[] x, int numberLength){ //here the values are turned to MSB!
		int n;

		for(n = numberLength - 1; n >= 0; n--){
			System.out.printf("%08x",x[n]);
			//printf("%08x", x[n]);
		}
		//printf("\n");
		System.out.printf("\n");
	}

	static public void ecc_setRandom(long[] secret){
		int i;
		Random r = new Random();
		
		for (i = 0; i < ecc.arrayLength; ++i)
		{
			secret[i] =r.nextInt();// rand();
		}
	}
	static public void ecc_setRandom_len(long[] secret,int  length){
		int i;
		Random r = new Random();
		for (i = 0; i < length; ++i)
		{
			secret[i] = r.nextInt();
		}
	}
}
