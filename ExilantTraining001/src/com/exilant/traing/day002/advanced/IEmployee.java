package com.exilant.traing.day002.advanced;

public interface IEmployee {

	
	public void salary();
	
	public default void noOfWork() {
		System.out.println("Every employee has to work minimum of 8 hrs "+IEmployee.class.getSimpleName());
	}
	
	public static void congratulation() {
		System.out.println("Congratulation to exilant..");
	}
}
