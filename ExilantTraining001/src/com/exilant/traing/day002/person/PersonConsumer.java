package com.exilant.traing.day002.person;

import java.util.function.Consumer;

public class PersonConsumer implements Consumer<Person>{

	@Override
	public void accept(Person t) {
		
		System.out.println("Person Id :"+t.getPid()+0+" , "+"Person Name : "+t.getPersonName().toUpperCase());
		
	}

}
