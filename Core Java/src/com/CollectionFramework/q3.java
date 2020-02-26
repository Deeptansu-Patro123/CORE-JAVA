package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class q3 {

	public static void main(String[] args)  {
	testArrayList();	
	}
	private static void testArrayList()  {
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("Deeptansu");
		arrayList.add("Messi");
		arrayList.add("Ronaldo");
		arrayList.add("Neymar");
		arrayList.add("Dembele");
		Iterator<String> itr = arrayList.iterator();
		for(int i=arrayList.size();i>0;i--) {
			System.out.println(arrayList.get(i-1));
		}
	}

}
