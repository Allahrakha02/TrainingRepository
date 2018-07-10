package com.exilant.traing.day002.advanced;

public class ExilantEmployee  implements IEmployee,WirkLocation{

	@Override
	public void salary() {

		System.out.println("The Salary will decided by Project manager");
	}

	@Override
	public void workLocation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void noOfWork() {
		// TODO Auto-generated method stub
		WirkLocation.super.noOfWork();
	}
	


}
