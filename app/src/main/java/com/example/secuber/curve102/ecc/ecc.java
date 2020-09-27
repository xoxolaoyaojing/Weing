package com.example.secuber.curve102.ecc;

public class ecc {


        public static long[] full4plusone= new long[]{	0x80000000L};
	public static long[] null32= new long[]{	0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000};
	public static long[] null64= new long[]{	0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000};
	public static long[] one16= new long[]{	0x00000001,0x00000000,0x00000000,0x00000000};
	public static long[] one= new long[]{	0x00000001,0x00000000,0x00000000,0x00000000,
						0x00000000,0x00000000,0x00000000,0x00000000};
	public static long[] one64= new long[]{	0x00000001,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000};
	public static long[] one128= new long[]{	0x00000001,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000};
	public static long[] two16= new long[]{	0x00000002,0x00000000,0x00000000,0x00000000};
	public static long[] two= new long[]{	0x00000002,0x00000000,0x00000000,0x00000000,
						0x00000000,0x00000000,0x00000000,0x00000000};
	public static long[] two64= new long[]{	0x00000002,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000};
	public static long[] two128= new long[]{	0x00000002,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000};
	public static long[] three= new long[]{	0x00000003,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000};
	public static long[] four= new long[]{0x00000004,0x00000000,0x00000000,0x00000000,
						0x00000000,0x00000000,0x00000000,0x00000000};
	public static long[] four64= new long[]{	0x00000004,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000};
	public static long[] six= new long[]{	0x00000006,0x00000000,0x00000000,0x00000000,
						0x00000000,0x00000000,0x00000000,0x00000000};
	public static long[] eight= new long[]{	0x00000008,0x00000000,0x00000000,0x00000000,
							0x00000000,0x00000000,0x00000000,0x00000000};
	public static long[] full= new long[]{ 	0xFFFFFFFFL,0xFFFFFFFFL,0xFFFFFFFFL,0xFFFFFFFFL,
							0xFFFFFFFFL,0xFFFFFFFFL,0xFFFFFFFFL,0xFFFFFFFFL};

	//00000000fffffffeffffffffffffffffffffffff000000000000000000000001_16
	//resultFullAdd=p-2^192
	public static long[] resultFullAdd= new long[]{	0x76CB2F8DL, 0xE97284DFL, 0x5FF0CE7EL, 0x0BBC9FE6L,
						0x1806CFA3L, 0x70ECE22AL, 0x6C27A0D7L, 0xAC785E49L};
	public static long[] primeMinusOne= new long[]	{	0x8934D072L, 0x168D7B20L, 0xA00F3181L, 0xF4436019L,
						0xE7F9305CL, 0x8F131DD5L, 0x93D85F28L, 0x5387A1B6L};
	//resultFullAdd+primeMinusOne=2^256-1
	public static long[] prime2MinusOne= new long[]{0x6E7313A8L,  0xB9BA30C0L,  0x212499E2L,  0xBBE039E1L,  0xA54A0F21L,  0x3DAED4CEL , 0x689F497BL,  0x6BBCDAC4L,  0x8FD6F941L , 0xDE979B7DL , 
	  0x3F063297L , 0xC507129AL , 0xF2DC3D3DL , 0x5E47D14CL,  0x58956415L,   0x1B413AB8L};
	public static long[] resultDouble2Mod= new long[]{0x6E7313A7L,  0xB9BA30C0L,  0x212499E2L,  0xBBE039E1L,  0xA54A0F21L,  0x3DAED4CEL , 0x689F497BL,  0x6BBCDAC4L,  0x8FD6F941L , 0xDE979B7DL , 
	  0x3F063297L , 0xC507129AL , 0xF2DC3D3DL , 0x5E47D14CL,  0x58956415L,   0x1B413AB8L};
	//=2*(q-1)
	public static long[] resultDoubleMod= new long[]{ 0x8934D071L, 0x168D7B20L, 0xA00F3181L, 0xF4436019L,
						0xE7F9305CL, 0x8F131DD5L, 0x93D85F28L, 0x5387A1B6L};
	//=(q-1)^2
	//5C0972C4  8C9F3A7F  E10636E0  D35979AD  D557AE67  1F889922    40EE8B2A  C4AD9757  
	//8FD6F940  DE979B7D  3F063297  C507129A    F2DC3D3D  5E47D14C  58956415  1B413AB8
	public static long[] resultQuadMod= new long[]{	0x5C0972C4L,0x8C9F3A7FL,0xE10636E0L,0xD35979ADL,
									0xD557AE67L,0x1F889922L,0x40EE8B2AL,0xC4AD9757L,
									0x8FD6F940L,0xDE979B7DL,0x3F063297L,0xC507129AL,
									0xF2DC3D3DL,0x5E47D14CL,0x58956415L,0x1B413AB8L};

	//resultFullAdd+primeMinusOne=2^256-1

	//00000002fffffffffffffffffffffffefffffffdffffffff0000000000000002_16
	public static long[] resultFullMod= new long[]{ 	0x00000002L,0x00000000L,0xFFFFFFFFL,0xFFFFFFFDL,
									0xFFFFFFFEL,0xFFFFFFFFL,0xFFFFFFFFL,0x00000002L};
	//r-1
	  public static long[] orderMinusOne= new long[]{0x00000000L, 0x00000000L, 0x00000000L, 0x80000040L};
	  public static long[] orderResultDoubleMod= new long[] {0xFFFFFFFFL, 0xFFFFFFFFL,0xFFFFFFFFL, 0x8000003FL};

	   //public static long[] ecc_order_m= new long[]{0x00000001L, 0x00000000L, 0x00000000L, 0x80000040L,
						//0x00000000L};
	//FFFFFFFF  FFFFFFFF  FFFFFFFF  7FFFFFBF  FFFFFFFF  FFFFFFFF FFFFFFFF  FFFFFFFF
	  //public static long[] ecc_order_r= new long[]{0xFFFFFFFFL, 0xFFFFFFFFL, 0xFFFFFFFFL, 0x7FFFFFBFL};
	  
	  
	  


static long BasePointx[]=new long[]{	0xC4E22414L, 0x5143BB7DL, 0xC33BA227L, 0x872306C5L,
				    0x6864EC5CL, 0xFE385081L, 0x0896487CL, 0x0CB1020EL};


static long BasePointy[]=new long[]{	 0xB5E68688L, 0x2B51CCB7L, 0xDDE87611L, 0xFB21CE28L,
				    0x6740B1CEL, 0x451BBAA6L, 0xC6E3CDE8L, 0x0B502B8FL};

//24914319561618939949143398183432869342943792493368500429451549096353001961187
//7770F6E3  8A61B4F8  E1FC2C9E  78EE597F   3F34B44E  64C796D2  94DC7895  37150151
static long Sx[]=new long[]{	0x7770F6E3L,  0x8A61B4F8L,  0xE1FC2C9EL,  0x78EE597FL, 
					0x3F34B44EL,  0x64C796D2L,  0x94DC7895L,  0x37150151L};

//11541784020726938073157703058705977213157168936787769247741994129545496166768
//1DD90170  891A14E3  13B06274  87A727DC  01F4059F  DDDB69FF  CBBD952F  19846B12
static long Sy[]=new long[]{	0x1DD90170L,  0x891A14E3L,  0x13B06274L,  0x87A727DCL , 
					0x01F4059FL,  0xDDDB69FFL , 0xCBBD952FL , 0x19846B12L};

//963030673534016715447799053863190451614713309289662410111800248236791023608
//ACABC7F8  A4FF7E0D  C1B963F4  4510ADAE    6B1CF0D1  D3E395DC  F9C97525  02210E58
static long Tx[]=new long[]{	0xACABC7F8L , 0xA4FF7E0DL, 0xC1B963F4L,  0x4510ADAEL,
					0x6B1CF0D1L , 0xD3E395DCL,  0xF9C97525L,  0x02210E58L};

//272325064237148638928476166944486938673032039249665461547325241050168914595
//33F7Dint3  9FC96EB8  B97C6CF9  01D72A38    DCCAAD34  B922BA54  08550D47  009A216A
static long Ty[]=new long[]{	0x3F7D72A3L,  0x9FC96EB8L,  0xB97C6CF9L,  0x01D72A38L,
				0xDCCAAD34L,  0xB922BA54L,  0x08550D47L,  0x009A216AL};

//1D916617  3807504A  F0540D89  E840E85F  C301DED3  98A06A0D    882E0395  1E0F03E6 
static long secret[]=new long[]{	0x1D916617L,  0x3807504AL , 0xF0540D89L,  0xE840E85FL,
			0xC301DED3L,  0x98A06A0DL,    0x882E0395L,  0x1E0F03E6L };
//6197877625728762226167528805730824930605602042481172692102760251359226703746
//5D0F2F82  126380E2  15B838EB  8E4398C9   C7232079  AEB18ED1  1B094EA6  0DB3DFDA
static long resultAddx[]=new long[]{	0x5D0F2F82L,  0x126380E2L,  0x15B838EBL,  0x8E4398C9L,
							0xC7232079L,  0xAEB18ED1L,  0x1B094EA6L,  0x0DB3DFDAL};
//37134009573953335676315630442564329808707048444975307426259247052082278487402
//D0A6D56A  337165DC  80D8B319  F466D8D7   07009274  11A036F1  1D2AB75C  52191AC7
static long resultAddy[]=new long[]{	0xD0A6D56AL,  0x337165DCL,  0x80D8B319L,  0xF466D8D7L,  
 						 0x07009274L,  0x11A036F1L,  0x1D2AB75CL,  0x52191AC7L};
//F0AA8D28  29D31837  9DB17B3F  F8C9CB41    DF4AA5E0  616CDB9E  2A6C422C  31833748
static long resultDoublex[]=new long[]{	0xF0AA8D28L,  0x29D31837L,  0x9DB17B3FL,  0xF8C9CB41L , 
					  0xDF4AA5E0L,  0x616CDB9EL,  0x2A6C422CL,  0x31833748L};
//CFDD442D  B8543550  2D739174  F12EAC44    30CB306F  2857E1B1  C8A11AAE  4D6DA758
static long resultDoubley[]=new long[]{	0xCFDD442DL,  0xB8543550L,  0x2D739174L,  0xF12EAC44L,
					0x30CB306FL,  0x2857E1B1L,  0xC8A11AAEL , 0x4D6DA758L};


//43500cc7 945b120b 03da1673 395f5b29 0bb7e502 9eb6e4df 44a4759b d318bc7d
static long resultMultx[]=new long[]{	0xd318bc7dL, 0x44a4759bL, 0x9eb6e4dfL, 0x0bb7e502L,
							0x395f5b29L, 0x03da1673L, 0x945b120bL, 0x43500cc7L};

///3e7b8140 5b63d02a 4ab5a7ee a304cf6f 6d8a2961 e191a48a d19d8bbe  53e3b0e9
static long resultMulty[]=new long[]{	0x53e3b0e9L, 0xd19d8bbeL, 0xe191a48aL, 0x6d8a2961L,
							0xa304cf6fL, 0x4ab5a7eeL, 0x5b63d02aL, 0x3e7b8140L};
//static  int ecdsaTestMessage[] = { 0x65637572, 0x20612073, 0x68206F66, 0x20686173, 0x69732061, 0x68697320, 0x6F2C2054, 0x48616C6C};

static  long ecdsaTestMessage[] = { 0x69732061L, 0x68697320L, 0x6F2C2054L, 0x48616C6CL};

//static  long ecdsaTestSecret[] = {0x94A949FA, 0x401455A1, 0xAD7294CA, 0x896A33BB, 0x7A80E714, 0x4321435B, 0x51247A14, 0x41C1CB6B};
static  long ecdsaTestSecret[] = {0x7A80E714L, 0x4321435BL, 0x51247A14L, 0x41C1CB6BL};

//static  long ecdsaTestRand1[] = { 0x1D1E1F20, 0x191A1B1C, 0x15161718, 0x11121314, 0x0D0E0F10, 0x090A0B0C, 0x05060708, 0x01020304};
static  long ecdsaTestRand1[] = {  0x0D0E0F10L, 0x090A0B0CL, 0x05060708L, 0x01020304L};
static  long ecdsaTestresultR1[] = { 0xC3B4035FL, 0x515AD0A6L, 0xBF375DCAL, 0x0CC1E997L, 0x7F54FDCDL, 0x04D3FECAL, 0xB9E396B9L, 0x515C3D6EL};
static  long ecdsaTestresultS1[] = { 0x5366B1ABL, 0x0F1DBF46L, 0xB0C8D3C4L, 0xDB755B6FL, 0xB9BF9243L, 0xE644A8BEL, 0x55159A59L, 0x6F9E52A6L};
//static  long ecdsaTestRand2[] = { 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 0xFFFFFFFF, 0x01FFFFFF};
static  long ecdsaTestRand2[] = {  0xFFFFFFFFL, 0xFFFFFFFFL, 0xFFFFFFFFL, 0x01FFFFFFL};
static  long ecdsaTestresultR2[] = { 0x14146C91L, 0xE878724DL, 0xCD4FF928L, 0xCC24BC04L, 0xAC403390L, 0x650C0060L, 0x4A30B3F1L, 0x9C69B726L};
static  long ecdsaTestresultS2[] = { 0x433AAB6FL, 0x808250B1L, 0xE46F90F4L, 0xB342E972L, 0x18B2F7E4L, 0x2DB981A2L, 0x6A288FA4L, 0x41CF59DBL};

