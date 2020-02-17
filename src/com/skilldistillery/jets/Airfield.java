package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Airfield {
	static Scanner sc = new Scanner(System.in);
	List<Jet> jets = new ArrayList<>(5);
	
	

	public Airfield()  {
		readAndPopulateFromFile();
	}

	public List<Jet>  readAndPopulateFromFile() {
		
		try (BufferedReader read = new BufferedReader(new FileReader("Jets.txt"))){
			String fileInput;
			
				while ((fileInput = read.readLine()) != null) {
//			String[] jets = new String[4];
				String[] eachAtribute = fileInput.split(", ");
				String type = eachAtribute[0];
				String model = eachAtribute[1];
				double speed = Double.parseDouble(eachAtribute[2]);
				int range = Integer.parseInt(eachAtribute[3]);
				long price = Long.parseLong(eachAtribute[4]);
				
				if ( type.equals("FighterJet")) {
					jets.add(new FighterJet(model, speed, range, price));
				} else if (type.equals("CargoPlane")) {
					jets.add(new CargoPlane(model, speed, range, price));
					
				} else if (type.equals("PassengerPlane")) {
					jets.add(new PassengerPlane(model, speed, range, price));
				}
				}
				
				
			} catch ( IOException e) {
				System.err.println(e);			}
					
			return jets;
				}
					
				


	public void cargo() { // loadCargo
		for (Jet currentJet : jets) {
			if (currentJet instanceof CargoPlane) {
				CargoPlane jetPilot = (CargoPlane) currentJet;
				System.out.println("Looking at: " + jetPilot.getClass().getSimpleName());
				jetPilot.loadCargo();
				break;
			}
			System.out.println("Looking at: " + currentJet.getClass().getSimpleName());
		}
	}

	public void dogFight() {
		for (Jet currentJet : jets) {
			if (currentJet instanceof FighterJet) {
				FighterJet jetPilot = (FighterJet) currentJet;
				System.out.println("Looking at: " + jetPilot.getClass().getSimpleName());
				jetPilot.dogfight();
				break;
			}
			System.out.println("Looking at: " + currentJet.getClass().getSimpleName());
		}
	}

	public void tellAllToFly() { // tellAllToFly
		Iterator<Jet> it = jets.iterator();
		while (it.hasNext()) {
			it.next().fly();
		}


	}

	public void displayJets() { // displayJets
		for (Jet jet : jets) {
			if (jet != null) {
				System.out.println(jet);
			} else {
				break;
			}
		}
	}

	public void longestAircraftRange() {
		int zoom = 0;
		Jet longestAircraftRange = null;
		System.out.println("Aircraft with longest Range is: ");
		for (Jet jet : jets) {
			if (jet.getRange() > zoom) {
				zoom = jet.getRange();
				longestAircraftRange = jet;
			}

		}
		System.out.println(longestAircraftRange);
	}
	public void fastestAircraft() {
		double zoom = 0;
		Jet fastestAircraft = null;
		System.out.println("The Fastest Aircraft on the Airfield is: ");
		for (Jet jet : jets) {
			if(jet.getSpeed()> zoom) {
				zoom = jet.getSpeed();
				fastestAircraft = jet;
			}
			
		}
		System.out.println(fastestAircraft);
			
	}



	public void addJets() {
		System.out.println("Please select a type of Aircraft to add to the airfield (1-3: ");
		System.out.println("1. Fighter Jet");
		System.out.println("2. Cargo Plane");
		System.out.println("3. Passsenger Plane");
		int choice = sc.nextInt();
		System.out.println("Enter the model of the Aircraft: ");
		String model = sc.nextLine();
		System.out.println("What is the Aircraft's speed?");
		double speed = sc.nextDouble();
		System.out.println("What is the Aircraft's range?");
		int range = sc.nextInt();
		System.out.println("How much does the Aircraft cost?");
		long price = sc.nextLong();

		switch (choice) {
		case 1:
			jets.add(new FighterJet(model, speed, range, price));
			break;
		case 2:
			jets.add(new CargoPlane(model, speed, range, price));
			break;
		case 3:
			jets.add(new PassengerPlane(model, speed, range, price));
			break;
			default: 
				System.out.println("Please follow the directions.");
		}
		
	}
	public void removeAircraft() {
		System.out.println("Which aircraft would you like to remove? ");
		int scrap = 1;
		for (Jet jet : jets) {
			System.out.println(scrap + " - " + jet.getModel());
			int choice = sc.nextInt();
			jets.remove(choice -1);
		}
	}

}
































