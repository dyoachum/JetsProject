package com.skilldistillery.jets;

public class PassengerPlane extends Jet{
	


	
	
	
	@Override
	public String toString() {
		return "PassengerPlane [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price
				+ ", fly()=" + fly() + ", getModel()=" + getModel() + ", getSpeed()=" + getSpeed() + ", getRange()="
				+ getRange() + ", getPrice()=" + getPrice() + ", toString()=" + super.toString() + ", hashCode()="
				+ hashCode() + ", getClass()=" + getClass() + "]";
	}

	public PassengerPlane(String model, double speed, int range, long price) {
		super(model, speed, range, price);
		
	
	}
	
	}
	
	













