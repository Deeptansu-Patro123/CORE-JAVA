package com.Junit;

public class ComplexAdd {
	 public double real;
	 public double imaginary;

	public ComplexAdd(double real,double imaginary){
	this.real=real;
	this.imaginary=imaginary;
  }

	public ComplexAdd add(ComplexAdd c){
	double sreal=this.real+c.real;
	double simaginary=this.imaginary + c.imaginary;
	ComplexAdd temp =new ComplexAdd(sreal,simaginary);
	return temp;
 }
	



}