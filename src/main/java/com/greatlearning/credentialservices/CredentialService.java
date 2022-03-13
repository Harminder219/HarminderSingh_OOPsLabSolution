package com.greatlearning.credentialservices;

import java.util.Scanner;

import com.greatlearning.passwordgenerator.PasswordGenerator;


public class CredentialService {

	private int choice;

	private Boolean flag;

	private String employeeDepartment;

	private String employeeEmail;

	private String employeePassword;

	Scanner scanner = new Scanner(System.in);

	public CredentialService() {

		do {

			flag = false;

			System.out.println(
					"\nPlease enter the department from the choice : \n1.Technical \n2.Admin \n3.Human Resources \n4.Legal");

			choice = scanner.nextInt();

			switch (choice) {

			case 1: {

				employeeDepartment = "tech";

				break;

			}

			case 2: {

				employeeDepartment = "admin";

				break;

			}

			case 3: {

				employeeDepartment = "hr";

				break;

			}

			case 4: {

				employeeDepartment = "legal";

				break;
			}

			default:

				System.out.println("\nPlease enter the valid choice");

				flag = true;

			}

		} while (flag);

	}

	public void generateEmployeeEmail(String employeeName, String companyName) {

		employeeEmail = "\n" + "Email        ---> " + employeeName + '@' + employeeDepartment + "." + companyName
				+ ".com";

	}

	public void generateEmployeePassword() {

		PasswordGenerator passwordgenerator = new PasswordGenerator();

		employeePassword = passwordgenerator.generatePassword();

	}
	
	public void showCredentials()
	{
		
		System.out.println(employeeEmail);
		
		System.out.println(employeePassword);
		
	}

}
