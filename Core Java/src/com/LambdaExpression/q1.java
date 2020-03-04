package com.LambdaExpression;
@FunctionalInterface
interface arithmetic_operation
{
	public int mathoperation(int a,int b);
}
public class q1 {

	public static void main(String[] args) {
		arithmetic_operation addition=(a,b)->a+b;
		int x=addition.mathoperation(10,5);
		System.out.println("Addition is :"+x);
		arithmetic_operation substraction=(a,b)->a-b;
		int x1=substraction.mathoperation(10,5);
		System.out.println("Substraction is :"+x1);
		arithmetic_operation multiplication=(a,b)->a*b;
		int x2=multiplication.mathoperation(10,5);
		System.out.println("Multiplication is :"+x2);
		arithmetic_operation division=(a,b)->a/b;
		int x3=division.mathoperation(10,5);
		System.out.println("Division is :"+x3);

	}

}