	static public  void fun(long a[])
	{
		System.out.println("ecc");
	}
	public static int arrayLength=8;
	public static long[] ecc_prime_m = new long[] {0x8934D073L, 0x168D7B20L, 0xA00F3181L, 0xF4436019L,
			0xE7F9305CL, 0x8F131DD5L, 0x93D85F28L, 0x5387A1B6L,0x00000000L};			
/* This is added after an static int addition if the answer has a carry in MSB*/
//76CB2F8D  E97284DF  5FF0CE7E 0BBC9FE6  1806CFA3  70ECE22A 6C27A0D7  AC785E49
	public static long[] ecc_prime_r= new long[]{0x76CB2F8DL, 0xE97284DFL, 0x5FF0CE7EL, 0x0BBC9FE6L,
			0x1806CFA3L, 0x70ECE22AL, 0x6C27A0D7L, 0xAC785E49L};
//ecc_prime_m+ecc_prime_r=2^256

//3548765929707965840811802980037610084995053094252414572720281138154580669879
//45F7FBB8  D5AB8502  CAF19919  C382C79D    AE29AF8D  F0752C81  D29FE344  1095089D    00000003
	public static long[] ecc_prime_mu = new long[]{0x45F7FBB8L, 0xD5AB8502L, 0xCAF19919L, 0xC382C79DL,
			 0xAE29AF8DL, 0xF0752C81L, 0xD29FE344L, 0x1095089DL,
			 0x00000003L};
	public static int ecc_prime_k = 8;
//6E7313A9  B9BA30C0  212499E2  BBE039E1  A54A0F21  3DAED4CE  689F497B  6BBCDAC4  8FD6F941  DE979B7D  
//3F063297  C507129A  F2DC3D3D  5E47D14C  58956415    1B413AB8
	public static long[]  ecc_prime2_m= new long[]{0x6E7313A9L,  0xB9BA30C0L,  0x212499E2L,  0xBBE039E1L,  0xA54A0F21L,  0x3DAED4CEL , 0x689F497BL,  0x6BBCDAC4L,  0x8FD6F941L , 0xDE979B7DL , 
0x3F063297L , 0xC507129AL , 0xF2DC3D3DL , 0x5E47D14CL,  0x58956415L,   0x1B413AB8L, 0x00000000L};
//918CEC57  4645CF3F  DEDB661D  441FC61E    5AB5F0DE  C2512B31  9760B684  9443253B  
//702906BE  21686482  C0F9CD68  3AF8ED65  0D23C2C2  A1B82EB3  A76A9BEA  E4BEC547
	public static long[] ecc_prime2_r = new long[]{0x918CEC57L , 0x4645CF3FL,  0xDEDB661DL,  0x441FC61EL,    0x5AB5F0DEL,  0xC2512B31L,  0x9760B684L,  0x9443253BL  ,
			  0x702906BEL , 0x21686482L , 0xC0F9CD68L , 0x3AF8ED65L , 0x0D23C2C2L , 0xA1B82EB3L , 0xA76A9BEAL , 0xE4BEC547L};
//F4839C3F  B6E9B2BF  D1662115  6CD29672    96445ED3  B661F9A7  8174AA89  C2255C57  
//1F250B46  B4294DBD  CAC30404  5A7D11A0    901B054F  D2A95F4F  B214BC9A  64912B89    00000009
	public static long[] ecc_prime2_mu= new long[]{0xF4839C3FL,  0xB6E9B2BFL,  0xD1662115L,  0x6CD29672L ,   0x96445ED3L,  0xB661F9A7L,  0x8174AA89L,  0xC2255C57L , 
			  0x1F250B46L,  0xB4294DBDL,  0xCAC30404L,  0x5A7D11A0L ,   0x901B054FL,  0xD2A95F4FL,  0xB214BC9AL,  0x64912B89L,    0x00000009L};
	public static int ecc_prime2_k = 16;
//r=ecc_order_m
//00000001  00000000  00000000  80000040
//80000040  00000000  00000000  00000001
//2^127+2^102+1
	public static long[] ecc_order_m= new long[]{0x00000001L, 0x00000000L, 0x00000000L, 0x80000040L,
			0x00000000L};
//FFFFFFFF  FFFFFFFF  FFFFFFFF  7FFFFFBF  FFFFFFFF  FFFFFFFF FFFFFFFF  FFFFFFFF
	public static long[] ecc_order_r= new long[]{0xFFFFFFFFL, 0xFFFFFFFFL, 0xFFFFFFFFL, 0x7FFFFFBFL};
//ecc_order_m+ecc_order_r=2^256
//680564713559467927737970583832899878893   //1FFFFFEC  FFC00000  00007FFF  FFFFFF00   00000001
	public static long[] ecc_order_mu= new long[]{0x1FFFFFECL, 0xFFC00000L, 0x00007FFFL, 0xFFFFFF00L,
			 0x00000001L};
	public static int ecc_order_k = 4;


//5740500295301238846433925863331319721594466122870270304302756076435766649876
//C4E22414  5143BB7D  C33BA227    872306C5  6864EC5C  FE385081    0896487C  0CB1020E
	public static long[] ecc_g_point_x= new long[]{ 0xC4E22414L, 0x5143BB7DL, 0xC33BA227L, 0x872306C5L,
		    0x6864EC5CL, 0xFE385081L, 0x0896487CL, 0x0CB1020EL};
//5117089750909033429541088003235070891020469585317886957595145901085647341192
//B5E68688  2B51CCB7  DDE87611    FB21CE28  6740B1CE  451BBAA6   C6E3CDE8  0B502B8F
//0B502B8FC6E3CDE8451BBAA66740B1CEFB21CE28DDE876112B51CCB7B5E68688
	public static long[]  ecc_g_point_y= new long[]{ 0xB5E68688L, 0x2B51CCB7L, 0xDDE87611L, 0xFB21CE28L,
		    0x6740B1CEL, 0x451BBAA6L, 0xC6E3CDE8L, 0x0B502B8FL};

//222060320700642449943812747791145685108
//8934D074  168D7B20  A00F3181  A70F4319
	public static long[] phikonr= new long[]{0x8934D074L,  0x168D7B20L,  0xA00F3181L,  0xA70F4319L};

	static public void setZero(long A[], int length){
		//memset(A, 0x0, length[0][]  sizeof(int));
		int i=length;
		int j=0;
		for(j=0;j<i;j++)
		{
			A[j]=0;
		}
	}
	/*
	 * copy one array to another
	 */
	static public void copy(long from[], long to[], int length){
		//memcpy(to, from, length[0] * sizeof(int));
		int i=length;
		int j=0;
		for(j=0;j<i;j++)
		{
			to[j]=from[j];
		}
	}

	static public boolean isSame(long A[], long B[], int length){
		//result[0]=(!memcmp(A, B, length * sizeof(int)));
		int i=length;
		int j=0;
		for(j=0;j<i;j++)
		{
			if(A[j]!=B[j])
				{
				return false;
				}
		}
		return true;
	}

	//is A greater than B?
	static public int isGreater(long A[],long B[], int length){
		int i;
		for (i = length-1; i >= 0; --i)
		{
			if(A[i] > B[i])
				return 1;
				
			if(A[i] < B[i])
				return -1;
			
		}
		return 0;
	}
	static public int add( long x[], long y[], long result[], int length){
		long d = 0; //carry//need to examine,16-03-23
		int v = 0;
		for(v = 0;v<length;v++){
			//printf("%02x + %02x + %01x = ", x[v], y[v], d);
			d +=  x[v] + y[v];
			//System.out.printf("add:   %02x\n", d);
			result[v] = d&0xffffffffL;//WHY NOT OXFFFFFFFF, HAVE TESTED IT WILL FAIL? XING,16-03-29
			d = d>>32; //save carry
		d=d&0x1;
		}
		return (int)d;
	}

	static public int add_1( long x, long y, long result[]){
		long d = 0; //carry//need to examine,16-03-23
		int v = 0;
		for(v = 0;v<1;v++){
			//printf("%02x + %02x + %01x = ", x[v], y[v], d);
			d +=  x +  y;
			//printf("%02x\n", d);
			//result[v] = (int)d;  
			result[v] =  d&0xffffffffL;//xing,16-03-28
			d = d>>32; //save carry
		d=d&0x1;
		}
		return (int)d;
	}
	static public int sub(long x[],long y[], long result[], int length){
		long d = 0;
		int v;
		for(v = 0;v < length; v++){
			d = x[v]-y[v]-d;
			//System.out.printf("%d:d=%x\n",v,d);
			result[v] =( d&0x00000000ffffffffL);//xing,16-03-28
			//System.out.printf("-------%x\n",result[v]);
			//result[v] =(int)((d<<32)>>32);
			d = d>>32;
			d &= 0x1;
			
		}	
		return (int)d;
	}

	static public void rshiftby(long in[], int in_size, long out[], int out_size, int shift) {
		int i;

		for (i = 0; i < (in_size - shift) && i < out_size; i++)
			out[i] = in[i + shift];
		for (/* reuse i */; i < out_size; i++)
			out[i] = 0;
	}
	 
	static public int fieldAdd(long x[],long y[], long reducer[], long result[]){
		
		if(add(x, y, result, ecc.arrayLength)==1){ //add prime if carry is still set!
			long tempas[]= new long[8];
			setZero(tempas, 8);
			add(result, reducer, tempas, arrayLength);
			copy(tempas, result, arrayLength);
		}
		return 0;
	}

	static public int fieldSub(long x[], long y[],long modulus[], long result[]){
		if(sub(x, y, result, arrayLength)==1){ //add modulus if carry is set
			long tempas[]=new long[8];
			setZero(tempas, 8);
			add(result, modulus, tempas, arrayLength);//why not sub( modulus,result, tempas, arrayLength);?xing
			copy(tempas, result, arrayLength);
		}
		return 0;
	}
	static public void fieldSub_len(long x[], long y[],long modulus[], long result[],int length){
		if(sub(x, y, result, length)==1){ //add modulus if carry is set
			long tempas[]=new long[8];
			setZero(tempas, 8);
			add(result, modulus, tempas, length);//why not sub( modulus,result, tempas, arrayLength);?xing
			copy(tempas, result, length);
		}
		return ;
		}

	static public int fieldMult(long x[], long y[],long result[],int length)
		{
		int[] flag1=new int[length];
		int[] flag2=new int[length];;
		long temp[]=new long[length * 2];
		long tem[]=new long[2];
		long tem_result[]=new long[2];
		setZero(temp, length * 2);
		setZero(tem,2);
		setZero(tem_result,2);
		setZero(result, length * 2);
		int k, n,i;
		//long l[]=new long[4];
		long l=0;
		//setZero(l,4);
		/*for(n = 0; n < length; n++)
		{
			if(x[n]<0)
			{
				flag1[n]=1;
				x[n]=x[n]&0x7FFFFFFFFL;
				
			}else
				flag1[n]=0;
			if(y[n]<0)
			{
				flag2[n]=1;
				x[n]=x[n]&0x7FFFFFFFFL;
				
			}
			else
				flag2[n]=0;
		}*/
		for (k = 0; k < length; k++){
			for (n = 0; n < length; n++){ 
				
				l = (x[n]*y[k]);
				/*if(flag1[n]==1)	l[1] = y[k]*(0x80000000L);
				if(flag2[k]==1)	l[2] = x[n]*(0x80000000L);
				if((flag1[n]==1)&&(flag2[k]==1))l[3] = 0x4000000000000000L;
				*/
				//for(i=0;i<(2*length-2-k-n);i++)
					//System.out.printf("00000000");
			//System.out.printf("%08x\n", l);
				tem[0] = (l&0x00000000FFFFFFFFL);
				tem[1] = (l>>32);//if l>0, tem[1]'s high 8 is ffffffff after >>32, representing "-".
				tem[1] = tem[1]&0x00000000FFFFFFFFL;//so we need second &.
				//tem[2] = 
				//test_helper.ecc_printNumber(tem,2);
				tem_result[0]=result[n+k];
				tem_result[1]=result[n+k+1];
				//test_helper.ecc_printNumber(tem_result,2);
				//if(k+n<(length-1)*2)tem_result[2]=result[n+k+2];
				//add(&temp[n+k], &result[n+k], &result[n+k], (length * 2) - (n + k));//need to examine xing-16-03-25
				//if(k+n<(length-1)*2)add( tem,tem_result,tem_result,3);
				//else
				if(add( tem,tem_result,tem_result,2)==1)
					if(k+n<(length-1)*2)result[n+k+2]+=0x1;
				result[n+k]=tem_result[0];
				result[n+k+1]=tem_result[1];
				//test_helper.ecc_printNumber(tem_result,2);
				//if(k+n<(length-1)*2)result[n+k+2]=tem_result[2];
				//setZero(temp, (int)(length * 2));
				setZero(tem, 2);
				setZero(tem_result, 2);
			//test_helper.ecc_printNumber(result,2*length);
			}
		}
		return 0;
	}

