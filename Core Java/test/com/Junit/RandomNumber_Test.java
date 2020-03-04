package com.Junit;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import org.junit.Test;

@RunWith(Parameterized.class)
public class RandomNumber_Test {
private RandomNumber randomGen;
private Integer randomNumber;
Random r;

public RandomNumber_Test()
{
}

@Parameterized.Parameters
public static Collection randomNumbers() 
{
	//System.out.println("Inside randomNumbers collection");
	return Arrays.asList(new Object[][] {{},{},{},{},{}});
	
}
@Before
public void initialize()
{
	r=new Random();	
	randomGen= new RandomNumber();
}

@Test
	public void test() 
	{
		int v=randomGen.randomGenertorTest();
		System.out.println(v);
		assertTrue(v<100);

	}

}