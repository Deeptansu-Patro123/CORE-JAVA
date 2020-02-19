package com.ExceptionHandling;

class Exception3 implements AutoCloseable
	{
	public void close() throws Exception
		{
		System.out.println("The Autoclosable Main is Closed Succesfully");
		}
	public static void main(String [] args) throws Exception {
		try (Exception3 input = new Exception3())
			{
				System.out.println("now the line is inisde try method");
				int x=25/0;
				System.out.println("It should not be executed");
			}
		catch(ArithmeticException e)	{
			e.printStackTrace();
				}
		}
	}