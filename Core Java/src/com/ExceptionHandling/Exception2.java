package com.ExceptionHandling;
class InsufficientBalanceException extends Exception
	{
	private String message;
public InsufficientBalanceException()
	{
	this.message= "";
	}
	public InsufficientBalanceException(String message)
	{
		this.message= message;
	}
public String toString()
	{
	return "The withdraw amount must be less than the actual balance" + this.message;
	}
}
class Account
{
private static int bal=5500;
public static void withdraw(int withdraw_amt) throws Exception
	{
	if(bal<withdraw_amt)
		{
		throw new InsufficientBalanceException();
		}
	else
		{
		System.out.println("The Amount " +withdraw_amt+" was withdrawed ");
		}
	}
}
public class Exception2 {

public static void main(String[] args)  {
		try 
		{
			Account.withdraw(6000);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}