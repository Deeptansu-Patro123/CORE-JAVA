package com.LambdaExpression;
import java.util.*;
public class OrderLambda {
	String name,status;
	int price;
	public OrderLambda(String name, String status, int price) {
		super();
		this.name = name;
		this.status = status;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+" "+this.status+" "+this.price;
	}
	
	
}