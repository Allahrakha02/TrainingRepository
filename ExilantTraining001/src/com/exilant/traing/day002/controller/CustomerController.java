package com.exilant.traing.day002.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import com.exilant.traing.day002.predicate.Customer;

public class CustomerController {
	
	
	public static void main(String[] args) {
		
		List<Customer>customers= Arrays.asList(
				new Customer(101, "Allahrakha", 50000),
				new Customer(102, "Ramu", 15000),
				new Customer(103, "Anurag", 500),
				new Customer(104, "Rahul", 60000)
				);
		Predicate<Customer> earningMorethanfiveK=i->i.getEarning()>5000;
		Predicate<Customer> byNAme=i->i.getCustomerName().equalsIgnoreCase("ramu");
		List<Customer> ccustomersList=getCustomers(customers, earningMorethanfiveK);
		ccustomersList.forEach(System.out::println);
		List<Customer> ccustomersListforName=getCustomers(customers, byNAme);
		ccustomersListforName.forEach(System.out::println);
		
		
	}
	public static List<Customer> getCustomers(List<Customer>customers,Predicate<Customer> earningMorethanfiveK){
		List<Customer>customerslist= new ArrayList<>();
		for(Customer c:customers) {
			if(earningMorethanfiveK.test(c)) {
				customerslist.add(c);
			}
			
		}
		
		
		return customerslist;
	}

}
