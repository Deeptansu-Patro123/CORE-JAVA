package com.ExceptionHandling;

public class Exception1c {

	public static void main(String[] args) {
		int x=10;
		int y=0;
		try {
			System.out.println("Getting division");
			int division = x/y;
			System.out.println("Division = " + division);
			}
		catch(Exception e) {
			e.printStackTrace();
		}	
		finally
		{
		System.out.println("Done");
		}

	}

}
