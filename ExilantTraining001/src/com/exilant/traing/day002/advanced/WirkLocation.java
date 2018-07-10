package com.exilant.traing.day002.advanced;

public interface WirkLocation {
	public void workLocation();
	public default void noOfWork() {
		System.out.println("Project on demand "+WirkLocation.class.getSimpleName());
	}

	
	public static void community() {
		System.out.println("All employee to pass background verification...");
	}
	
}
