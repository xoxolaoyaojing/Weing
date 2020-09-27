package com.example.secuber.curve102.ecc;

public class testfield {
	static int arrayLength=8;
	static long full4plusone[]=new long[]{	0x80000000L};
	static long null32[]=new long[]{	0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000};
	static long null64[]=new long[]{	0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000};
	static long one16[]=new long[]{	0x00000001L,0x00000000L,0x00000000L,0x00000000L};
	static long one[]=new long[]{	0x00000001,0x00000000,0x00000000,0x00000000,
						0x00000000,0x00000000,0x00000000,0x00000000};
	static long one64[]=new long[]{	0x00000001,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000};
	static long one128[]=new long[]{	0x00000001,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000};
	static long two16[]=new long[]{	0x00000002L,0x00000000l,0x00000000l,0x00000000l};
	static long two[]=new long[]{	0x00000002,0x00000000,0x00000000,0x00000000,
						0x00000000,0x00000000,0x00000000,0x00000000};
	static long two64[]=new long[]{	0x00000002,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000};
	static long two128[]=new long[]{	0x00000002,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000};
	static long three[]=new long[]{	0x00000003,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000};
	static long four[]=new long[]{0x00000004,0x00000000,0x00000000,0x00000000,
						0x00000000,0x00000000,0x00000000,0x00000000};
	static long four64[]=new long[]{	0x00000004,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000};
	static long six[]=new long[]{	0x00000006,0x00000000,0x00000000,0x00000000,
						0x00000000,0x00000000,0x00000000,0x00000000};
	static long eight[]=new long[]{	0x00000008,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000};
	static long full[]=new long[]{ 	0xFFFFFFFFL,0xFFFFFFFFL,0xFFFFFFFFL,0xFFFFFFFFL,
							0xFFFFFFFFL,0xFFFFFFFFL,0xFFFFFFFFL,0xFFFFFFFFL};

	//00000000fffffffeffffffffffffffffffffffff000000000000000000000001_16
	//resultFullAdd=p-2^192
	static long resultFullAdd[]=new long[]{	0x76CB2F8DL, 0xE97284DFL, 0x5FF0CE7EL, 0x0BBC9FE6L,
						0x1806CFA3L, 0x70ECE22AL, 0x6C27A0D7L, 0xAC785E49L};
	static long primeMinusOne[]=new long[]{	0x8934D072L, 0x168D7B20L, 0xA00F3181L, 0xF4436019L,
						0xE7F9305CL, 0x8F131DD5L, 0x93D85F28L, 0x5387A1B6L};
	//resultFullAdd+primeMinusOne=2^256-1
	static long prime2MinusOne[]=new long[]{0x6E7313A8L,  0xB9BA30C0L,  0x212499E2L,  0xBBE039E1L,  0xA54A0F21L,  0x3DAED4CEL , 0x689F497BL,  0x6BBCDAC4L,  0x8FD6F941L , 0xDE979B7DL , 
	  0x3F063297L , 0xC507129AL , 0xF2DC3D3DL , 0x5E47D14CL,  0x58956415L,   0x1B413AB8L};
	static long resultDouble2Mod[]=new long[]{0x6E7313A7L,  0xB9BA30C0L,  0x212499E2L,  0xBBE039E1L,  0xA54A0F21L,  0x3DAED4CEL , 0x689F497BL,  0x6BBCDAC4L,  0x8FD6F941L , 0xDE979B7DL , 
	  0x3F063297L , 0xC507129AL , 0xF2DC3D3DL , 0x5E47D14CL,  0x58956415L,   0x1B413AB8L};
	//=2*(q-1)
	static long resultDoubleMod[]=new long[]{ 0x8934D071L, 0x168D7B20L, 0xA00F3181L, 0xF4436019L,
						0xE7F9305CL, 0x8F131DD5L, 0x93D85F28L, 0x5387A1B6L};
	//=(q-1)^2
	//5C0972C4  8C9F3A7F  E10636E0  D35979AD  D557AE67  1F889922    40EE8B2A  C4AD9757  
	//8FD6F940  DE979B7D  3F063297  C507129A    F2DC3D3D  5E47D14C  58956415  1B413AB8
	static long resultQuadMod[]=new long[]{	0x5C0972C4L,0x8C9F3A7FL,0xE10636E0L,0xD35979ADL,
									0xD557AE67L,0x1F889922L,0x40EE8B2AL,0xC4AD9757L,
									0x8FD6F940L,0xDE979B7DL,0x3F063297L,0xC507129AL,
									0xF2DC3D3DL,0x5E47D14CL,0x58956415L,0x1B413AB8L};

