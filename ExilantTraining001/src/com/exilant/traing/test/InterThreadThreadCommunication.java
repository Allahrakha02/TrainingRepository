package com.exilant.traing.test;

public class InterThreadThreadCommunication {
	
	public static void main(String[] args) {
		
		EmployeeThread001 t1= new EmployeeThread001();
		
		//EmployeeThread002 t2= new EmployeeThread002();
		
		Thread t3= new Thread(t1);
		t3.start();
		

	}
	
	

}
