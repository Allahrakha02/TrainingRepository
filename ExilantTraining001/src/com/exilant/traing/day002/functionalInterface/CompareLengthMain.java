package com.exilant.traing.day002.functionalInterface;


public class CompareLengthMain {

	public static String findLargest(String str, String str2, EmployeeInterface employeeInterface) {

		return employeeInterface.largestString(str, str2);

	}

	public static void main(String[] args) {

		EmployeeInterface whoIsLargest = (str1, str2) -> {
			if (str1.length() > str2.length()) {
				return str1;
			} else {

				return str2;
			}

		};
		System.out.println("Largest String is :" + findLargest("static", "Dynamic", whoIsLargest));

	}

}