	//resultFullAdd+primeMinusOne=2^256-1

	//00000002fffffffffffffffffffffffefffffffdffffffff0000000000000002_16
	static long resultFullMod[]=new long[]{ 	0x00000002L,0x00000000L,0xFFFFFFFFL,0xFFFFFFFDL,
									0xFFFFFFFEL,0xFFFFFFFFL,0xFFFFFFFFL,0x00000002L};
	//r-1
	  static long orderMinusOne[]=new long[]{0x00000000L, 0x00000000L, 0x00000000L, 0x80000040L};
	  static long orderResultDoubleMod[]=new long[]{0xFFFFFFFFL, 0xFFFFFFFFL,0xFFFFFFFFL, 0x8000003FL};

	   static long ecc_order_m[]=new long[]{0x00000001L, 0x00000000L, 0x00000000L, 0x80000040L,
						0x00000000L};
	//FFFFFFFF  FFFFFFFF  FFFFFFFF  7FFFFFBF  FFFFFFFF  FFFFFFFF FFFFFFFF  FFFFFFFF
	  static long ecc_order_r[]=new long[]{0xFFFFFFFFL, 0xFFFFFFFFL, 0xFFFFFFFFL, 0x7FFFFFBFL};
	  static  long[] ecc_prime_m = new long[] {0x8934D073L, 0x168D7B20L, 0xA00F3181L, 0xF4436019L,
				0xE7F9305CL, 0x8F131DD5L, 0x93D85F28L, 0x5387A1B6L,0x00000000L};			
	/* This is added after an static int addition if the answer has a carry in MSB*/
	//76CB2F8D  E97284DF  5FF0CE7E 0BBC9FE6  1806CFA3  70ECE22A 6C27A0D7  AC785E49
	  static  long[] ecc_prime_r= new long[]{0x76CB2F8DL, 0xE97284DFL, 0x5FF0CE7EL, 0x0BBC9FE6L,
				0x1806CFA3L, 0x70ECE22AL, 0x6C27A0D7L, 0xAC785E49L};
	static long temp0[]=new long[4];
	static long temp[]=new long[8];
	static long temp2[]=new long[16];
	static long temp3[]=new long[32];
	
	
	static void nullEverything(){
		for(int i=0;i<32;i++)
		{
			if(i<4)temp0[i]=0;
			if(i<8)temp[i]=0;
			if(i<16)temp2[i]=0;
			temp3[i]=0;
		}
	}
	static void testassert(boolean a){
		if(!a){ System.out.println("wrong");
		System.exit(0);};
	}
	static void fieldAddTest(){
		System.out.printf("ecc.ecc_isSame(one, one, arrayLength)=%b\n",ecc.ecc_isSame(one, one, arrayLength));
		testassert(ecc.ecc_isSame(one, one, arrayLength));
		ecc.ecc_fieldAdd(one, null32, ecc.ecc_prime_r, temp);
		System.out.printf("ecc.ecc_isSame(temp, one, arrayLength)=%b\n",ecc.ecc_isSame(temp, one, arrayLength));
		testassert(ecc.ecc_isSame(temp, one, arrayLength));
		nullEverything();
		ecc.ecc_fieldAdd(one, one, ecc.ecc_prime_r, temp);
		System.out.printf("ecc.ecc_isSame(temp, two, arrayLength)=%b\n",ecc.ecc_isSame(temp, two, arrayLength));
		testassert(ecc.ecc_isSame(temp, two, arrayLength));
		nullEverything();
		ecc.ecc_add(full, one, temp, 8);
		System.out.printf("ecc.ecc_isSame(null32, temp, arrayLength)=%b\n",ecc.ecc_isSame(null32, temp, arrayLength));
		
		testassert(ecc.ecc_isSame(null32, temp, arrayLength));
		nullEverything();
		ecc.ecc_fieldAdd(full, one, ecc.ecc_prime_r, temp);
		System.out.printf("ecc.ecc_isSame(temp, resultFullAdd, arrayLength)=%b\n",ecc.ecc_isSame(temp, resultFullAdd, arrayLength));
		testassert(ecc.ecc_isSame(temp, resultFullAdd, arrayLength));
	}

