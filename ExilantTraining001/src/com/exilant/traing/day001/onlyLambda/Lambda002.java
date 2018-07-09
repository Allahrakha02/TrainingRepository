package com.exilant.traing.day001.onlyLambda;

public class Lambda002 {
	
	public static int operate(int num1,int num2,MathOperation opr) {
		return opr.operation(num1, num2);
	}
	public  static int operatated(int num1,int num2,MathOperation opr) {
		return opr.operation(num1, num2);
	}
public static void main(String[] args) {
	MathOperation add=( num1, num2)->num1+num2;
	System.out.println(operate(30, 20, add));
}
}