	//TODO: maximum:
	//fffffffe00000002fffffffe0000000100000001fffffffe00000001fffffffe00000001fffffffefffffffffffffffffffffffe000000000000000000000001_16
	static public void fieldModO( long A[],long result[],int length)
	{
		// This is used for value q1 and q3
		long[] q1_q3= new long[5];
		// This is used for q2 and a temp var
		long[] q2_tmp= new long[10];
		int lengh1=length;
		
		//printf("who is modueld with length:%d\n",length);
	//ecc_printNumber(A,length);

		// return if the given value is smaller than the modulus
		if ( length== 4) {
			if(isGreater(A, ecc_order_m, 4) <= 0)
				{
			if (A != result)
			        copy(A, result, length);
			return;
			}
		}

		rshiftby(A, length, q1_q3, 5, ecc.ecc_order_k - 1);
	//ecc_printNumber(q1_q3,5);
		fieldMult(ecc_order_mu, q1_q3, q2_tmp, 5);
	//ecc_printNumber(q2_tmp,10);
		rshiftby(q2_tmp, 10, q1_q3, 4, ecc_order_k + 1);
	//ecc_printNumber(q1_q3,5);
		fieldMult(q1_q3, ecc_order_m, q2_tmp, 4);
	//ecc_printNumber(q2_tmp,10);
		
		sub(A, q2_tmp, q1_q3, 5);
		//test_helper.ecc_printNumber(q1_q3,5);
		copy(q1_q3,result,4);
	//test_helper.ecc_printNumber(result,4);
		while (isGreater(result, ecc.ecc_order_m, 4) >= 0){
			sub(result, ecc_order_m, result, 4);
		}
		//printf("result is ");
		//ecc_printNumber(result,5);
		}


	/**
	 * calculate the result = A mod p.
	 * n is the order of the eliptic curve.
	 * A and result could point to the same value
	 *
	 * A: input value (max size * 4 ints)
	 * result: result of modulo calculation (max 36 bytes)
	 * size: size of A
	 *
	 * This uses the Barrett modular reduction as described in the Handbook 
	 * of Applied Cryptography 14.42 Algorithm Barrett modular reduction, 
	 * see http://cacr.uwaterloo.ca/hac/about/chap14.pdf and 
	 * http://everything2.com/title/Barrett+Reduction
	 *
	 * b = 32 (bite size of the processor architecture)
	 * mu (ecc_order_mu) was precomputed in a java program
	 */
	 static public  void fieldModP2(long[] result, long[] A, int length) {
		// This is used for value q1 and q3
		long[] q1_q3= new long[17];
		// This is used for q2 and a temp var
		long[] q2_tmp=new long[34];
		//printf("who is modueld with length:%d\n",length);
	//ecc_printNumber(A,length);
		// return if the given value is smaller than the modulus
		if (length == 2*arrayLength &&isGreater(A, ecc_prime2_m, arrayLength*2) <= 0) {
			if (A != result)
			        copy(A, result, length);
			return;
		}

		rshiftby(A, length, q1_q3, 17, ecc_prime2_k - 1);
	//ecc_printNumber(q1_q3,9);
		fieldMult(ecc_prime2_mu, q1_q3, q2_tmp, 17);
	//ecc_printNumber(q2_tmp,18);
		rshiftby(q2_tmp, 34, q1_q3, 16, ecc_prime2_k + 1);
	//ecc_printNumber(q1_q3,9);
		fieldMult(q1_q3, ecc_prime2_m, q2_tmp, 16);
		//test_helper.ecc_printNumber(q2_tmp,18);
		sub(A, q2_tmp, q1_q3, 17);
		//test_helper.ecc_printNumber(q1_q3,9);
		copy(q1_q3,result,16);
	//test_helper.ecc_printNumber(result,8);
		while (isGreater(result, ecc_prime2_m, 16) >= 0)
		{
			sub(result, ecc_prime2_m,result, 16);
			}
		//printf("result is ");
		//ecc_printNumber(result,9);
	}

	static public void fieldModP(long[] result, long[] A,int length) {
		// This is used for value q1 and q3
		long[] q1_q3=new long[9];
		// This is used for q2 and a temp var
		long[]  q2_tmp=new long[18];
//		printf("who is modueld with length:%d\n",length);
	//ecc_printNumber(A,length);
		// return if the given value is smaller than the modulus
		//long[] offset=new long[1];
		if (length == arrayLength &&  isGreater(A, ecc_prime_m, arrayLength)<= 0) {
			if (A != result)
			        copy(A, result, length);
			return;
		}

		rshiftby(A, length, q1_q3, 9, ecc_prime_k - 1);
	//ecc_printNumber(q1_q3,9);
		fieldMult(ecc_prime_mu, q1_q3, q2_tmp, 9);
	//ecc_printNumber(q2_tmp,18);
		rshiftby(q2_tmp, 18, q1_q3, 8, ecc_prime_k + 1);
	//ecc_printNumber(q1_q3,8);
		fieldMult(q1_q3, ecc_prime_m, q2_tmp, 8);
	//ecc_printNumber(q2_tmp,16);
		sub(A, q2_tmp, q1_q3, 9);
		//test_helper.ecc_printNumber(q1_q3,9);
		copy(q1_q3,result,8);
		//test_helper.ecc_printNumber(result,8);
	//printf("into while\n");
		while (isGreater(result, ecc_prime_m, 8) >= 0)
			{
			sub(result, ecc_prime_m, result, 8);
//			ecc_printNumber(result,8);
		}
//		printf("result is ");
//		ecc_printNumber(result,8);
	}
	static public void fieldModP9(long[] result, long[] A,  int length) {
		// This is used for value q1 and q3
		long[] q1_q3=new long[9];
		// This is used for q2 and a temp var
		long[] q2_tmp=new long[18];
//		printf("who is modueld with length:%d\n",length);
	//ecc_printNumber(A,length);
		// return if the given value is smaller than the modulus
		if (length == ecc.arrayLength && isGreater(A, ecc.ecc_prime_m, ecc.arrayLength) <= 0) {
			if (A != result)//need to examine xing 16-03-23
			        copy(A, result, length);
			return;
		}

		rshiftby(A, length, q1_q3, 9, ecc_prime_k - 1);
	//ecc_printNumber(q1_q3,9);
		fieldMult(ecc_prime_mu, q1_q3, q2_tmp, 9);
	//ecc_printNumber(q2_tmp,18);
		rshiftby(q2_tmp, 18, q1_q3, 8, ecc_prime_k + 1);
	//ecc_printNumber(q1_q3,8);
		fieldMult(q1_q3, ecc.ecc_prime_m, q2_tmp, 8);
	//ecc_printNumber(q2_tmp,16);
		sub(A, q2_tmp, result, 9);
	//ecc_printNumber(result,8);
	//printf("into while\n");

		while (isGreater(result, ecc.ecc_prime_m, 9) >= 0)
			{
			sub(result, ecc.ecc_prime_m, result, 9);
			//ecc_printNumber(result,8);

		}
//		printf("result is ");
//		ecc_printNumber(result,8);
	}
	static public int isOne(long[] A){
		int n; 
		for(n=1;n<8;n++) 
			if (A[n]!=0) 
				break;

		if ((n==8)&&(A[0]==1)) 
			return 1;
		else 
			return 0;
	}
	static public int isOne_len(long[] A,int length){
		int n; 
		for(n=1;n<length;n++) 
			if (A[n]!=0) 
				break;

		if ((n==length)&&(A[0]==1)) 
			return 1;
		else 
			return 0;
	}
	static public int isZero(long[] A){
		int n, r=0;
		for(n=0;n<8;n++){
			if (A[n] != 0) return 0;
		}
		return 1;
	}
	static public int isZero_len(long[] A,int length){
		int n, r=0;
		for(n=0;n<length;n++){
			if (A[n] != 0) return 0;
		}
		return 1;
	}
	static public int rshift_len(long[] A,int length){
		long n;
		int i;
		long nOld = 0;
		for (i = length-1; i>=0;i--)
		{
			n = A[i]&0x1;
			A[i] = A[i]>>1 | nOld<<31;
			nOld = n;
		}
		return (int)nOld;
	}

	static public int rshift(long[] A){
		long n;
		int i;
		long nOld = 0;
		for (i = 7;i>=0 ;i--)
		{
			n = A[i]&0x1;
			A[i] = A[i]>>1 | nOld<<31;
			nOld = n;
		}
		return (int)nOld;
	}

	static public int fieldAddAndDivide(long[] x, long[] modulus, long[] reducer, long[] result){
		int n = add(x, modulus, result, arrayLength);
		rshift(result);
		if(n==1){ //add prime if carry is still set!
			result[7] |= 0x80000000;//add the carry
			if (isGreater(result, modulus, arrayLength) == 1)
			{
				long[] tempas=new long[8];
				setZero(tempas, 8);
				add(result, reducer, tempas, 8);
				copy(tempas, result, arrayLength);
			}
			
		}
		return 0;
	}
	static public int fieldAddAndDivide_len(long[] x, long[] modulus, long[] reducer, long[] result,int length){

		setZero(result,length);
		int n = add(x, modulus, result, length);
	//System.out.println("add and divide:");
	
	//test_helper.ecc_printNumber(x,4);
		
		//test_helper.ecc_printNumber(result,4);
		rshift_len(result,length);
			//test_helper.ecc_printNumber(result,4);
		//System.out.printf("n=%d\n",n);
		if(n==1){ //add prime if carry is still set!
			result[length-1] |= 0x80000000L;//add the carry
			//test_helper.ecc_printNumber(result,4);
			if (isGreater(result, modulus, length) == 1)
			{
				long[] tempas=new long[8];
				setZero(tempas, 8);
				add(result, reducer, tempas, length);
				copy(tempas, result, length);
			}
			
		}
		return 0;
	}


	static public void fieldAddAndDivide_lenTest(){
		long[] tempp0=new long[]{0xFFFFFFFFL, 0xFFFFFFFFL, 0xFFFFFFFFL, 0x8000003FL};
		long[] tempp1=new long[4];
		long[] tempp2=new long[8];
		
		fieldAddAndDivide_len(tempp0, ecc_order_m, ecc_order_r, tempp1,4);
//		ecc_printNumber(tempp1,4);
	}
	/*
	 * Inverse A and output to B
	 */
	static public void fieldInv(long[] A, long[] modulus, long[] reducer, long[] B){
		long[] u=new long[8];
		long[] v=new long[8];
		long[] x1=new long[8];
		long[] x2=new long[8];
		long[] tempm=new long[8];
		long[] tempm2=new long[8];
		setZero(tempm, 8);
		setZero(tempm2, 8);
		setZero(u, 8);
		setZero(v, 8);

		int t;
		copy(A,u,arrayLength); 
		copy(modulus,v,arrayLength); 
		setZero(x1, 8);
		setZero(x2, 8);
		x1[0]=1; 
		/* While u !=1 and v !=1 */ 
		while ((isOne(u)==0) && (isOne(v)==0)) {
			/*printf("zui wai wei \n");
			ecc_printNumber(u,8);
			ecc_printNumber(v,8);*/
			while((u[0]&1)==0) { 					/* While u is even *///偶数xing
				//printf("before u rshift\n");
			//ecc_printNumber(u,8);
				rshift(u); 						/* divide by 2 */
				//printf("after u shift\n");
				//ecc_printNumber(u,8);
				if ((x1[0]&1)==0)					/*ifx1iseven*/
					rshift(x1);					/* Divide by 2 */
				else {
					fieldAddAndDivide(x1,modulus,reducer,tempm); /* tempm=x1+p */
					copy(tempm,x1,arrayLength); 		/* x1=tempm */
					//rshift(x1);					/* Divide by 2 */
				}
				//printf(" u while result:x1\n");
				//ecc_printNumber(x1,8);
			} 
			while((v[0]&1)==0) {					/* While v is even */
					//		printf("before v rshift\n");
			//ecc_printNumber(v,8);
				rshift(v); 						/* divide by 2 */
				//printf("after v shift\n");
				//ecc_printNumber(v,8);
				if ((x2[0]&1)==0)					/*ifx1iseven*/
					rshift(x2); 				/* Divide by 2 */
				else
				{
					fieldAddAndDivide(x2,modulus,reducer,tempm);	/* tempm=x1+p */
					copy(tempm,x2,arrayLength); 			/* x1=tempm */ 
					//rshift(x2);					/* Divide by 2 */
				}
				//printf(" u while result:x2\n");
				//ecc_printNumber(x2,8);
				
			} 
			t=sub(u,v,tempm,arrayLength); 				/* tempm=u-v */
			if (t==0) {							/* If u > 0 */
				copy(tempm,u,arrayLength); 					/* u=u-v */
				fieldSub(x1,x2,modulus,tempm); 			/* tempm=x1-x2 */
				copy(tempm,x1,arrayLength);					/* x1=x1-x2 */
			} else {
				sub(v,u,tempm,arrayLength); 			/* tempm=v-u */
				copy(tempm,v,arrayLength); 					/* v=v-u */
				fieldSub(x2,x1,modulus,tempm); 			/* tempm=x2-x1 */
				copy(tempm,x2,arrayLength);					/* x2=x2-x1 */
			}/*
			printf(" big while result:\n");
	ecc_printNumber(u,8);
	ecc_printNumber(v,8);
	ecc_printNumber(x1,8);
				ecc_printNumber(x2,8);*/
		} 
		if (isOne(u)==1) {
			copy(x1,B,arrayLength); 
		} else {
			copy(x2,B,arrayLength);
		}
	}


