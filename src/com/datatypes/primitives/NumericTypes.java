package com.datatypes.primitives;

public class NumericTypes
{

	public static void main(String[] args)
	{
		NumericTypes nt = new NumericTypes();
		nt.doubleToOtherConversion();
	}
	
	public void doubleToOtherConversion()
	{
		@SuppressWarnings("deprecation")
		Double object = new Double("2.4");
        int a = object.intValue();
        System.out.println("a:: "+a);
        byte b = object.byteValue();
        System.out.println("b:: "+b);
        float d = object.floatValue();
        System.out.println("d:: "+d);
        double c = object.doubleValue();
        System.out.println("c:: "+c);
 
        System.out.println(a + b + c + d );
	}
}
