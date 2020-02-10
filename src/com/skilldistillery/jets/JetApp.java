package com.skilldistillery.jets;

import java.util.Scanner;

public class JetApp {
	private Airfield airField = new Airfield();
static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		JetApp jetApp = new JetApp();
		System.out.println("Welcome to the AirField");
		jetApp.menu();
	}

	public void menu() {
		int choice = 0;
		while (choice != 9) {
		System.out.println("\nPick one");
		System.out.println("1) Display jets");
		System.out.println("2) Fly all jets");
		System.out.println("3) View fastest jet");
		System.out.println("4) View jet with longest range");
		System.out.println("5) Load all cargo Jets");
		System.out.println("6) DogFight!");
		System.out.println("7) Add a jet to the Fleet");
		System.out.println("8) Remove a jet from the Fleet");
		System.out.println("9) Quit ");
		choice = kb.nextInt();

		switch (choice) {
		case 1:
			// display all the jets in the AirField
			airField.displayJets();
			break;
		case 2:
			// tell each jet to fly
			airField.tellAllToFly();
			break;
		case 3:
			// view fastest jet
			break;
		case 4:
			// view jet with longest range
			break;
		case 5:
			// load cargo plane
			airField.cargo();
			break;
		case 6: // dogfight
			break;
		case 7: //add a jet
			break;
		case 8: //remove a jet
			break;
		case 9: // quit
			break;
			
			
		default:
			System.out.println("read the directions");
		}
	}

}
}