	static public void fieldInv_4(long[] A, long[] modulus, long[] reducer, long[] B){
		long[] u=new long[4];
		long[] v=new long[4];
		long[] x1=new long[4];
		long[] x2=new long[4];
		long[] tempm=new long[4];
		long[] tempm2=new long[8];
		setZero(tempm, 4);
		setZero(tempm2, 8);
		setZero(u, 4);
		setZero(v, 4);

		int t;
		copy(A,u,4); 
		copy(modulus,v,4); 
		setZero(x1, 4);
		setZero(x2, 4);
		x1[0]=1; 
		/* While u !=1 and v !=1 */ 
		while ((isOne_len(u,4)==0) &&( isOne_len(v,4)==0)) {
			/*System.out.printf("zui wai wei \n");
			test_helper.ecc_printNumber(u,4);
			test_helper.ecc_printNumber(v,4);*/
			while((u[0]&1)==0) { 					/* While u is even *///偶数xing
				//System.out.printf("before u rshift\n");
				//test_helper.ecc_printNumber(u,4);
				rshift_len(u,4); 						/* divide by 2 */
				//System.out.printf("after u shift\n");
				//test_helper.ecc_printNumber(u,4);
				if ((x1[0]&1)==0)					/*ifx1iseven*/
					rshift_len(x1,4);					/* Divide by 2 */
				else {
					fieldAddAndDivide_len(x1,modulus,reducer,tempm,4); /* tempm=(x1+p)/2 */
					copy(tempm,x1,4); 		/* x1=tempm */
					//rshift(x1);					/* Divide by 2 */
				}
				/*System.out.printf(" u while result:x1\n");
				test_helper.ecc_printNumber(x1,4);*/
			} 
			while((v[0]&1)==0) {					/* While v is even */
				//System.out.printf("before v rshift\n");
				//test_helper.ecc_printNumber(v,4);
				rshift_len(v,4); 						/* divide by 2 */ 
				//System.out.printf("after v shift\n");
				//test_helper.ecc_printNumber(u,4);
				if ((x2[0]&1)==0)					/*ifx1iseven*/
					rshift_len(x2,4); 				/* Divide by 2 */
				else
				{
					fieldAddAndDivide_len(x2,modulus,reducer,tempm,4);	/* tempm=x1+p */
					copy(tempm,x2,4); 			/* x1=tempm */ 
					//rshift(x2);					/* Divide by 2 */
				}
				//System.out.printf(" v while result:x2\n");
				//test_helper.ecc_printNumber(x2,4);
				
			} 
			t=sub(u,v,tempm,4); 				/* tempm=u-v */
			if (t==0) {							/* If u > 0 */
				copy(tempm,u,4); 					/* u=u-v */
				fieldSub_len(x1,x2,modulus,tempm,4); 			/* tempm=x1-x2 */
				copy(tempm,x1,4);					/* x1=x1-x2 */
			} else {
				sub(v,u,tempm,4); 			/* tempm=v-u */
				copy(tempm,v,4); 					/* v=v-u */
				/*System.out.printf("v=");
				test_helper.ecc_printNumber(v,4);
				System.out.printf("x2-x1=");
				test_helper.ecc_printNumber(x2,4);
				System.out.printf(" - ");
				test_helper.ecc_printNumber(x1,4);*/
				fieldSub_len(x2,x1,modulus,tempm,4); 			/* tempm=x2-x1 */
				copy(tempm,x2,4);					/* x2=x2-x1 */
				//System.out.printf(" = ");
				//test_helper.ecc_printNumber(x2,4);
				
			}
	/*System.out.printf(" big while result:\n");
	test_helper.ecc_printNumber(u,4);
	test_helper.ecc_printNumber(v,4);
	test_helper.ecc_printNumber(x1,4);
				test_helper.ecc_printNumber(x2,4);
			*/
		} 
		if (isOne_len(u,4)==1) {
			copy(x1,B,4); 
		} else {
			copy(x2,B,4);
		}
	}



	static public void ec_double(long[] px,long[] py, long[] DDx, long[] DDy){
		long[] tempA=new long[8];
		long[] tempB=new long[8];
		long[] tempC=new long[8];
		long[] tempD=new long[16];
		long[] tempA1=new long[9];
		long[] tempB1=new long[9];
		long[] Dx=new long[8];
		long[] Dy=new long[8];
		
		if((isZero(px)==1) && (isZero(py)==1)){
			copy(px, Dx,arrayLength);
			copy(py, Dy,arrayLength);
			return;
		}

		fieldMult(px, px, tempD, arrayLength);
		fieldModP(tempA, tempD,16);//tempA=qx^2
		setZero(tempB, 8);
		
		tempB[0] = 0x00000003;
		fieldMult(tempA, tempB, tempD, arrayLength);
		fieldModP(tempC, tempD,16);//tempC = 3*qx^2
		tempB[0] = 0x00000001;
		fieldAdd(tempC, tempB, ecc_prime_r, tempA); //tempA = (3qx^2+1)
		
		fieldAdd(py, py, ecc_prime_r, tempB); //tempB = 2*qy
		fieldInv(tempB, ecc_prime_m, ecc_prime_r, tempC); //tempC = 1/(2*qy)
		fieldMult(tempA, tempC, tempD, arrayLength); //tempB = lambda = (3qx^2+1)/(2*qy)
		fieldModP(tempB, tempD,16);
	for(int i=0;i<9;i++)tempB1[i]= 0;
			copy(tempB,tempB1,8);
		fieldMult(tempB, tempB, tempD, arrayLength); //tempC = lambda^2
		fieldModP(tempC, tempD,16);
		fieldSub(tempC, px, ecc_prime_m, tempA); //lambda^2 - Px
		fieldSub(tempA, px, ecc_prime_m, Dx); //lambda^2 - Px - Qx   ?????error xing  where is Qx?Qx=Px

		fieldSub(px, Dx, ecc_prime_m, tempA); //tempA = qx-dx      ????? dx=Dx???? xing
		fieldMult(tempB1, tempA, tempD, arrayLength); //tempC = lambda * (qx-dx)
		fieldModP(tempC, tempD,16);
		fieldSub(tempC, py, ecc_prime_m, Dy); //Dy = lambda * (qx-dx) - px
		
		copy(Dx,DDx,8);
		copy(Dy,DDy,8);
	}

