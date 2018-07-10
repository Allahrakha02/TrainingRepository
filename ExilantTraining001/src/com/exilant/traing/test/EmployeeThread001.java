package com.exilant.traing.test;

public class EmployeeThread001 extends EmployeeThread002 implements Runnable {

	@Override
	public void run() {
		EmployeeThread002  e2 = new EmployeeThread002();
		Thread t2=  new Thread(e2);
		t2.start();
		try {
			t2.join(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int i=1;
		while(i<=5) {
			System.out.println(i+") EmployeeThread001");
			i++;
		}
		
		
		
	}
	
	

}
