package com.example.secuber.curve102.ecc;

public class EccFeElement extends EccPoint{
    public EccFeElement()
    {
        super();
    }
    public EccFeElement(long[] x,long[] y)
    {
        super(x,y);
    }
    private EccFeElement(EccNum x,EccNum y)
    {
    }

    public static EccFeElement scalarMultiplication(EccFeElement fe,EccNum num)
    {
        EccFeElement result = new EccFeElement();
        ecc.naive_generic_pow_mpz(result.x.getBuffer(),
                                  result.y.getBuffer(),
                                  fe.x.getBuffer(),
                                  fe.y.getBuffer(),
                                  num.getBuffer());
        return result;
    }
}
