package com.skilldistillery.jets;

public abstract class CargoPlane extends Jet implements CargoCarrier{
	private boolean cargo;
	
	
	
	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}

	

	public CargoPlane(String model, double speed, int range, long price, boolean cargo) {
		super(model, speed, range, price);
		this.cargo = cargo;
	}



	@Override
	public String toString() {
		String output = "Type : Cargo Plane," + " Model - " + model + " Speed - " + speed + " Range - " + range + " Price $" + price;
		return output;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (cargo ? 1231 : 1237);
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
		CargoPlane other = (CargoPlane) obj;
		if (cargo != other.cargo)
			return false;
		return true;
	}



	public String cargo() {
		String loadCargo = "Loading cargo";
		return loadCargo;
	}

	public String fly() {
		System.out.println("Cargo plane is in the clouds");
		return fly();
	}

	public boolean isCargo() { //
		return cargo;
	}

	public void setCargo(boolean cargo) {
		this.cargo = cargo;
	}

	
	
	
}
