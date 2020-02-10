package com.skilldistillery.jets;

public abstract class FighterJet extends Jet implements CombatReady {
	private boolean dogFight;
	
	
	public boolean isDogFight() {
		return dogFight;
	}

	public void setDogFight(boolean dogFight) {
		this.dogFight = dogFight;
	}

	public FighterJet(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
	}

	public FighterJet(String model, double speed, int range, long price, boolean dogFight) {
		super(model, speed, range, price);
		this.dogFight = dogFight;
	}





	@Override
	public String toString() {
		String output = "Type : Fighter Jet," + " Model - " + model + " Speed - " + speed + " Range - " + range + " Price $" + price;
		return output;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (dogFight ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FighterJet other = (FighterJet) obj;
		if (dogFight != other.dogFight)
			return false;
		return true;
	}

	@Override
	public String fly() {
		String output = "Maverick is in the sky";
		return output;
	}

	

	
}
