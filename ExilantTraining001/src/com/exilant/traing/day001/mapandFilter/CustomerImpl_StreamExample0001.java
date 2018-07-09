package com.exilant.traing.day001.mapandFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// to show working of map on the customer


public class CustomerImpl_StreamExample0001 {

	public static void main(String[] args) {

		List<Customer> customers = Arrays.asList(
				new Customer(101, "Ramu", 500, "CUSTOMER001"),
				new Customer(102, "Allahrakha", 16500, "CUSTOMER002"),
				new Customer(103, "Anuj", 5500, "CUSTOMER003"),
				new Customer(104, "Puja", 5600, "CUSTOMER004"),
				new Customer(105, "Tanmoyee", 1500, "CUSTOMER005"));

		/*
		 * List<PriorityClass> priorityOfCustomer=Arrays.asList( new
		 * PriorityClass(customers.get(0).getCustomerId(),customers.get(0).
		 * getCustomerName(),"Gold"), new
		 * PriorityClass(customers.get(1).getCustomerId(),customers.get(0).
		 * getCustomerName(),"Platinum"), new
		 * PriorityClass(customers.get(2).getCustomerId(),customers.get(0).
		 * getCustomerName(),"Silver"), new
		 * PriorityClass(customers.get(3).getCustomerId(),customers.get(0).
		 * getCustomerName(),"Gold"), new
		 * PriorityClass(customers.get(4).getCustomerId(),customers.get(0).
		 * getCustomerName(),"Platinum") );
		 */

		// List<PriorityClass> priorityCustomers = new ArrayList<>();

		filterCustomer001(customers).forEach(System.out::println);

		// In java 8

	}
	public static List<PriorityClass> filterCustomer003(List<Customer> customers) {
		
		//customers.stream().filter(temp -> temp.getPurchase()>5000)
		return null;
		
	}
	public static List<PriorityClass> filterCustomer002(List<Customer> customers) {

		List<PriorityClass> priorityCustomers = customers.stream().filter(temp -> temp.getPurchase() >= 5000)
				.map(temp -> {
					return new PriorityClass(temp.getCustomerId(), temp.getCustomerName(), "Gold");
				}).collect(Collectors.toList());

		return priorityCustomers;

	}

	public static List<PriorityClass> filterCustomer001(List<Customer> customers) {

		List<PriorityClass> priorityCustomers = customers.stream().map(temp -> {
			if (temp.getPurchase() >= 3000 && temp.getPurchase()<=9999) {
				return new PriorityClass(temp.getCustomerId(), temp.getCustomerName(), "Gold");

			} else if (temp.getPurchase() >= 10000) {
				return new PriorityClass(temp.getCustomerId(), temp.getCustomerName(), "Platinum");
			} else {
				return new PriorityClass(temp.getCustomerId(), temp.getCustomerName(), "Silver");
			}

		}).collect(Collectors.toList());
		return priorityCustomers;

	}

	// Syntex is upto jdk 1.7
	public static List<PriorityClass> filterCustomer(List<Customer> customers) {
		List<PriorityClass> priorityCustomers = new ArrayList<>();

		for (Customer temp : customers) {
			if (temp.getPurchase() >= 5000) {
				priorityCustomers.add(new PriorityClass(temp.getCustomerId(), temp.getCustomerName(), "Gold"));
			} else if (temp.getPurchase() >= 10000) {
				priorityCustomers.add(new PriorityClass(temp.getCustomerId(), temp.getCustomerName(), "Platinum"));
			} else {
				priorityCustomers.add(new PriorityClass(temp.getCustomerId(), temp.getCustomerName(), "Silver"));
			}
		}

		return priorityCustomers;
	}

}
