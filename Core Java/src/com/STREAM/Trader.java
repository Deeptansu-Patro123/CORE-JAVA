package com.STREAM;

import java.util.Comparator;

public class Trader implements Comparator {
	public String name; 
	public String city;
	public Trader() {}
	public Trader(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Trader [name=" + name + ", city=" + city + "]";
	}
	public int compare(Object o1, Object o2) {  
		Trader s1=(Trader)o1;  
		Trader s2=(Trader)o2;  
		  
		return s1.name.compareTo(s2.name);   
		}
}