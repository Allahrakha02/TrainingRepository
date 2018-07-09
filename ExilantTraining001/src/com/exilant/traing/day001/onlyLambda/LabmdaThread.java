package com.exilant.traing.day001.onlyLambda;

public class LabmdaThread {

	public static void main(String[] args) {
		
		new Thread( new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				try {
					
					for(int i=1;i<=100;i++) {
						System.out.println("from implementation "+i);
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		}).start();
		
		
	new Thread(()->
		{
			try {
				for(int i=1;i<=100;i++) {
					System.out.println("from lambda "+i);
					Thread.sleep(1000);
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}).start();
		

		
	}
	
	
	
}
