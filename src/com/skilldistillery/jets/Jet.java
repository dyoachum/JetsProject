package com.skilldistillery.jets;

import java.text.DecimalFormat;

	


public abstract class Jet {
	protected String model;
	protected double speed;
	protected int range;
	protected long price;
	public Jet() {
		
	}
	
	public Jet(String model, double speed, int range, long price) {
		super();
		this.model = model;
		this.speed = speed;
		this.range = range;
		this.price = price;
	}

	public String fly() {
		DecimalFormat deciForm = new DecimalFormat("#.##");
		double flightTime = range / speed;
		String fTString = deciForm.format(flightTime);
		double flightTimeDbl = Double.parseDouble(fTString);
		int hours = (int) ((flightTimeDbl*60/60));
		int minutes = (int) ((flightTimeDbl*60)%60);
		
		System.out.println("The " + model + " flies at " + speed + " MPH with a distance of " + range 
				+ " miles in " + hours + " hours and " + minutes + " minutes.");
		return fTString;
		
	}
		
	

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	

	@Override
	public String toString() {
		return "Jet [model=" + model + ", speed=" + speed + ", range=" + range + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + (int) (price ^ (price >>> 32));
		result = prime * result + range;
		long temp;
		temp = Double.doubleToLongBits(speed);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jet other = (Jet) obj;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (price != other.price)
			return false;
		if (range != other.range)
			return false;
		if (Double.doubleToLongBits(speed) != Double.doubleToLongBits(other.speed))
			return false;
		return true;
	}

}
