package com.LambdaExpression;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> ar=new ArrayList<String>();
		ar.add("deeptansu");
		ar.add("messi");
		UnaryOperator<String> ur=(String s)->s.replaceAll(s,s.toUpperCase());
		check(ar,ur);
		System.out.println(ar);
	}
	
	public static void check(ArrayList<String> ar,UnaryOperator<String> ur) {
		for(int i=0;i<ar.size();i++) {
			String a=ur.apply(ar.get(i));
			ar.set(i,a);
		}
	}

}