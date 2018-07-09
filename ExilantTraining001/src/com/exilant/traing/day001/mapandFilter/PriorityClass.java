package com.exilant.traing.day001.mapandFilter;

public class PriorityClass {
	private int customerId;
	private String customerName;
	public String type;
	@Override
	public String toString() {
		return "PriorityClass [customerId=" + customerId + ", customerName=" + customerName + ", type=" + type + "]";
	}
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public PriorityClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PriorityClass(int customerId, String customerName, String type) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.type = type;
	}
	
	

}
