package com.greatlearning.employee;

public class Employee {

	private static String companyName = "crazygaming";

	private String firstName, lastName;

	public String getCompanyName()

	{

		return companyName;

	}

	public Employee(String firstName, String lastName) {

		this.firstName = firstName;

		this.lastName = lastName;

	}

	public String firstName() {

		return this.firstName.substring(0, 1).toUpperCase() + this.firstName.substring(1);

	}

	public String getEmployeename() {

		return firstName.toLowerCase() + lastName.toLowerCase();

	}

}
