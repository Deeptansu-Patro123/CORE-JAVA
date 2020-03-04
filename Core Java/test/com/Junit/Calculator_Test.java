package com.Junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Calculator_Test {
	Calculator c=null;
	@BeforeClass
	public static void beforeClass() {
	System.out.println("Before Test Class");
	}
	@AfterClass
	public static void afterClass() {
	System.out.println("After Test Class");
	}
	@Before
	public void before() {
	System.out.println("Before Test");
	c=new Calculator();
	}
	@After
	public void after() {
	System.out.println("After Test");
	}
	@Test
	public void testdivide() {
	assertEquals("Result",5,c.divide(10,2));
	}
	@Test(expected=java.lang.ArithmeticException.class)
	public void testdivide1() {
	assertEquals("Result",10,c.divide(10,0));
	}
	@Test
	@Ignore
	public void testdivide2() {
	assertEquals("Result",10,c.divide(10,0));
	}
	@Test (timeout = 1000)
	public void testinfinity() {
	while (true);
	}
}
