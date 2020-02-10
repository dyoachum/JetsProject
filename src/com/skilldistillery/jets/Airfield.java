package com.skilldistillery.jets;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Airfield {
	List<Jet> jets = new ArrayList<>();
	
	public Airfield() {
		readAndPopulateFromFile();
	}

	public void Airfield(String Jets) throws IOException {
		try {
			BufferedReader read = new BufferedReader(new FileReader("Jets.txt"));
			String fileInput;
			while ((fileInput = read.readLine()) != null) {
//			String[] jets = new String[4];
			String jets[] = fileInput.split(", ");
			String type = jets[0];
			String model = jets[1];
			double speed = Double.parseDouble(jets[2]);
			int range = Integer.parseInt(jets[3]);
			long price = Long.parseLong(jets[4]);
			
			if ( type.equals("FighterJet")) {
				jets.add(new FighterJet(model, speed, range, price));
			} else if (type.equals("CargoPlane")) {
				jets.add(new CargoPlane(model, speed, range, price));
				
			} else if (type.equals("PassengerPlane")) {
				jets.add(new PassengerPlane(model, speed, range, price, tickets));
			}
			
			
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	public void cargo() { 				//loadCargo
		for (Jet currentJet : jets) {
			if (currentJet instanceof CargoPlane) {
				CargoPlane jetPilot = (CargoPlane) currentJet;
				System.out.println("Looking at: " + jetPilot.getClass().getSimpleName());
				jetPilot.cargo();
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
				jetPilot.isDogFight();
				break;
			}
			System.out.println("Looking at: " + currentJet.getClass().getSimpleName());
		}
	}

	public List<Jet> readAndPopulateFromFile() {
		// open and read from file
		jets.add(new FighterJet("A10-Warthog", 439, 2580, 18800000, true));
		jets.add(new CargoPlane("C-12 Huron", 333, 2075, 6000000, true));
		jets.add(new PassengerPlane("SouthWest", 320, 5570, 89000000, "Tickets please", true));

		return jets;
	}

	public void tellAllToFly() {   // tellAllToFly
		Iterator<Jet> it = jets.iterator();
		while (it.hasNext()) {
			it.next().fly();
		}

//		for (Chef ch : chef) {
//			ch.cook();
//		}
	}

	public void displayJets() {  //  displayJets
		for (Jet jetPilot : jets) {
			System.out.println(jets);
		}
	}
}
