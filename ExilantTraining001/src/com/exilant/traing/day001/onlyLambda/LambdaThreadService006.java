package com.exilant.traing.day001.onlyLambda;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class LambdaThreadService006 {
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		executorService.execute(new Runnable() {

			@Override
			public void run() {
				for(int i=1;i<2;i++) {
					System.out.println(i+") in Normall Thread");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}
		});
		
		executorService.execute(()->{
			for(int i=1;i<2;i++) {
				System.out.println(i+") in Lambda Thread");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		executorService.shutdown();
		ExecutorService ex2=Executors.newSingleThreadExecutor();		
		
		Set<Callable<String>> callabels=initilizingCallable();
		String result=ex2.invokeAny(callabels);
		ex2.invokeAll(callabels);
		
		
		//ex2.shutdown();
	}

	public static Set<Callable<String>> initilizingCallable(){
		Set<Callable<String>> callables= new HashSet<Callable<String>>();
		
		callables.add(()->"1st Callable");
		callables.add(()->"2nd Callable");
		callables.add(()->"3rd Callable");
		callables.add(()->"4th Callable");
		callables.add(()->"5th Callable");
		
		callables.add(new Callable<String>() {

			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				return "callable annonymous";
			}
		});
		return callables;
	}
	
}
