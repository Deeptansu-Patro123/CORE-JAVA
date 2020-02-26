package com.CollectionFramework;
import java.util.TreeSet;
import java.util.Iterator;
class person implements Comparable<person>
{
	private String name;
	private double weight;
	private double height;
	public person(String name, double weight, double height) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", weight=" + weight + ", height=" + height + "]";
	}

	@Override
	public int compareTo(person p) {
		if(this.weight>p.weight)
		{
			return 11;
		}
		else if(this.weight<p.weight)
		{
			return -1;
		}
		else 
		{

			if(this.height>p.height) {
				return 1;
			}
			else if(this.height<p.height) {
				return -1;
			}
			else
				return 0;
		}
}
}

public class q1{
	public static void main(String[] args)  {
		testTreeSet();
	}
	private static void testTreeSet() {
		TreeSet<person> treeSet = new TreeSet<person>();
		treeSet.add(new person("Deeptansu",60.0,6.1));
		treeSet.add(new person("Lionel",50.0,5.1));
		treeSet.add(new person("Cristiano",40.0,4.1));
		treeSet.add(new person("Neymar",30.0,3.1));
		
		Iterator<person> itr = treeSet.iterator();
		while(itr.hasNext()) {
			person a = itr.next();
			System.out.println(a);
		}
	}
}




