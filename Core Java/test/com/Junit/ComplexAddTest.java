package com.Junit;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ComplexAddTest {
	ComplexAdd c1;
	ComplexAdd c2;
	ComplexAdd cRes;

	
	public ComplexAddTest(int r1,int i1,int r2,int i2)
	{
		System.out.println("Inside constructor");
	
		c1=new ComplexAdd(r1,i1);
		c2=new ComplexAdd(r2,i2);
		
		cRes=new ComplexAdd((r1+r2),(i1+i2));
	}
	
	@Parameterized.Parameters
	public static Collection addComplex() {
		System.out.println("Inside collection");
		
		return Arrays.asList(new Object[][] {
			{1,2,3,4},{2,8,6,4}
			});

	}
	
	
	@Test
	public void test() {
		System.out.println("Inside test");
		ComplexAdd t=c1.add(c2);
		assertTrue((cRes.real==t.real)&&(cRes.imaginary==t.imaginary));
		
	}

}