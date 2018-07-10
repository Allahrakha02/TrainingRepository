package com.exilant.traing.test;

public class EmployeeThread002 implements Runnable {

	@Override
	public void run() {
		
		int i=1;
		while(i<=5) {
			System.out.println(i+") EmployeeThread002");
			i++;
		}
		
		
		
	}
	
	

}
