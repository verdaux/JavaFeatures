package com.datatypes.primitives;

import java.util.Arrays;

public class CalcEngine
{

	public static void main(String[] args)
	{
		CalcEngine ce = new CalcEngine();
		ce.doCalc();
	}
	
	public void doCalc()
	{
		double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
		double[] rightVals = {50.0d,92.0d,17.0d,3.0d};
		char[] optCodes = {'d','a','s','m'};
		double[] results = new double[optCodes.length];
		
		for (int i = 0; i < optCodes.length; i++)
		{
			switch (optCodes[i])
			{
				case 'a':
				{
					results[i] = leftVals[i] + rightVals[i];
					break;
				}
				case 's':
				{
					results[i] = leftVals[i] - rightVals[i];
					break;
				}
				case 'd':
				{
					//results[i] = leftVals[i] / rightVals[i];
					results[i] = rightVals[i] == 0 ?  0 :  leftVals[i] / rightVals[i]; 
					break;
				}
				case 'm':
				{
					results[i] = leftVals[i] * rightVals[i];
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + optCodes[i]);
			}
		}
		
		for (double d : results)
		{
			System.out.println(Arrays.asList(d));
		}
		
	}
}
