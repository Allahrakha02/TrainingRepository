package com.exilant.traing.day002.person;

public class Person {
	
	private int pid;
	private String personName;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public Person(int pid, String personName) {
		super();
		this.pid = pid;
		this.personName = personName;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", personName=" + personName + "]";
	}
	
	
	

}
