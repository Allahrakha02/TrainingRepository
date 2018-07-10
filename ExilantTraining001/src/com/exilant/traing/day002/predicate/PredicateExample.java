package com.exilant.traing.day002.predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> greterThan=i->i>10;
		Predicate<Integer> lessThan=i->i<10;
		Predicate<Integer> inBetween=i->i<100&& i>30;
		Predicate<Integer> positiveRange=i->i>0;
		System.out.println(greterThan.test(200));
		
		
		List<Integer> numbers= Arrays.asList(12,23,34,45,-10,2,77);
		List<Integer> numbersmorethanten= filteredList(numbers, greterThan);
		
		System.out.println(numbersmorethanten);
		
		filteredList(numbers, inBetween).forEach(System.out::println);
		
	} 
	public static List<Integer> filteredList(List<Integer> numbers,Predicate<Integer> greterThan){
		
		List<Integer> filteredList=new ArrayList<>();
		for(Integer temp:numbers) {
			if(greterThan.test(temp)) {
				filteredList.add(temp);
			}
			
		}
		
				return filteredList;
		
	}
	
	
}
