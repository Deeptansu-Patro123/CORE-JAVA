package com.Generics;

import java.util.HashMap;
import java.util.Iterator;

public class printMap_Key {
	
	public static void printHashMap(HashMap<? extends Number,?> h)
	{
		Iterator<? extends Number> itr=h.keySet().iterator();
		while(itr.hasNext())
		{
			Number n=itr.next();
			System.out.println(n+" "+h.get(n));
		}
	}
public static void main(String args[])
{
	HashMap<Integer, String> h1=new HashMap<Integer, String>();
	h1.put(15, "messi");
	HashMap<Float, Float> h2=new HashMap<Float,Float>();
	h2.put(15.6f,15.5f);
	printHashMap(h1);
	printHashMap(h2);
	
}
}