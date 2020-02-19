package com.ExceptionHandling;

public class Exception1b {
	public static void main(String args[])
	{
		int x=10,y=5;
		try {
			int division = x / y;
			try {
			int ary[] = new int[5];
			ary[4] = 34;
			}
			catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			}
			}
			catch(ArithmeticException e) {
			e.printStackTrace();
			}
			
	}
}
