package com.ExceptionHandling;

public class Exception1 {
	public static void main(String args[])
	{
		int x=10;
		int y=5;
		try {
			System.out.println("Getting division");
			int division = x/y;
			System.out.println("Division = " + division);
			}
		catch(Exception e) {
			e.printStackTrace();
		}	
		/*catch(ArithmeticException e) {
			e.printStackTrace();
			}*/
			
	}

}