	static void fieldSubTest(){
		testassert(ecc.ecc_isSame(one, one, arrayLength));
		ecc.ecc_fieldSub(one, null32, ecc.ecc_prime_m, temp);
		testassert(ecc.ecc_isSame(one, temp, arrayLength));
		nullEverything();
		ecc.ecc_fieldSub(one, one, ecc.ecc_prime_m, temp);
		testassert(ecc.ecc_isSame(null32, temp, arrayLength));
		nullEverything();
		ecc.ecc_fieldSub(null32, one, ecc.ecc_prime_m, temp);
		System.out.printf("ecc.ecc_isSame(primeMinusOne, temp, arrayLength)=%b\n",ecc.ecc_isSame(primeMinusOne, temp, arrayLength));
		testassert(ecc.ecc_isSame(primeMinusOne, temp, arrayLength));
	}

	static void  fieldMultTest(){
		ecc.ecc_fieldMult(one, null32, temp2, arrayLength);
		System.out.printf("ecc.ecc_isSame(temp2, null64, arrayLength * 2)=%b\n",ecc.ecc_isSame(temp2, null64, arrayLength* 2));
		
		testassert(ecc.ecc_isSame(temp2, null64, arrayLength * 2));
		nullEverything();
		ecc.ecc_fieldMult(one, two, temp2, arrayLength);
		System.out.printf("ecc.ecc_isSame(temp2, two64, arrayLength * 2)=%b\n",ecc.ecc_isSame(temp2, two64, arrayLength* 2));
		
		testassert(ecc.ecc_isSame(temp2, two64, arrayLength * 2));
		nullEverything();
		ecc.ecc_fieldMult(two, two, temp2, arrayLength);
		System.out.printf("ecc.ecc_isSame(temp2, four64, arrayLength * 2)=%b\n",ecc.ecc_isSame(temp2, four64, arrayLength* 2));
		
		testassert(ecc.ecc_isSame(temp2, four64, arrayLength * 2));
		nullEverything();
		ecc.ecc_fieldMult(primeMinusOne, primeMinusOne, temp2, arrayLength);
		test_helper.ecc_printNumber(temp2, 2*arrayLength);
		test_helper.ecc_printNumber(resultQuadMod, 2*arrayLength);
		System.out.printf("ecc.ecc_isSame(temp2, resultQuadMod, arrayLength * 2)=%b\n",ecc.ecc_isSame(temp2, resultQuadMod, arrayLength* 2));
		
		testassert(ecc.ecc_isSame(temp2, resultQuadMod, arrayLength * 2));
		nullEverything();
		ecc.ecc_fieldInv(two, ecc.ecc_prime_m, ecc.ecc_prime_r, temp);
		ecc.ecc_fieldMult(temp, two, temp2, arrayLength);
		ecc.ecc_fieldModP(temp, temp2,arrayLength * 2);
		testassert(ecc.ecc_isSame(temp, one, arrayLength));
	}