	static public void  ec_add(long[] px,long[] py, long[] qx, long[] qy, long[] Sx,long[] Sy){
		long tempA[]=new long[8];
		long tempB[]=new long[8];
		long tempC[]=new long[8];
		long tempD[]=new long[16];

		if((isZero(px)==1) && (isZero(py)==1)){
			copy(qx, Sx,arrayLength);
			copy(qy, Sy,arrayLength);
			return;
		} else if((isZero(qx)==1) &&( isZero(qy)==1)) {
			copy(px, Sx,arrayLength);
			copy(py, Sy,arrayLength);
			return;
		}

		if(isSame(px, qx, arrayLength)){
			if(!isSame(py, qy, arrayLength)){
				setZero(Sx, 8);
				setZero(Sy, 8);
				return;
			} else {
				ec_double(px, py, Sx, Sy);
				return;
			}
		}

		fieldSub(py, qy, ecc_prime_m, tempA);
		fieldSub(px, qx, ecc_prime_m, tempB);//p-q向量 xing
		fieldInv(tempB, ecc_prime_m, ecc_prime_r, tempB);
		fieldMult(tempA, tempB, tempD, arrayLength); 
		fieldModP(tempC, tempD,16); //tempC = lambda

		fieldMult(tempC, tempC, tempD, arrayLength); //tempA = lambda^2
		fieldModP(tempA, tempD,16);
		fieldSub(tempA, px, ecc_prime_m, tempB); //lambda^2 - Px
		fieldSub(tempB, qx, ecc_prime_m, Sx); //lambda^2 - Px - Qx

		fieldSub(qx, Sx, ecc_prime_m, tempB);
		fieldMult(tempC, tempB, tempD, arrayLength);
		fieldModP(tempC, tempD,16);
		fieldSub(tempC, qy, ecc_prime_m, Sy);
	}
	static public void ec_sub(long[] px,long[] py, long[] qx, long[] qy, long[] Sx, long[] Sy){
		//p-q=s
		long qy_neg[]=new long[8];
		//int tempB[8];
		//copy(px,tempB, arrayLength);
		fieldSub(ecc_prime_m, qy, ecc_prime_m, qy_neg); //lambda^2 - Px
		ec_add(px, py, qx, qy_neg, Sx, Sy);
		return;
		
	}
	static public void ecc_ec_mult(long[] px,long[] py,long[] secret, long[] resultx, long[] resulty){
		long Qx[]=new long[8];
		long Qy[]=new long[8];
		setZero(Qx, 8);
		setZero(Qy, 8);

		long tempx[]=new long[8];
		long tempy[]=new long[8];

		int i;
		/*ec_double(Qx, Qy, tempx, tempy);
		copy(tempx, Qx,arrayLength);
		copy(tempy, Qy,arrayLength);
		if (secret[7]<0)  {//need to examine xing 16-03-23
			ec_add(Qx, Qy, px, py, tempx, tempy); //eccAdd
			copy(tempx, Qx,arrayLength);
			copy(tempy, Qy,arrayLength);
		}*/
		for (i = 256-1;i>=0;i--){
			ec_double(Qx, Qy, tempx, tempy);
			copy(tempx, Qx,arrayLength);
			copy(tempy, Qy,arrayLength);
			if (((secret[i / 32]) & ((long)1 << (i % 32)))!=0) {//need to examine xing 16-03-23
				ec_add(Qx, Qy, px, py, tempx, tempy); //eccAdd
				copy(tempx, Qx,arrayLength);
				copy(tempy, Qy,arrayLength);
			}
		}
		copy(Qx, resultx,arrayLength);
		copy(Qy, resulty,arrayLength);
	}
	static public void ecc_ec_mult_len(long[] px,long[] py, long[] secret,int length, long[] resultx, long[] resulty){
		long Qx[]=new long[8];
		long Qy[]=new long[8];
		setZero(Qx, 8);
		setZero(Qy, 8);

		long tempx[]=new long[8];
		long tempy[]=new long[8];

		int i=32*length;
		for (i=i-1;i>=0;i--){
			ec_double(Qx, Qy, tempx, tempy);
			copy(tempx, Qx,arrayLength);
			copy(tempy, Qy,arrayLength);
			if (((secret[i / 32]) & ((long)1 << (i % 32)))!=0) {//need to examine xing 16-03-23
				ec_add(Qx, Qy, px, py, tempx, tempy); //eccAdd
				copy(tempx, Qx,arrayLength);
				copy(tempy, Qy,arrayLength);
			}
		}
		copy(Qx, resultx,arrayLength);
		copy(Qy, resulty,arrayLength);
	}




/**
 * Calculate the ecdsa signature.
 *
 * For a description of this algorithm see
 * https://en.wikipedia.org/wiki/Elliptic_Curve_DSA#Signature_generation_algorithm
 *
 * input:
 *  d: private key on the curve secp256r1 (32 bytes)
 *  e: hash to sign (32 bytes)
 *  k: random data, this must be changed for every signature (32 bytes)
 *
 * output:
 *  r: r value of the signature (36 bytes)
 *  s: s value of the signature (36 bytes)
 *
 * return:
 *   0: everything is ok
 *  -1: can not create signature, try again with different k.
 */
static public int ecc_ecdsa_sign(long[] d, long[] e, long[] k, long[] r, long[] s)
{//ecdsaTestSecret, ecdsaTestMessage, ecdsaTestRand1, tempx, tempy
//long tmp0[10];
	long tmp1[]=new long[8];
	long tmp2[]=new long[5];
	long tmp3[]=new long[5];
long tmp4[]=new long[8];
//long tmp5[10];
	if (isZero(k)==1)
		return -1;
	System.out.printf("k=");
	test_helper.ecc_printNumber(k,4);
	// 4. Calculate the curve point (x_1, y_1) = k * G.
	ecc_ec_mult_len(ecc_g_point_x, ecc_g_point_y, k, 4,tmp4, tmp1);

	// 5. Calculate r = x_1 \pmod{n}.
/*setZero(tmp1,5);
copy(ecc_order_m,tmp1,4);

fieldMult(tmp1,tmp2,tmp5,5);
add(tmp5,tmp0,tmp5,10);
ecc_printNumber(tmp5,8);
ecc_printNumber(tmp5,10);
*/
	fieldModO(tmp4, r, 8);  
	System.out.printf("r=");
	test_helper.ecc_printNumber(r,4);
	// 5. If r = 0, go back to step 3.
	if (isZero_len(r,4)==1)
		return -1;

	// 6. Calculate s = k^{-1}(z + r d_A) \pmod{n}.
	// 6. r * d
	fieldMult(r, d, tmp4, 4);
//	ecc_printNumber(tmp4,8);
	fieldModO(tmp4, tmp2, 8);
	System.out.printf("r * d=");
	test_helper.ecc_printNumber(tmp2,4);
	// 6. z + (r d)
	tmp1[4] = add(e, tmp2, tmp1, 4);
//	ecc_printNumber(tmp1,5);
	fieldModO(tmp1, tmp3, 5);
	System.out.printf("z+r * d=");
	test_helper.ecc_printNumber(tmp3,4);
//k=0102030405060708090a0b0c0d0e0f10
//0x0D0E0F10, 0x090A0B0C, 0x05060708, 0x01020304
	// 6. k^{-1}
//	printf("k=");
//ecc_printNumber(k,4);
	//fieldInv_4(k, ecc_order_m, ecc_order_r, tmp2);
	fieldInv_4(k, ecc_order_m, ecc_order_r, tmp2);
	System.out.printf("1/k=");
test_helper.ecc_printNumber(tmp2,4);
	// 6. (k^{-1}) (z + (r d))
	fieldMult(tmp2, tmp3, tmp1, 4);
	fieldModO(tmp1, s, 8);
	System.out.printf("(k^{-1}) (z + (r d)=");
	test_helper.ecc_printNumber(s,4);
	// 6. If s = 0, go back to step 3.
	if (isZero_len(s,4)==1)
		return -1;
	return 0;
}

/**
 * Verifies a ecdsa signature.
 *
 * For a description of this algorithm see
 * https://en.wikipedia.org/wiki/Elliptic_Curve_DSA#Signature_verification_algorithm
 *
 * input:
 *  x: x coordinate of the public key (32 bytes)
 *  y: y coordinate of the public key (32 bytes)
 *  e: hash to verify the signature of (32 bytes)
 *  r: r value of the signature (32 bytes)
 *  s: s value of the signature (32 bytes)
 *
 * return:
 *  0: signature is ok
 *  -1: signature check failed the signature is invalid
 */
static public int ecc_ecdsa_validate( long[] x,  long[] y,  long[] e,  long[] r, long[] s)
{
	long w[]=new long[4];
	long tmp[]=new long[8];
	long u1[]=new long[5];
	long u2[]=new long[5];
	long tmp1_x[]=new long[8];
	long tmp1_y[]=new long[8];
	long tmp2_x[]=new long[8];
	long tmp2_y[]=new long[8];
	long tmp3_x[]=new long[8];
	long tmp3_y[]=new long[8];
	test_helper.ecc_printNumber(x,8);
	test_helper.ecc_printNumber(y,8);
	test_helper.ecc_printNumber(r,4);
	test_helper.ecc_printNumber(s,4);
//183579dd547d726222d1c79b758a8f6a06c39ee6d1c91ad727cd57aa00d8312f
// 083df0be975cf7157edde9199a66a680b45ab78a683ccb8861e977e045d6565c
// 3faf0ef1 aaec42b8 02839b68 fd3250a4

//23833A2B  D4BF2B81  DE66DDF8  F165FAD6
//171c92db9dd43fe79b74ad5f1aae1b03
	// 3. Calculate w = s^{-1} \pmod{n}
	fieldInv_4(s, ecc_order_m, ecc_order_r, w);
//ecc_printNumber(w,4);
//EA16281C  08304D34  8BA5DA5F  5E9A0FD3
	// 4. Calculate u_1 = zw \pmod{n}
	fieldMult(e, w, tmp, 4);
//	ecc_printNumber(tmp,8);
	//F7FCB29C  9101B436  37CE34BC  39C3B00D   E0451A51  3F6E02C8  8F2F96B5  1ABF54E4
	fieldModO(tmp, u1, 8);
//ecc_printNumber(u1,4);
//0FE6886F  9750CC22  D8C3DE81  7EBA7B1E
	// 4. Calculate u_2 = rw \pmod{n}
	fieldMult(r, w, tmp, 4);
//ecc_printNumber(tmp,8);
//643271F0  F85CDC64  E27F562D  164D300D   871A3F72  FC8CE247  9C0A5C17  17889ABB
	fieldModO(tmp, u2, 8);
//ecc_printNumber(u2,4);
//60CA2B8E  BC4743F3  33054DD5  0D2A622E
	// 5. Calculate the curve point (x_1, y_1) = u_1 * G + u_2 * Q_A.
	// tmp1 = u_1 * G
	ecc_ec_mult_len(ecc_g_point_x, ecc_g_point_y, u1,4, tmp1_x, tmp1_y);
//ecc_printNumber(tmp1_x,8);//F2C5933E  2AEE8E9B  57990DEC  E3A393B2   C3E05EA6  2B8415BD  FD48A4E8  01C23D2F
//ecc_printNumber(tmp1_y,8);// 2BBA7E34  775C7551  89D05E36  72D4F898    2F1563A0  DB12C424  145D1BA6  04E18F36
	// tmp2 = u_2 * Q_A
	ecc_ec_mult_len(x, y, u2, 4,tmp2_x, tmp2_y);
//ecc_printNumber(tmp2_x,8);// 54715F21  88061BB6  C56409AC  EC39A542   DA0FF553  06D15BE6  022DBB8E  4FE16EB6
//ecc_printNumber(tmp2_y,8);// D55EC649  C14AD1CA  8F61345A  777ECE5C   9D413998  B723DABB  E45B90BF  2B7488FA
	// tmp3 = tmp1 + tmp2
	ec_add(tmp1_x, tmp1_y, tmp2_x, tmp2_y, tmp3_x, tmp3_y);
	// TODO: this u_1 * G + u_2 * Q_A  could be optimiced with Straus's algorithm.
	test_helper.ecc_printNumber(tmp3_x,8);//23833A2B  D4BF2B81  DE66DDF8  F165FAD6   A20C7ACD  47C49840  F8DFD6ED  4EBE4539
	test_helper.ecc_printNumber(tmp3_y,8);//23833A2B  D4BF2B81  DE66DDF8  F165FAD6   A20C7ACD  47C49840  F8DFD6ED  4EBE4539
	// 4ebe4539 f8dfd6ed 47c49840 a20c7acd f165fad6 de66ddf8 d4bf2b81 23833a2b
// 0fa59b99fe0776a770b43e262bb369a9a483979d29a1b8b6fdd09dbe4892a13e

	return (isSame(tmp3_x, r, 4) ? 0 : -1);
}

static public int ecc_is_valid_key( long[]  priv_key)
{
	if(isGreater(ecc_order_m, priv_key, arrayLength) == 1)
	return 1;
	else return 0;
}

/*
 * This exports the low level functions so the tests can use them.
 * In real use the compiler is now bale to optimice the code better.
 */
//#ifdef TEST_INCLUDE
static public int ecc_add( long[] x, long[] y, long[] result, int length)
{
	return add(x, y, result, length);
}
static public int ecc_sub( long x[],  long[] y, long[] result, int length)
{
	return sub(x, y, result, length);
}
static public int ecc_fieldAdd( long[] x,  long[] y,  long[] reducer, long[] result)
{
	return fieldAdd(x, y, reducer, result);
}
static public int ecc_fieldSub( long[] x,  long[] y,  long[] modulus, long[] result)
{
	return fieldSub(x, y, modulus, result);
}
static public int ecc_fieldMult( long[] x,  long[] y, long[] result, int length)
{
	return fieldMult(x, y, result, length);
}
static public void ecc_fieldModP2(long[] A,  long[] B,int length)
{
	
	fieldModP2(A, B, length);
}
static public void ecc_fieldModP(long[] A,  long[] B,int length)
{
	
	fieldModP(A, B, length);
}
static public void ecc_fieldModO( long[] A, long[] result, int length)
{
	fieldModO(A, result, length);
}
static public void ecc_fieldInv( long[] A,  long[] modulus,  long[] reducer, long[] B)
{
	fieldInv(A, modulus, reducer, B);
}
static public void ecc_fieldInv4( long[] A,  long[] modulus,  long[] reducer, long[] B)
{
	fieldInv_4(A, modulus, reducer, B);
}
static public void ecc_copy( long[] from, long[] to, int length)
{
	copy(from, to, length);
}
static public boolean ecc_isSame( long[] A,  long[] B, int length)
{
	return isSame(A, B, length);
}
static public void ecc_setZero(long[] A,  int length)
{
	setZero(A, length);
}
static public int ecc_isOne( long A[])
{
	return isOne(A);
}
static public void ecc_rshift(long A[])
{
	rshift(A);
}
static public int ecc_isGreater( long[] A,  long[] B, int length)
{
	return isGreater(A, B , length);
}

static public void ecc_ec_add( long[] px,  long[] py,  long[] qx,  long[] qy, long[] Sx, long[] Sy)
{
	ec_add(px, py, qx, qy, Sx, Sy);
}
static public void ecc_ec_sub( long[] px,  long[] py,  long[] qx,  long[] qy, long[] Sx, long[] Sy)
{
	ec_sub(px, py, qx, qy, Sx, Sy);
}
static public void ecc_ec_double( long[] px,  long[] py, long[] Dx, long[] Dy)
{
	ec_double(px, py, Dx, Dy);
}


static  void fi_invert(long[]  rx,long[] ry, long[]  px,long[]  py)
{
    long  e0[]=new long[8];
	long e1[]=new long[8];
	long e2[]=new long[8];
long tempf[]=new long[16];
fieldMult(px,px,tempf,8);
fieldModP(e0,tempf,16);
//printf("x^2=");
//ecc_printNumber(e0,8);
copy(e0,e2,8);

fieldMult(py,py,tempf,8);
fieldModP(e1,tempf,16);

fieldAdd(e2,e1,ecc_prime_m,e2);

fieldInv(e2,ecc_prime_m,ecc_prime_r,e0);
fieldMult(e0,px,tempf,8);
fieldModP(rx,tempf,16);

fieldSub(ecc_prime_m,e0,ecc_prime_m,e0);

fieldMult(e0,py,tempf,8);
fieldModP(ry,tempf,16);
//fieldSub(ecc_prime_m,ry,ecc_prime_m,ry);
	
}
static  void fi_mul(long[]  rx,long[] ry, long[]  px,long[]  py, long[]  qx,long[]  qy)
{

    long  e0[]=new long[8];
	long e1[]=new long[8];
	long e2[]=new long[8];
long tempf[]=new long[16];
long tempfx[]=new long[9];
  /*  element_init(e0, p->x->field);
    element_init(e1, e0->field);
    element_init(e2, e0->field);*/
    /* Naive way
    element_mul(e0, p->x, q->x);
    element_mul(e1, p->y, q->y);
    element_sub(e0, e0, e1);
    element_mul(e1, p->x, q->y);
    element_mul(e2, p->y, q->x);
    element_add(e1, e1, e2);
    element_set(r->x, e0);
    element_set(r->y, e1);
    */
    //Karatsuba:
    /*	printf("px=");
    ecc_printNumber(px,8);
		printf("qx=");
  ecc_printNumber(qx,8);
 */   fieldAdd( px, py,ecc_prime_r,e0);
    fieldAdd( qx, qy,ecc_prime_r,e1);

    fieldMult(e0, e1,tempf,8);
	//printf("tempf=");
	//ecc_printNumber(tempf,16);
	fieldModP(e2,tempf,16);
	//printf("qwe\n");
	 fieldMult( px, qx,tempf,8);
//	printf("tempf=");
//	ecc_printNumber(tempf,16);
	fieldModP(e0,tempf,16);
//	printf("e0=");
//	ecc_printNumber(e0,8);
	copy(e0,tempfx,8);
    //element_mul(e0, px, qx);
    fieldSub(e2,e0,ecc_prime_m,e2);
    //element_sub(e2, e2, e0);
    	 fieldMult( py, qy,tempf,8);
	fieldModP(e1,tempf,16);
//	printf("e1=");
//	ecc_printNumber(e1,8);
    //element_mul(e1, py, qy);
     fieldSub(tempfx,e1,ecc_prime_m,rx);
//	printf("e0=");
//	ecc_printNumber(tempfx,8);
    //element_sub(rx, e0, e1);
     fieldSub(e2,e1,ecc_prime_m,ry);

    //element_sub(ry, e2, e1);
}
static  void fi_square(long[] sx, long[] sy,long[] dx,long[]dy)
{


    long e0[]=new long[8];
long e1[]=new long[8];
long e2[]=new long[16];
long sxx[]=new long[8];
long syy[]=new long[8];
    //Re(n) = x^2 - y^2 = (x+y)(x-y)
       fieldAdd(sx, sy, ecc_prime_r,e0);
    // System.out.printf("x+y=");
   //	test_helper.ecc_printNumber(e0,8);
   	copy(sy,syy,8);
	copy(sx,sxx,8);
	fieldSub(sx,sy, ecc_prime_m,e1);
	//System.out.printf("x-y=");
	//test_helper.ecc_printNumber(e1,8);
	
	
    fieldMult( e0, e1,e2,8);
	
	fieldModP(e0,e2,16);
	
	 copy( e0,dx,8);
    //Im(n) = 2xy
	/* System.out.printf("x=");
	 test_helper.ecc_printNumber(sxx,8);
		System.out.printf("y=");
		test_helper.ecc_printNumber(syy,8);*/
    
		//fieldMult( sx, sy,e2,8);
		fieldMult( sxx, syy,e2,8);
		fieldModP(e1,e2,16);
	/*System.out.printf("xy=");
	test_helper.ecc_printNumber(e1,8);	*/
    fieldAdd(e1, e1, ecc_prime_r,e0);
  //  System.out.printf("2xy=");
   // test_helper.ecc_printNumber(e0,8);
    if(e0[7]>ecc_prime_m[7])
	{
	sub(e0,ecc_prime_m,e0,8);
	}
  //  System.out.printf("2xy mod p=");
   // test_helper.ecc_printNumber(e0,8);	

    copy( e0,dy,8);
}


static  void compute_abc_tangent_proj(long[] a, long[]  b, long[]  c,
	long[]  Vx, long[]  Vy, long[]  e0)
	//z2表示z的平方
{
    //a = -(3x^2 + cca z^4)
    //for this case cca = 1
    //b = 2 y z^3
    //c = -(2 y^2 + x a)
    //a = z^2 a
       //14e6a04795237439bab9c103847b71bd49942c7a4a1fca382511b34316890cb8
// 
// 1a96e6c5159c9c51fa0205ac0eb66b8b0f3bd7637d405b8e7094a8714c2232b2
// 05db47417e13cba58ab64755a5bce6a1ca4f0ecbfaa9e5a1fd7611fab18a40f5
//
//16890CB8  2511B343  4A1FCA38  49942C7A   847B71BD  BAB9C103  95237439  14E6A047
// 4C2232B2  7094A871  7D405B8E  0F3BD763   0EB66B8B  FA0205AC  159C9C51  1A96E6C5
// 2EBCCB5E  266A56A8  C18BD9E3  9DEFB716   8278C83A  035C1F5B  DD556789  36473FE5

// 3x^2=3ea1016efeb4eaeed4595cd2637dbe9faaaf339f55ef6748f17bc7dd72abc3ba
// 3x^2+1=3ea1016efeb4eaeed4595cd2637dbe9faaaf339f55ef6748f17bc7dd72abc3bb
//  -(3x^2+1)=14e6a04795237439bab9c103847b71bd49942c7a4a1fca382511b34316890cb8

    long tempa[]=new long[16];
	long tempb[]=new long[8];
	long tempbb[]=new long[8];
/*	printf("compute_abc_tangent_proj:\nVx AND vY  ");
	ecc_printNumber(Vx,8);// 4bf283ec88deb747b5a5b66536b94d04fa614ca50bbd650ba83fd006495b7942
	ecc_printNumber(Vy,8);//0d4b73628ace4e28fd0102d6075b35c5879debb1bea02dc7384a5438a6111959
 */   copy(ecc.one,a,8);
    fieldMult(Vx, Vx,tempa,8);// x^2
	fieldModP(b,tempa,16);
    fieldMult(b, ecc.three,tempa,8);
	fieldModP(b,tempa,16);//  3x^2
//	printf("3x^2=");
//	ecc_printNumber(b,8);
    fieldAdd(b, ecc.one,ecc_prime_r, a);// 3x^2+1
//    printf("3x^2+1=");
//	ecc_printNumber(a,8);
    fieldSub(ecc_prime_m,a,ecc_prime_m, a); // -(3x^2+1)
/*    printf(" -(3x^2+1)=");
	ecc_printNumber(a,8);
	printf(" vy=");
	ecc_printNumber(Vy,8);
 */   fieldAdd(Vy,Vy,ecc_prime_r,tempbb);// b=2y
    //printf(" b=2y=");
	//ecc_printNumber(tempbb,8);
	
    fieldMult(Vx, a,tempa,8);
	/*ecc_printNumber(Vx,8);
	ecc_printNumber(a,8);
	ecc_printNumber(tempa,16);//06335dbdd02975fb261bffb9fc50573891b53a6710780680abc94d71b4729cbbe8ec667129526b3fc1d71d78d2620c8462d54c0dc16b3b448964d09a93c03f70
	*/// 93C03F70  8964D09A  C16B3B44  62D54C0D    D2620C84  C1D71D78  29526B3F  E8EC6671  
//00AA24C8  B4729CBB  ABC94D71  10780680  91B53A67  FC505738  261BFFB9  D02975FB  06335DBD
	//fieldModP9(c,tempa,16); //2 
    fieldModP(c,tempa,16); //xing, 16-03-29
     //printf("  ax=");
//	ecc_printNumber(c,8);//85989B90  73129EB1  4CC2072E  F63FE8C1   0D879569  79C77B5C  BB972739  228DFAE3
	//228dfae3bb97273979c77b5c0d879569f63fe8c14cc2072e73129eb185989b90
    fieldMult(tempbb, Vy,tempa,8);// e0=2y^2
 /*   ecc_printNumber(Vy,8);
	ecc_printNumber(tempbb,8);
    ecc_printNumber(tempa,16);
    */ //98A901E2  C69759E7  23B6D1B7  1869BDE7    C1C8C950  CF08FE93  091911B7  D2C2F385  
//  1DD46B83  1BD0A1EA  9F985D12  3C413E92    2C269D9A  C24C2C30  A3AFEEEB  01617FE9
//01617fe9a3afeeebc24c2c302c269d9a3c413e929f985d121bd0a1ea1dd46b83d2c2f385091911b7cf08fe93c1c8c9501869bde723b6d1b7c69759e798a901e2
	fieldModP(e0,tempa,16);
//	  printf("  2y^2=");
//	ecc_printNumber(e0,8);// 5E1439F8  939E00E7  31D081F0  5457205B   3FF20315  A102A0F4  8EC42F8E  4E3A08A3
// 4e3a08a38ec42f8ea102a0f43ff203155457205b31d081f0939e00e75e1439f8
    fieldAdd(c,e0,ecc_prime_r,c);// 2y^2+ax
//     printf("  2y^2+ax=");
//	ecc_printNumber(c,8);// 70c803874a5b56c81aca1c504d79987f4a97091c7e92891f06b09f98e3acd588
	// 5A780515  F0232478  DE83579D  5653A902    65806822  8BB6FE7A  B682F79F  1D4061D0
	 fieldSub(ecc_prime_m,c,ecc_prime_m, c);//-(2y^2+ax)
	 //36473fe5dd556789035c1f5b8278c83a9defb716c18bd9e3266a56a82ebccb5e
	 // 2EBCCB5E  266A56A8  C18BD9E3  9DEFB716   8278C83A  035C1F5B  DD556789  36473FE5
//	   printf("  -(2y^2+ax)=");
//	ecc_printNumber(c,8);
   copy(tempbb,b,8);
}

//computes a Qx + b Qy + c for type A pairing
static  void a_miller_evalfn(long[] outx,long[] outy,long[] a, long[] b, long[] c,long[] Qx, long[] Qy)
{
    //we'll map Q via (x,y) --> (-x, iy)
    //hence Re(a Qx + b Qy + c) = -a Q'x + c and
    //Im(a Qx + b Qy + c) = b Q'y
    long tempm[]=new long[16];
    fieldMult( a, Qx,tempm,8);
	fieldModP(outx,tempm,16);
    fieldSub( c, outx,ecc_prime_m,outx);
    fieldMult( b, Qy,tempm,8);
	fieldModP(outy,tempm,16);
}
static  void compute_abc_line(long[] a, long[] b, long[] c,
	long[] Vx, long[] Vy,
	long[] V1x, long[] V1y)
	//没有z维坐标
{
    //a = -(B.y - A.y) / (B.x - A.x);
    //b = 1;
    //c = -(A.y + a * A.x);
    //but we'll multiply by B.x - A.x to avoid division, so
    //a = -(By - Ay)
    //b = Bx - Ax
    //c = -(Ay b + a Ax);
       long tempa[]=new long[16];
	long tempb[]=new long[8];
	fieldSub(Vy, V1y,ecc_prime_m,a);
    //element_sub(a, Vy, V1y);
    fieldSub(V1x, Vx,ecc_prime_m,b);
    //element_sub(b, V1x, Vx);
	fieldMult( Vx, V1y,tempa,8);
	fieldModP(c,tempa,16);
    //element_mul(c, Vx, V1y);
    fieldMult( Vy, V1x,tempa,8);
	fieldModP(tempb,tempa,16);
    fieldSub(c, tempb,ecc_prime_m,c);
}

static void a_do_line(long[] fx,long[] fy,long[] f0x,long[] f0y, long[] Qx,long[] Qy,  long[] Vx, long[] Vy,long[] V1x, long[] V1y)
 //实现(Vx.Vy)与(V1x,V1y)的连线ax+by+c=0的参数计算，并且计算(Qx,Qy)带入直线方程的值
   {
   long  a[]=new long[8];
    long b[]=new long[8];
	long  c[]=new long[8];
	compute_abc_line(a, b, c, Vx, Vy, V1x, V1y);
	a_miller_evalfn(f0x,f0y, a, b, c, Qx, Qy);
	fi_mul(fx,fy,fx,fy,f0x,f0y);
    }

static void a_do_tangent(long[] fx,long[] fy,long[] f0x,long[] f0y, long[] Qx,long[] Qy, long[] a, long[] b, long[] c, long[] Vx, long[] Vy)
//实现(Vx.Vy)处切线ax+by+c=0的参数计算，并且计算(Qx,Qy)带入直线方程的值
     {
     long  e0[]=new long[8];
	// int ff[32];
	compute_abc_tangent_proj(a, b, c, Vx, Vy, e0);
	/*System.out.printf("a=");
	test_helper.ecc_printNumber(a, 8);
	System.out.printf("b=");
	test_helper.ecc_printNumber(b, 8);
	System.out.printf("c=");
	test_helper.ecc_printNumber(c, 8);*/
	//a=14e6a04795237439bab9c103847b71bd49942c7a4a1fca382511b34316890cb8
//b=1a96e6c5159c9c51fa0205ac0eb66b8b0f3bd7637d405b8e7094a8714c2232b2
//c=36473fe5dd556789035c1f5b8278c83a9defb716c18bd9e3266a56a82ebccb5e

	a_miller_evalfn(f0x,f0y, a, b, c, Qx, Qy);
	/*System.out.printf("f0x=");
	test_helper.ecc_printNumber(f0x, 8);//C517E4C6  F0977CEE  2F961F72  89A88239  A8AF91A9  F287F017  A5ADF571   22F8A709
	System.out.printf("f0y=");
	test_helper.ecc_printNumber(f0y, 8);// D65418EE  12FA8CD7  1862A89E  6D873486  BCE81EAE  4E76E3B8  750E3BBD   15BC2C65
	// f0x=22f8a709a5adf571f287f017a8af91a989a882392f961f72f0977ceec517e4c6
//f0y=15bc2c65750e3bbd4e76e3b8bce81eae6d8734861862a89e12fa8cd7d65418ee
*/
	fi_mul(fx,fy,fx,fy,f0x,f0y);
	/*System.out.printf("fx=");
	test_helper.ecc_printNumber(fx, 8);//22f8a709a5adf571f287f017a8af91a989a882392f961f72 f0977cee 00000000
	//22f8a709a5adf571f287f017a8af91a989a882392f961f72f0977ceec517e4c6
	//C517E4C6  F0977CEE  2F961F72  89A88239  A8AF91A9  F287F017  A5ADF571    22F8A709
	System.out.printf("fy=");
	test_helper.ecc_printNumber(fy, 8);//15bc2c65750e3bbd4e76e3b8bce81eae6d8734861862a89e12fa8cd7d65418ee
	//D65418EE  12FA8CD7  1862A89E  6D873486  BCE81EAE  4E76E3B8  750E3BBD   15BC2C65
	//element_mul(f, f, f0);
	*/
    }

static  int mpz_sizeinbase(long[] in , int base,int length) 
	{
	int i=length-1;
	int j=0;
	int num=0;
	long p[]=new long[1];
	long o[]=new long[1];
	if(base==2)
	{
	while(i>=0)
		{
		p[0]=in[i];
		//copy(&in[i],p,1);
		if(p[0]>0)
			break;
		i--;
		}
	if(i==0&in[0]==0)return 0;
	num=32*i;
	copy(ecc.full4plusone,o,1);
	while(p[0]<o[0])
		{
		o[0]=o[0]>>1;
		j++;
		if(o[0]==0)break;
		}

		num=num-j+32;
		return num;

	}else return -1;

	}
static int mpz_tstbit(long[] in , int wei,int length){
	
	long p[]=new long[1];
	long o[]=new long[1];
int u32=(wei+1)/32;
	
	int yu32=(wei+1)%32;
	if(yu32>0)yu32--;
	else {
		//printf("zheng chu\n");
		yu32=31;
		u32--;
		}
	/*int u32=wei/32;
	if(u32+1>length)
		{
		return 0;
		};
	int yu32=wei%32-1;
	*/
	
	p[0]=in[u32];
	//copy(&in[u32],p,1);
	o[0]=p[0]>>yu32;
	o[0]=o[0]&0x01L;
	if(o[0]==0)
		return 0;
	else return 1;
	
	}
static void div_q_2(long[] n, long[] z,int length)
	{
	int i=0;
	long tempd[]=new long[16];
	copy(z,tempd,length);
	rshift_len(tempd,length);
	copy(tempd,n,length);
	

}
static void div_q_2_k(long[] n, long[] z,int k, int length)
	{
	int i=0;
	long tempd[]=new long[16];
	copy(z,tempd,length);
	for(i=k;i>0;i--)rshift_len(tempd,length);
	copy(tempd,n,length);
	

}
static int mpz_odd_p(long[] z)
{
long tempm=z[0];
tempm=tempm&0x01;
if(tempm==0)
	return 0;
else return 1;
}
static void zp_halve(long[] n, long[] z)
{
    long tempz[]=new long[9];
	
    if (mpz_odd_p(z)==1) {
		copy(z,tempz,8);
	add( tempz, ecc_prime_m,tempz,9);//q is odd,so addation is even
	div_q_2(tempz, tempz,9);
	copy(tempz,n,8);
    } else {
	div_q_2(n, z,8);
    }
}
static void lucas_odd(long[] v0, long[] v1,long[] in0,long[] in1, long[] t0,long[] t1, long[] cofactor)
//assumes cofactor is odd
//overwrites in and temp, out must not be in
//luckily this touchy routine is only used internally
{
    int j;
long templ[]=new long[16];
long v00[]=new long[8];
long v11[]=new long[8];
    copy(ecc.two,t0, 8);
    
	fieldAdd( in0,in0,ecc_prime_r,t1);
	if(isGreater(t1,ecc_prime_m,8)==1)
		{
		fieldSub(t1,ecc_prime_m,ecc_prime_m,t1);
		}
	
	
   /* fieldMult( in0,in0,templ,8);
    * fieldModP(t1,templ,16);*/
    copy( t0,v0,8);
    copy( t1,v1,8);
    copy(v0,v00,8);
    
    //j = mpz_sizeinbase(cofactor, 2,8) - 1; xing 16-03-29
    j = mpz_sizeinbase(cofactor, 2,4) - 1;
    //System.out.printf("j=%d\n",j);
    for (;j>=0;j--) {
    	//System.out.printf("j=%d\n",j);
	if (j==0) {
	  fieldMult( v0, v1,templ,8);
		fieldModP(v1,templ,16);
	    fieldSub( v1, t1,ecc_prime_m,v1);
	     fieldMult( v00, v0,templ,8);
		fieldModP(v0,templ,16);
	    fieldSub(v0, t0,ecc_prime_m,v0);
	    //test_helper.ecc_printNumber(v0, 8);
	    //test_helper.ecc_printNumber(v1, 8);
	    break;
	}
	if (mpz_tstbit(cofactor, j,4)==1) {
		//System.out.printf("mpz_tstbit(cofactor, j,4)=1\n");
	    fieldMult( v00, v1,templ,8);
		fieldModP(v0,templ,16);
	    fieldSub( v0, t1,ecc_prime_m,v0);
	    copy(v0,v00,8);
	     fieldMult( v1, v1,templ,8);
		fieldModP(v1,templ,16);
	    fieldSub( v1, t0,ecc_prime_m,v1);
	    //test_helper.ecc_printNumber(v0, 8);
	   // test_helper.ecc_printNumber(v1, 8);
	} else {
		//System.out.printf("mpz_tstbit(cofactor, j,4)=0\n");
	    fieldMult( v00, v1,templ,8);
		fieldModP(v1,templ,16);
	    fieldSub( v1, t1,ecc_prime_m,v1);
	     fieldMult( v00, v00,templ,8);
		fieldModP(v0,templ,16);
	    fieldSub(v0, t0,ecc_prime_m,v0);
	    copy(v0,v00,8);
	    //test_helper.ecc_printNumber(v0, 8);
	    //test_helper.ecc_printNumber(v1, 8);
	}
    }

    //assume cofactor = (q + 1) / r is even
    //(r should be odd and q + 1 is always even)
    //thus v0 = V_k, v1 = V_{k+1}
    //and V_{k-1} = P v0 - v1

    //so U_k = (P V_k - 2 V_{k-1}) / (P^2 - 4)
    //       = (2 v1 - P v0) / (P^2 - 4)


    copy(v0,v00,8);
	 fieldMult( v0, t1,templ,8);
		fieldModP(in0,templ,16);

	 fieldAdd( v1, v1,ecc_prime_r,v1);
  
fieldSub(v1, in0,ecc_prime_m,v1);
	 fieldMult( t1, t1,templ,8);
		fieldModP(t1,templ,16);

 fieldSub(t1, t0,ecc_prime_m,t1);
 
   fieldSub(t1, t0,ecc_prime_m,t1);

//fieldInv_4(t1,ecc_prime_m,ecc_prime_r,t1); //need to examine, xing 16-03-30 
   fieldInv(t1,ecc_prime_m,ecc_prime_r,t1);
fieldMult( v1, t1,templ,8);
		fieldModP(v1,templ,16);
    zp_halve(v00, v00);
		 fieldMult( v1, in1,templ,8);
		fieldModP(v1,templ,16);
  //  element_mul(v1, v1, in1);
		copy(v00,v0,8);
}


static  void a_tateexp(long[] outx,long[] outy, long[] inx,long[] iny, long[] tempx, long[] tempy,long[] cofactor)
{
    long  in1[]=new long[8]; 
	copy(iny,in1,8);
    //simpler but slower:
    //element_pow_mpz(out, f, tateexp);

    //1. Exponentiate by q-1
    //which is equivalent to the following
	/* System.out.printf("inx=");
	    test_helper.ecc_printNumber(inx,8);
	    System.out.printf("iny=");
	    test_helper.ecc_printNumber(iny,8);*/
    fi_invert(tempx,tempy, inx,iny);
   /* System.out.printf("tempx=");
    test_helper.ecc_printNumber(tempx,8);
    System.out.printf("tempy=");
    test_helper.ecc_printNumber(tempy,8);*/
    
    
    fieldSub(ecc_prime_m,iny,ecc_prime_m, iny);
    fi_mul( inx,iny,inx,iny, tempx,tempy);
   /* System.out.printf("inx=");
    test_helper.ecc_printNumber(inx,8);
    System.out.printf("iny=");
    test_helper.ecc_printNumber(iny,8);
    System.out.printf("tempx=");
    test_helper.ecc_printNumber(tempx,8);
    System.out.printf("tempy=");
    test_helper.ecc_printNumber(tempy,8);*/
    //2. Exponentiate by (q+1)/r

    //Instead of:
    //	element_pow_mpz(out, in, cofactor);
    //we use Lucas sequences (see "Compressed Pairings", Scott and Barreto)
    lucas_odd(outx,outy, inx,iny, tempx,tempy, cofactor);
}
static public void a_pairing_proj(long[]  outx,long[]  outy,long[]  in1x, long[]  in1y,long[]  in2x, long[]  in2y)
{
	long fx[]=new long[16];
	long fy[]=new long[16];
	long f1x[]=new long[16];
	long f1y[]=new long[16];
	long ff[]=new long[32];

	long f0x[]=new long[16];
	long f0y[]=new long[16];
	long f00[]=new long[32];
	long Vx[]=new long[16];
	long Vy[]=new long[16];
	long V1x[]=new long[16];
	long V1y[]=new long[16];
	long a[]=new long[8];
	long b[]=new long[8];
	long c[]=new long[8];
	int i=0;
	int n = 102;
	copy(in1x,Vx,8);
	copy(in1y,Vy,8);
	copy(ecc.one,fx,8);
	setZero(fy, 8);
   for (i=0; i<n; i++) {
   //f = f^2 g_V,V(Q)
   //where g_V,V = tangent at V
  // System.out.printf("i=%d\nfi_square:\n",i);

 // test_helper.ecc_printNumber(fx,8);
 // test_helper.ecc_printNumber(fy,8);
   fi_square(fx, fy,fx,fy);
 //  test_helper.ecc_printNumber(fx,8);
 //  test_helper.ecc_printNumber(fy,8);
   a_do_tangent(fx,fy,f0x,f0y,in2x,in2y,a,b,c,Vx,Vy);

 /*  test_helper.ecc_printNumber(a,8);
   test_helper.ecc_printNumber(b,8);
   test_helper.ecc_printNumber(c,8);
       System.out.printf("fx=");
       test_helper.ecc_printNumber(fx,8);
  System.out.printf("fy=");
test_helper.ecc_printNumber(fy,8);*/
//test_helper.ecc_printNumber(Vx,8);
//test_helper.ecc_printNumber(Vy,8);
  ec_double(Vx,Vy, Vx,Vy);
 // test_helper.ecc_printNumber(Vx,8);
 // test_helper.ecc_printNumber(Vy,8);
  
   //sleep(2);
   }
   //a_point_to_affine(e0, Vx,Vy,z,z2);
   copy(fx,f1x,8);
   copy(fy,f1y,8);
   copy(Vx,V1x,8);
   copy(Vy,V1y,8);

// sleep(5);// modified by xing, 2015.1.19
   n = 127;
   //exp2>exp1	i从exp1开始继续计算
   for (; i<n; i++) {
	  // System.out.printf("i=%d\nfi_square:\n",i);
   fi_square(fx, fy,fx,fy);
   /*System.out.printf("fx=");
   test_helper.ecc_printNumber(fx,8);
System.out.printf("fy=");
test_helper.ecc_printNumber(fy,8);*/
   a_do_tangent(fx,fy,f0x,f0y,in2x,in2y,a,b,c,Vx,Vy);
   ec_double(Vx,Vy, Vx,Vy);
   //test_helper.ecc_printNumber(Vx,8);
   //test_helper.ecc_printNumber(Vy,8);
   }
   fi_mul(fx,fy,fx,fy,f1x,f1y);

   a_do_line(fx,fy,f0x,f0y,in2x,in2y,Vx,Vy,V1x,V1y);
   /*System.out.printf("fx=");
   test_helper.ecc_printNumber(fx,8);
System.out.printf("fy=");
test_helper.ecc_printNumber(fy,8);
System.out.printf("f0x=");
test_helper.ecc_printNumber(f0x,8);
System.out.printf("f0y=");
test_helper.ecc_printNumber(f0y,8);*/
   a_tateexp(outx,outy, fx, fy,f0x,f0y, phikonr);

}


public static void naive_generic_pow(long[] x,long[] y, long[] a,long[] ay, long[] n,int length)
{
    int s;

    long[]  resultx=new long[8];
    long[]  resulty=new long[8];
    long[] tempn=new long[8];
	copy(n,tempn,4);

    if (isZero(n)==1) {
        ecc_copy(ecc.one,x,8);
		ecc_setZero(y,8);
        return;
    }

    ecc_copy(ecc.one,resultx,8);
	ecc_setZero(resulty,8);

    for (s = mpz_sizeinbase(n, 2,length) - 1; s >=0; s--) {
	fi_square(resultx,resulty,resultx, resulty);
	if (mpz_tstbit(n, s,length)==1) {
	    fi_mul(resultx,resulty,resultx, resulty, a,ay);
	}
    }
    copy( resultx,x,8);
    copy( resulty,y,8);
}
public static void naive_generic_pow_mpz(long[] x,long[] y, long[] a,long[] ay, long[] n)
{
    int s;

    long  resultx[]=new long[8];
	long  resulty[]=new long[8];
	long tempn[]=new long[8];
	copy(n,tempn,4);

    if (isZero(n)==1) {
        ecc_copy(ecc.one,x,8);
		ecc_setZero(y,8);
        return;
    }

    ecc_copy(ecc.one,resultx,8);
	ecc_setZero(resulty,8);

    for (s = mpz_sizeinbase(n, 2,4) - 1; s >=0; s--) {
	fi_square(resultx,resulty,resultx, resulty);
	if (mpz_tstbit(n, s,4)==1) {
	    fi_mul(resultx,resulty,resultx, resulty, a,ay);
	}
    }
    copy( resultx,x,8);
    copy( resulty,y,8);
}
static void curve_random_pointmul(long[] ax,long[]ay)
{
 long x[]=new long[4];
 test_helper.ecc_setRandom_len(x,4);
    fieldModO(x,x,4);//r
    ecc_ec_mult_len(ecc_g_point_x,ecc_g_point_y, x,4,ax,ay);
}

public static void ecc_setRandomPoint(long[] ax,long[]ay)
{
curve_random_pointmul(ax,ay);
}

public static void ecc_setRandomO(long[] z,int length)
{
		test_helper.ecc_setRandom_len(z,length);
	ecc_fieldModO(z,z,length);
}

static void fieldPow(long[] result,  long[] A,  long[] k, int length)//length<=8
	{
	long tempbase[]=new long[8];
	long kk[]=new long[8];
	long t1[]=new long[16];
	int i;
	i=0;
	//int t2[16];
	copy(A,tempbase,length);
	//ecc_printNumber(A,8);
	copy(k,kk,length);
	if(isZero_len(k,length)==1)
		{
		setZero(result,length);
		result[0]=1;
		return;
		}
	setZero(result,length);
	result[0]=1;
	
	while(isOne(kk)==0)
		{
		
		if(mpz_odd_p(kk)==1)
			{
			fieldMult(result,tempbase,t1,length);
			fieldModP(result,t1,length*2);
			fieldSub(kk, ecc.one, ecc_prime_m, kk); //lambda^2 - Px
			}
		div_q_2(kk,kk,length);
		//ecc_printNumber(kk,8);
		fieldMult(tempbase,tempbase,t1,length);
		fieldModP(tempbase,t1,length*2);

		}
	fieldMult(result,tempbase,t1,length);
	fieldModP(result,t1,length*2);
	
	}
/*int element_is_sqr(int[] px, int Length){
	//ecc_prime_m
	if(isZero_len(px,Length))
		return 1;
	



}

	*/

static int mpz_scan1_256(long[]   zz,int wei)
{
	int i;

	if(wei>0)	
		for(i=wei;i>0;i--)div_q_2(zz, zz,8);
	i=wei;
	while (mpz_odd_p(zz)==0)
		{
		div_q_2(zz, zz,8);
		i++;
		}
	return i;
}
static void mpz_setbit(long[] a, int k, int length)
//k is the k-th bit from right to left of a(binary)
{
	int q=(k-1)/32;
	int w=(k-1)%8;
	long r[]=new long[1];
	int b=2;
	long tempa[]=new long[1];
	
	tempa[0]=a[q];
	setZero(r,1);
	
		
	
	if(mpz_tstbit(a,k,length)==0){
		if(w==0)b=1;
		else 
		{
			while(w>0)
			{
				b=b*2;
				w--;
			}
			
		}
		a[q]+=b;
		
	}
	/*int r[]=new int[8];
	int b[]=new int[8];
	int[] tempp=&a[q];
	int tempa[]=new int[1];
	
	tempa[0]=a[q];
	setZero(b,8);
	setZero(r,8);

	if(isGreater(r,ecc.null32,8)==1)div_q_2_k(tempa, tempa,r, 1);
	      if(mpz_odd_p(tempa)==0)
		{
		b[0]=2;
		r[0]=k%8;
		fieldPow(b,b,r,8);
		b[q+1]=b[0];
		b[0]=0;
		fieldAdd(a,b,ecc_prime_r,a);
		}
	*/
	
	}
static void  element_sqrt(long[] a, long[] x, int length)
{


    int s;
    int i;
    long e[]=new long[8];
    long t[]=new long[8];
	long tt[]=new long[8];
    long t0[]=new long[8];
    long ginv[]=new long[8];
    long e0[]=new long[8];
	long e00[]=new long[16];
    long nqr[]=new long[]{0xFABA15E8L,0x0BFDEA58L ,0x891A678AL, 0x6691C93AL ,0xEF747E55L ,0xD4D66707L ,0xF13ED2BFL ,0x1EF162CEL};
    setZero(t,8);
    setZero(e,8);
    setZero(t0,8);
    setZero(ginv, 8);
    setZero(e0, 8);
    fieldInv( nqr,ecc_prime_m, ecc_prime_r,ginv); 
//ecc_printNumber(ginv,8);
    //let q be the order of the field
    //q - 1 = 2^s t, t odd
    sub(ecc_prime_m, ecc.one,t,8);
    s = mpz_scan1_256(t, 0);
    
   //printf("s=%d\n",s);
   //ecc_printNumber(t,8);
    setZero(e,8);
    for (i=2; i<=s; i++) {
	sub(ecc_prime_m, ecc.one,t0,8);
	div_q_2_k(t0, t0, i,8);
	fieldPow(e0, ginv, e,8);
	fieldMult( e0, a,e00,8);
	fieldModP(e0,e00, 16);
	fieldPow(e0, e0, t0,8);
	if (isOne(e0)==0) mpz_setbit(e, i-1,8);
    }
	
    fieldPow(e0, ginv, e,8);

    fieldMult( e0, a,e00,8);
	//ecc_printNumber(e00,16);
	fieldModP(e0,e00, 16);
	
	/*ecc_printNumber(t,8);
	ecc_printNumber(e0,8);*/

    fieldAdd(t, ecc.one, ecc_prime_r,t);
    //t[0]=t[0]+1;//29c3d0db49ec2f9447898eeaf3fc982e7a21b00cd00798c08b46bd90449a683a

	//ecc_printNumber(t,8);
    div_q_2(t, t, 8);
    div_q_2(e, e, 8);


    fieldPow(e0, e0, t,8);
    fieldPow(x, nqr, e,8);
    fieldMult( x, e0,e00,8);
	fieldModP(x,e00, 16);

}

static public void curve_point_decompress( long[] px,  long[] py,int a, int b)
	//a=1;b=0;//y^2=x^3+x :    y^2=x^3+ax+b, a=1,b=0
{

	long tempA[]=new long[8];
	long tempC[]=new long[8];
	long tempD[]=new long[16];
	if(isZero(px)==1){
	setZero(py, arrayLength);
		return;
	}
// do {
	fieldMult(px, px, tempD, arrayLength);
	fieldModP(tempA, tempD,16);//tempA=px^2
	
	fieldAdd(tempA, ecc.one, ecc_prime_r, tempC); //tempC = (px^2+1)
	fieldMult(tempC, px, tempD, arrayLength);
	fieldModP(tempA, tempD,16);//tempA=(px^2+1)*px=x^3+x
//	 } while (!element_is_sqr(tempA));	//is tempA a square 
//ecc_printNumber(tempA, 8);
	 element_sqrt( tempA,py,arrayLength);			//y=sqrt(tempA)
	 // //TODO: with 0.5 probability negate y-coord
}

static public int curve_point_tag( long[] px,  long[] py,int a, int b)
{
	long tempA[]=new long[8];
	curve_point_decompress( px,  tempA,a, b);
	if(ecc_isSame(py, tempA, arrayLength))
		return 0;
	else return 1;
}

static public void curve_point_decompress_i( long[] px,  long[] resulty,int a, int b,int tag)
{
	if(tag==0)
		curve_point_decompress( px,  resulty,a, b);
	else
	{
		long tempA[]=new long[8];
		curve_point_decompress( px,  tempA,a, b);
		ecc.fieldSub(ecc.ecc_prime_m,tempA,ecc.ecc_prime_m,resulty);
	
	}
	return;	
}

