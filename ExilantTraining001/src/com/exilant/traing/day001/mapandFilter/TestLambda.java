package com.exilant.traing.day001.mapandFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestLambda {
	
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(10,20,30,40,50,60,70);
			
		System.out.println("0------------ before 1.5 jdk-----------0");
		System.out.println();
		for(int i=0;i<numbers.size();i++) {
			System.out.print("-->"+numbers.get(i));
		}
		System.out.println();
		System.out.println("0------------ before 1.5 jdk-----------0");
		System.out.println();
		for(Integer i:numbers) {
			System.out.print("-->"+i);
		}
		
		
		System.out.println();
		System.out.println("-----------------Java 8 Labmda  ----------------");
		System.out.println("-----------------Java 8 Labmda (internal work)  ----------------");
		numbers.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.print("-->"+t);
				
			}
		});
		
		System.out.println();
		System.out.println("-----------------Java 8 Labmda (02)  ----------------");
		//Method References
		numbers.forEach(System.out::println);
		
		
		
		System.out.println();
		
		
	}

}