	static void  fieldModPTest(){
		
		ecc.ecc_fieldModP(temp, one64,arrayLength * 2);
		testassert(ecc.ecc_isSame(temp, one, arrayLength));
		nullEverything();
		
		System.out.printf("primeMinusOne=");
		test_helper.ecc_printNumber(primeMinusOne, arrayLength);
		ecc.ecc_fieldMult(two, primeMinusOne, temp2, arrayLength);
		System.out.printf("primeMinusOne*2=");
		test_helper.ecc_printNumber(temp2, 2*arrayLength);
		ecc.ecc_fieldModP(temp, temp2,arrayLength * 2);
		System.out.printf("primeMinusOne*2(mod p)=");
		test_helper.ecc_printNumber(temp, arrayLength);
		System.out.printf("ecc.ecc_isSame(temp, resultDoubleMod, arrayLength)=%b\n",ecc.ecc_isSame(temp, resultDoubleMod, arrayLength));
		if(ecc.ecc_isSame(temp, resultDoubleMod, arrayLength))
			System.out.printf("we did it\n");
		
		
		testassert(ecc.ecc_isSame(temp, resultDoubleMod, arrayLength));
		nullEverything();
		System.out.printf("primeMinusOne=");
		test_helper.ecc_printNumber(primeMinusOne, arrayLength);
		ecc.ecc_fieldMult(primeMinusOne, primeMinusOne, temp2, arrayLength);
		System.out.printf("primeMinusOne^2=");
		test_helper.ecc_printNumber(temp2, 2*arrayLength);
		ecc.ecc_fieldModP(temp, temp2,arrayLength * 2);
		System.out.printf("primeMinusOne^2(mod p)=");
		test_helper.ecc_printNumber(temp, arrayLength);
		System.out.printf("ecc.ecc_isSame(temp, one, arrayLength)=%b\n",ecc.ecc_isSame(temp, one, arrayLength));
		
		if(ecc.ecc_isSame(temp, one, arrayLength))
			System.out.printf("we did it\n");
		testassert(ecc.ecc_isSame(temp, one, arrayLength));
		nullEverything();
	}
	static void  fieldModP2Test(){
		
		nullEverything();
		ecc.ecc_fieldModP2(temp2, one128,arrayLength * 4);
		testassert(ecc.ecc_isSame(temp2, one64, 2*arrayLength));
		nullEverything();
		ecc.ecc_fieldMult(two64, prime2MinusOne, temp3, 2*arrayLength);
		ecc.ecc_fieldModP2(temp2, temp3,arrayLength * 4);
		testassert(ecc.ecc_isSame(temp2, resultDouble2Mod, 2*arrayLength));
		nullEverything();
		ecc.ecc_fieldMult(prime2MinusOne, prime2MinusOne, temp3, 2*arrayLength);
		ecc.ecc_fieldModP2(temp2, temp3,arrayLength * 4);
		testassert(ecc.ecc_isSame(temp2, one64, 2*arrayLength));
		nullEverything();
	}
	static void  fieldModOTest(){
		//System.out.printf("fieldModOTest\n");

		ecc.ecc_fieldMult(orderMinusOne, orderMinusOne, temp, 4);
		//ecc_printNumber(temp,8);
		ecc.ecc_fieldModO(temp, temp0, arrayLength);
		//test_helper.ecc_printNumber(temp0,4);
		testassert(ecc.ecc_isSame(temp0, one16, 4));
		nullEverything();
		ecc.ecc_fieldModO(one64, temp, arrayLength * 2);
		testassert(ecc.ecc_isSame(temp, one, arrayLength));
		nullEverything();
		//ecc_fieldMult(two16, orderMinusOne, temp2, arrayLength);
		ecc.ecc_fieldMult(two16, orderMinusOne, temp, 4);
		ecc.ecc_fieldModO(temp, temp0, arrayLength);
		testassert(ecc.ecc_isSame(temp0, orderResultDoubleMod, 4));
		nullEverything();
	}
	static void  fieldInvTest(){
		nullEverything();
		System.out.printf("2=========");
		test_helper.ecc_printNumber(two,8);
		System.out.printf("mod=========");
		test_helper.ecc_printNumber(ecc.ecc_prime_m,8);
		ecc.ecc_fieldInv(two, ecc.ecc_prime_m, ecc.ecc_prime_r, temp);
		System.out.printf("1/2=========");
		test_helper.ecc_printNumber(temp,8);
		test_helper.ecc_printNumber(temp2,16);
		ecc.ecc_fieldMult(temp, two, temp2, arrayLength);
		test_helper.ecc_printNumber(temp2,16);
		System.out.printf("2*(1/2)=========");
		ecc.ecc_fieldModP(temp, temp2,arrayLength * 2);
		test_helper.ecc_printNumber(temp,8);
		testassert(ecc.ecc_isSame(one, temp, arrayLength));
		nullEverything();
		ecc.ecc_fieldInv(eight, ecc.ecc_prime_m, ecc_prime_r, temp);
		ecc.ecc_fieldMult(temp, eight, temp2, arrayLength);
		ecc.ecc_fieldModP(temp, temp2,arrayLength * 2);
		testassert(ecc.ecc_isSame(one, temp, arrayLength));
		nullEverything();
		ecc.ecc_fieldInv(three, ecc_prime_m, ecc_prime_r, temp);
		ecc.ecc_fieldMult(temp, three, temp2, arrayLength);
		ecc.ecc_fieldModP(temp, temp2,arrayLength * 2);
		testassert(ecc.ecc_isSame(one, temp, arrayLength));
		nullEverything();
		ecc.ecc_fieldInv(six, ecc_prime_m, ecc_prime_r, temp);
		ecc.ecc_fieldMult(temp, six, temp2, arrayLength);
		ecc.ecc_fieldModP(temp, temp2,arrayLength * 2);
		testassert(ecc.ecc_isSame(one, temp, arrayLength));
		nullEverything();
		ecc.ecc_fieldInv(primeMinusOne, ecc_prime_m, ecc_prime_r, temp);
		ecc.ecc_fieldMult(temp, primeMinusOne, temp2, arrayLength);
		ecc.ecc_fieldModP(temp, temp2,arrayLength * 2);
		testassert(ecc.ecc_isSame(one, temp, arrayLength));
	}
	static void  fieldInv4Test(){
		nullEverything();
		ecc.ecc_fieldInv4(two16, ecc_order_m, ecc_order_r, temp0);
		System.out.printf("1/2=");
		test_helper.ecc_printNumber(temp0,4);
		ecc.ecc_fieldMult(temp0, two16, temp, 4);
		System.out.printf("2*1/2=");
		test_helper.ecc_printNumber(temp,8);
		ecc.ecc_fieldModO(temp, temp0,arrayLength );
		System.out.printf("2*1/2(MOD O)=");
		test_helper.ecc_printNumber(temp0,4);
		test_helper.ecc_printNumber(one16,4);
		testassert(ecc.ecc_isSame(one16, temp0, 4));
	}
	// void randomStuff(){

	// }

	static public int basictest()
	{
	//ecc_printNumber(primeMinusOne,8);
		
		nullEverything();
		fieldAddTest();
		nullEverything();
		fieldSubTest();
		nullEverything();
		fieldMultTest();
		nullEverything();
		fieldModPTest();
		nullEverything();
		fieldModP2Test();
		nullEverything();
		fieldModOTest();
		
		
		nullEverything();
		ecc.fieldAddAndDivide_lenTest();		
		//System.out.printf("%s\n", "All Tests being in basictest!");
		nullEverything();
		fieldInvTest();
		nullEverything();
		//System.out.printf("%s\n", "All Tests being in basictest!");
		fieldInv4Test();
		//rShiftTest();
		//isOneTest();
		System.out.printf("%s\n", "All Tests succesfull in basictest!");
		return 0;
	}

}
