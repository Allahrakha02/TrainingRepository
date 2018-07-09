package com.exilant.traing.test;

import java.util.Arrays;
import java.util.List;

public class TestDemo {
	
	
	public static void main(String[] args) {
		
		List<Integer> number= Arrays.asList(56,46,545,645,362,54,768);
		List<Integer> number1= Arrays.asList(56,46,545,645,362,54,768);
		List<Integer> number2= Arrays.asList(56,46,545,645,362,54,768);
		List<List<Integer>> numbers= Arrays.asList(number,number1);

		//numbers.set(2,number2);
		System.out.println(numbers);
		
		for(List<Integer> is:numbers ) {
			
			System.out.println("==>"+is);
			
		}
	}

}
