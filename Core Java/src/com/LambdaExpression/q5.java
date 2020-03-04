package com.LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class q5 {

	static StringBuilder s=new StringBuilder("");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StringBuilder> ar=new ArrayList<StringBuilder>();
		ar.add(new StringBuilder("DEEptansu"));
		ar.add(new StringBuilder("Messi"));
		Consumer<StringBuilder> consumer=(StringBuilder s1)->s.append(s1.charAt(0));
		check(ar,consumer);
		System.out.println(s);
	}
	
	public static void check(List<StringBuilder> ar,Consumer c) {
		for(StringBuilder b:ar) {
			c.accept(b);
		}
	}


}
