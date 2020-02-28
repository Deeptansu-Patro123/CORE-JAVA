package com.CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;

class Employee
{
	private int id;
	//private String name;
	private double salary;
	public Employee(int id, double salary) {
		super();
		this.id = id;
		//this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ",salary=" + salary + "]";
	}
	public boolean equals(Object obj) {
       return true;
	}
	
//	@Override
    public int hashCode() {	
        return 25;
    }
}
public class q5 {

	public static void main(String[] args) {
		HashMap<Employee, String> map = new HashMap<>();
		map.put(new Employee(25,19980), "Deeptansu");
		map.put(new Employee(83,29000), "Messi");
		map.put(new Employee(71,36000), "Ronaldo");
		
       	
		Iterator<Employee> itr = map.keySet().iterator();
		while(itr.hasNext()) {
			Employee e = itr.next();
			System.out.println(e);
		}
		 
	
	}
// As there is a same hashcode during the iterator,so we only get the first value
}