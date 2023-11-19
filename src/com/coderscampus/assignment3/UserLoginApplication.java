package com.coderscampus.assignment3;

import java.util.Scanner;

public class UserLoginApplication {

	public static void main(String[] args) {

		UserService userService = new UserService();
		User[] users = userService.createUser();

		Scanner scanner = new Scanner(System.in);

		int loginAttempts = 5;

		while (loginAttempts > 0) {
			System.out.println("Enter username: ");
			String enteredUsername = scanner.nextLine();
			System.out.println("Enter password: ");
			String enteredPassword = scanner.nextLine();

			User loggedIn = validateLogin(users, enteredUsername, enteredPassword);

			if (loggedIn != null) {
				System.out.println("Welcome " + loggedIn.getName());
				scanner.close();
				return;
			} else {
				loginAttempts--;
				System.out.println("Invalid login, please try again. Remaining attempts: " + loginAttempts);
			}
		}

		System.out.println("Too many login attempts. You are now locked out.");
		scanner.close();

	}
// Login validation 
	private static User validateLogin(User[] users, String enteredUsername, String enteredPassword) {
		for (User user : users) {
			if (user.getUsername().equalsIgnoreCase(enteredUsername) && user.getPassword().equals(enteredPassword)) {
				return user;
			}
		}
		return null;

	}
}
