package com.LambdaExpression;

import java.util.ArrayList;

public class OrderList {
	public static ArrayList<OrderLambda>  makeOrderList()
	{
		ArrayList<OrderLambda> ar=new ArrayList<OrderLambda>();
		OrderLambda or=new OrderLambda("Pizza","ACCEPTED",500);
		OrderLambda or1=new OrderLambda("Burger","REJECTED",400);
		OrderLambda or2=new OrderLambda("Fries","ACCEPTED",100);
		OrderLambda or3=new OrderLambda("Hotdog","ACCEPTED",150);
		ar.add(or);
		ar.add(or1);
		ar.add(or2);
		ar.add(or3);
		return ar;
		
	}
	public static ArrayList<OrderLambda> compareOrder(ArrayList<OrderLambda> ol,compareOrder co)
	{
		ArrayList<OrderLambda> ans=new ArrayList<OrderLambda>();
		for(OrderLambda o :ol)
		{
			if(co.compare(o))
			{
				ans.add(o);
			}
		}
		return ans;
	}
	public static void main(String args[])
	{
		ArrayList<OrderLambda> checkList=makeOrderList();
		compareOrder compareByStatus=(OrderLambda a)->a.getStatus().equals("ACCEPTED");
		compareOrder compareByPrice=(OrderLambda a)->a.getPrice()>100;
		System.out.println(compareOrder(checkList,compareByStatus));
		System.out.println(compareOrder(checkList,compareByPrice));
				
	}
	
}