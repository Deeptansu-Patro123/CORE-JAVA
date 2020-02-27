package com.Generics;
class WrapperGeneric<T>{
	private T t;
	public void setData(T t) {
		this.t=t;
	}
	public T getData() {
		return this.t;
	}
}
public class genericWrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WrapperGeneric<Integer> a=new WrapperGeneric<Integer>();
		a.setData(12);
		int b=a.getData();
		System.out.println("value="+b);
	}

}