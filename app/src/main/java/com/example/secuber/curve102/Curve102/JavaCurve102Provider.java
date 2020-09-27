package com.example.secuber.curve102.Curve102;



public class JavaCurve102Provider extends BaseJavaCurve102Provider {
	protected JavaCurve102Provider()
	{
		super(new JCESha512Provider(), new JCESecureRandomProvider());
	}

	@Override
	public boolean isNative()
	{
		return false;
	}
}
