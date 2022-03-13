package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.credentialservices.CredentialService;
import com.greatlearning.employee.Employee;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("\nPlease Enter the first name :");

		String firstName = scanner.next();

		System.out.print("\nPlease Enter the last name :");

		String lastName = scanner.next();

		Employee emp = new Employee(firstName, lastName);

		CredentialService cService = new CredentialService();

		System.out.println("\nDear " + emp.firstName() + " your generated credentials are as follows:");

		cService.generateEmployeeEmail(emp.getEmployeename(), emp.getCompanyName());

		cService.generateEmployeePassword();
		
		cService.showCredentials();

		scanner.close();

	}

}
