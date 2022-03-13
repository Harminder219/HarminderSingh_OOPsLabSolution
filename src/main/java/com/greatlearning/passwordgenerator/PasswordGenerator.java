package com.greatlearning.passwordgenerator;

import java.util.Random;

public class PasswordGenerator {

	private String smallLetter = "abcdefghijklmnopqrstuvwxyz";

	private String capitalLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	private String specialCharacters = "!@#$";

	private String numbers = "0123456789";

	private String combinedCombination = smallLetter + capitalLetter + specialCharacters + numbers;

	private char[] password = new char[8];

	Random random = new Random();

	public String generatePassword() {

		password[0] = smallLetter.charAt(random.nextInt(smallLetter.length()));

		password[1] = capitalLetter.charAt(random.nextInt(capitalLetter.length()));

		password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));

		password[3] = numbers.charAt(random.nextInt(numbers.length()));

		for (int i = 4; i < password.length; i++) {

			password[i] = combinedCombination.charAt(random.nextInt(combinedCombination.length()));

		}

		return "\nPassword     ---> " + String.valueOf(password);

	}

}
