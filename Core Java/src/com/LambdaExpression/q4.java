package com.LambdaExpression;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class q4 {

	public static void main(String[] args) {
		testArrayList();
	}
	private static void testArrayList()  {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Deeptansu");
		arrayList.add("Messi");
		arrayList.add("Ronaldo");
		arrayList.add("Neymar");
		arrayList.add("Dembele");
		
		arrayList.removeIf(p -> p.length()%2==0);
		System.out.println(arrayList);
	}
	
}
	


