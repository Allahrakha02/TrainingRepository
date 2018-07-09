package com.exilant.traing.day001.onlyLambda;

//Simple to show how to work Functional Interface
//if you have an interface that interface has exactly 1 i
//method then that interface cane be eligible to be functional interface
@FunctionalInterface
public interface MathOperation {

	int operation(int num1,int num2);
	

}
