package com.exilant.traing.day002.controller;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import com.exilant.traing.day002.person.Person;
import com.exilant.traing.day002.person.PersonConsumer;

public class PersonController {
	
	public static void main(String[] args) {
		
		
		List<Person> persons= Arrays.asList(
				new Person(101,"Gautam"),
				new Person(102, "Chandni"),
				new Person(103, "Siddhart"),
				new Person(103, "Rupa ")
				);
		//persons.forEach(System.out::println);
		PersonConsumer print= new PersonConsumer();
		persons.forEach(print);
		
		
		
		
		
	}

}
