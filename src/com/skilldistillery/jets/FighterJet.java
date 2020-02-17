package com.skilldistillery.jets;

public class FighterJet extends Jet implements CombatReady {

	

	@Override
	public String toString() {
		return "FighterJet [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + ", fly()="
				+ fly() + ", getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + ", getRange()=" + getRange()
				+ ", getPrice()=" + getPrice() + ", toString()=" + super.toString() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + "]";
	}

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);

	}

	

	

	@Override
	public void dogfight() {
		System.out.println(getModel() + " has an enemy in thier sights");		
		System.out.println(" BRRRRRT");		
	}
}