  static public int jacobi(long[] input,long[] n)
  {
    long[] e = new long[8];
    long[] a1 = new long[8];
    long[] n1 = new long[8];
    long[] a = new long[8];
    ecc_copy(input,a,arrayLength);
    int s=0;

    if(isZero_len(a,arrayLength) == 1)	//if a==0
      return 0;
    if(isOne_len(a,arrayLength) == 1) 	//if a==1
      return 1;
    
    if(a[0]%2 != 0){
      ecc_copy(a,a1,arrayLength);		//a1 = a
      setZero(e,arrayLength);     	//e  = 0
    }else{
      while(a[0]%2 == 0){
        div_q_2(a,a,arrayLength);		//a  = a/2
        ecc_copy(a,a1,arrayLength);		//a1 = a
        fieldAdd(e,ecc.one,ecc.ecc_prime_r,e);	//e  = e+1
      }
    }

    if(e[0]%2 == 0){
      s = 1;
    }else if(n[0]%8==1 || n[0]%8 == 7){
      s = 1;
    }else if(n[0]%8==3 || n[0]%8 == 5){
      s = -1;
    }

    if((n[0]%4 == 3) && (a1[0]%4 == 3))
      s = -s;
      
    fieldModNum(n1,n,a1,arrayLength);

    if(isOne_len(a1,arrayLength) == 1)	// if a1==1
      return s;
    else
      return s*jacobi(n1,a1);
  }
  
