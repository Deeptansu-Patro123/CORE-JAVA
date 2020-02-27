package com.Generics;
import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;

public class print_list
{
	
	public static void printAny(ArrayList <? extends Number> arrayList)
	{
			for(int i=arrayList.size()-1;i>=0;i--) 
			{
			System.out.println(arrayList.get(i));
			}		
	}
	public static void main(String[] args) 
	{
		ArrayList<Number> arrayList1 = new ArrayList<Number>();
		arrayList1.add(10);
		arrayList1.add(10.0);
		arrayList1.add(10);
		arrayList1.add(-25);
		//arrayList1.add("Messi");
		printAny(arrayList1);
	}

}