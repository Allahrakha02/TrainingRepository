package com.exilant.traing.day001.mapandFilter;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {
public static void main(String[] args) {
	List<Integer> numbers=Arrays.asList(10,20,30,40,50,60,70);
	int result=0;
	
	for(Integer temp:numbers) {
		result += temp;
	}
	System.out.println("Result :"+result);
	
	System.out.println("================= In java 8  ================");
	System.out.println(numbers.stream().
			map(e->e).
			reduce((res,e)->res+e));
}
}