  static public boolean curve_is_sqr(long[] px)
  {
    if(isZero_len(px,arrayLength)==1)
      return true;
    return jacobi(px,ecc_prime_m)==1;
  }
  
  //result = A % B
  static public void fieldModNum(long[] result,long[] A,long[] B,int length) 
  {
    // This is used for value q1 and q3
    long[] q1_q3=new long[9];
    // This is used for q2 and a temp var
    long[]  q2_tmp=new long[18];
    //printf("who is modueld with length:%d\n",length);
    //ecc_printNumber(A,length);
    // return if the given value is smaller than the modulus
    //long[] offset=new long[1];
    if (length == arrayLength &&  isGreater(A, B, arrayLength)<= 0) {
      if (A != result)
        copy(A, result, length);
      return;
    }
    copy(A,result,length);
/*
    rshiftby(A, length, q1_q3, 9, ecc_prime_k - 1);
    //ecc_printNumber(q1_q3,9);
    fieldMult(ecc_prime_mu, q1_q3, q2_tmp, 9);
    //ecc_printNumber(q2_tmp,18);
    rshiftby(q2_tmp, 18, q1_q3, 8, ecc_prime_k + 1);
    //ecc_printNumber(q1_q3,8);
    fieldMult(q1_q3, B, q2_tmp, 8);
    //ecc_printNumber(q2_tmp,16);
    sub(A, q2_tmp, q1_q3, 9);
    //test_helper.ecc_printNumber(q1_q3,9);
    copy(q1_q3,result,8);*/
    //test_helper.ecc_printNumber(result,8);
    //printf("into while\n");
    while (isGreater(result, B, 8) >= 0) {
      sub(result, B, result, 8);
      //ecc_printNumber(result,8);
    }
    //printf("result is ");
    //ecc_printNumber(result,8);
  }
  
