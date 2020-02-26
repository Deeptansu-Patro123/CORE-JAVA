package com.CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class q2 {

	public static void main(String[] args) {
		testHashSet();
		System.out.println("--------------------");
		testLinkedHashSet();
	}
	private static void testHashSet() {
		Set<String> hset = new HashSet<String>();
		hset.add("ABC");
		hset.add("XYZ");
		hset.add("PQR");
		
		Iterator<String> itr = hset.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}
	}
	private static void testLinkedHashSet() {
		LinkedHashSet<String> hset = new LinkedHashSet<String>();
		hset.add("ABC");
		hset.add("XYZ");
		hset.add("PQR");
		
		Iterator<String> itr = hset.iterator();
		while(itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
		}

}
}
