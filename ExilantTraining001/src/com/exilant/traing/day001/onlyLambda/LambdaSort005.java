package com.exilant.traing.day001.onlyLambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.exilant.traing.day001.mapandFilter.Customer;

public class LambdaSort005 {
	
	
	public static void main(String[] args) {
		List<Customer> customers = Arrays.asList(
				new Customer(101, "Ramu", 500, "CUSTOMER001"),
				new Customer(102, "Allahrakha", 16500, "CUSTOMER002"),
				new Customer(103, "Anuj", 5500, "CUSTOMER003"),
				new Customer(104, "Puja", 5600, "CUSTOMER004"),
				new Customer(105, "Tanmoyee", 1500, "CUSTOMER005")
				);
		
		
Collections.sort(customers,new Comparator<Customer>() {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		return o1.getCustomerName().compareTo(o2.getCustomerName());
	}
});
		
System.out.println("After sort not using Lambda");

		customers.forEach(System.out::print);
		System.out.println();
		System.out.println("After sort  using Lambda");
		System.out.println();
		customers.sort((c1,c2 )->(int)c1.getPurchase()-(int)c2.getPurchase()
				);
		customers.forEach(System.out::print);
		
		Comparator<Customer> ordersort=(c1,c2)->
		c1.getDesignation().compareTo(c2.getDesignation());
		Collections.sort(customers,ordersort);
		//System.out.println(ordersort.reversed());
		customers.forEach(System.out::print);		
	}

	
	
	
}
