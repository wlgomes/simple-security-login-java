package testingskills.copy;

import java.util.ArrayList;
import java.util.Scanner;

public class UserData {

	static int chosenNumericalID;
	static String chosenStringID;
	static String chosenPassword;
	static Scanner numericalDataCollection = new Scanner(System.in);
	static Scanner stringDataCollection = new Scanner(System.in);

	static void idNumericLogin() {
		int countID = 0;
		int maxTries = 4;
		System.out.println("Welcome to World");
		System.out.println("Enter your ID: ");
		do {
			try {
				chosenNumericalID = numericalDataCollection.nextInt();
				if (chosenNumericalID < 100) {
					System.out.println("ID found" + "\nWelcome user " + chosenNumericalID);
					return;
				}

				if (chosenNumericalID > 100) {
					countID++;
					// Want to test the loop? if(countID != maxTries) {System.out.println(countID);}
					if (countID == maxTries || countID == maxTries - 1) {
						System.out.println("Too many attempts.Please try later.");
						break;
					}
					if (countID != maxTries) {
						if (true) {
							System.out.println("ID not found.Try again: ");
						} //use ternary ('condition') ? "printthis" : "printthat;
					}
				}
			} catch (Exception i) { // if string or text is added in the Scanner, app will just print the following:
				System.out.println("Please enter valid numeric characters.Try again later. ");
				System.exit(1);
				// try to repeat the thing and not go on to username part
			} // needs different while, here perhaps
		} while (true);
	}

	static void idStringLogin() {
		if (chosenNumericalID > 100) {
			System.out.println("Please contact support");
		} else {
			System.out.println("Please enter a username: ");
			chosenStringID = stringDataCollection.nextLine();
			System.out.println("Username " + chosenStringID + " defined for User " + chosenNumericalID);
		}
		

	}

	static void userPassword() {
		System.out.println("Please set a password : ");
		chosenPassword = stringDataCollection.nextLine();
		//work in progress!
	}
}
