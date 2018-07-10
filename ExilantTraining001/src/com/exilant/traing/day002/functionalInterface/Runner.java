package com.exilant.traing.day002.functionalInterface;

public class Runner {
	public void execute(WorkerInterface workerInterface) {
		
		System.out.println("In Worker Interface...");
		workerInterface.doSomeWork();
		
	}

}
