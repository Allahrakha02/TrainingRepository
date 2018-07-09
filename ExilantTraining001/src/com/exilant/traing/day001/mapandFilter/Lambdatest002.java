package com.exilant.traing.day001.mapandFilter;

import java.util.Arrays;
import java.util.List;

public class Lambdatest002 {
	
	public static void main(String[] args) {
		
		
		List<Integer> numbers=Arrays.asList(4,46,465,4156,1545,645,64,564,565,556,454,554,56,456);
		System.out.println();
	//Without using lambda	
		System.out.println("------------ Normal Bubble Sort --------------");
		System.out.println("====================== Before Sort =========================");
		System.out.println(numbers);
		System.out.println();
		for(int i=0;i<numbers.size();i++) {
			for(int j=0;j<numbers.size();j++) {
				if(numbers.get(i)<numbers.get(j)) {
					int temp=numbers.get(i);
					numbers.set(i,numbers.get(j));
					numbers.set(j, temp);
				}
			}
			
		}
		System.out.println("====================== After Sort =========================");
		System.out.println(numbers);
	}

}