  static public void from_hash(long[] outx,long[] outy,long[] x,int length)
  {
    long p[]     = new long[8];
    long tempA[] = new long[8];
    long tempC[] = new long[8];
    long tempD[] = new long[16];
    long tempX[] = new long[8];
    ecc.ecc_copy(x,tempD,8);
    fieldModP(tempX,tempD,16);
    while(true){
      //p = x^3+x
      fieldMult(tempX,tempX,tempD,arrayLength);
      fieldModP(tempA,tempD,16);	//tempA = x^2
      fieldAdd(tempA,ecc.one,ecc.ecc_prime_r, tempC); //tempC = x^2+1
      fieldMult(tempC,tempX,tempD,arrayLength);
      fieldModP(p,tempD,16);	//p = x^3+x
      
      //is p a square number?
      if(curve_is_sqr(p))
        break;
      
      //x = x^2 + 1
      fieldMult(tempX,tempX,tempD,arrayLength);
      fieldModP(tempA,tempD,16);	//tempA = x^2
      fieldAdd(tempA,ecc.one,ecc.ecc_prime_r, tempX); //x = x^2+1
      System.out.printf("--");
      for(int i=7;i>=0;i--) {
        System.out.printf("%08x",tempX[i]);
      }
      System.out.printf("\n");
    }
    //outy = sqrt(p),outx = x
    element_sqrt(p,outy,arrayLength);	//y=sqrt(x^3+x)
    ecc.ecc_copy(tempX,outx,8);
    ecc.ecc_ec_mult_len(outx, outy, phikonr, 4, outx, outy);
  }
}



