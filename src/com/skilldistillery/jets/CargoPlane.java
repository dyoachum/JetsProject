package com.skilldistillery.jets;

public class CargoPlane extends Jet implements CargoCarrier{
	
	
	
	
	public CargoPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
	}


	

	@Override
	public String toString() {
		return "CargoPlane [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + ", fly()="
				+ fly() + ", getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + ", getRange()=" + getRange()
				+ ", getPrice()=" + getPrice() + ", toString()=" + super.toString() + ", hashCode()=" + hashCode()
				+ ", getClass()=" + getClass() + "]";
	}




	@Override
	public void loadCargo() {
		System.out.println(getModel() + " is loading up the supplies.");		
	}
	public CargoPlane() {
		super();
	}
}



	
