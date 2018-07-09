package com.exilant.traing.day001.mapandFilter;

public class Customer {
	private int customerId;
	private String customerName;
	private double purchase;
	private String designation;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getPurchase() {
		return purchase;
	}

	public void setPurchase(double purchase) {
		this.purchase = purchase;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Customer(int customerId, String customerName, double purchase, String designation) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.purchase = purchase;
		this.designation = designation;
	}

	public Customer() {
		super();
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", purchase=" + purchase
				+ ", designation=" + designation + "]";
	}

}
