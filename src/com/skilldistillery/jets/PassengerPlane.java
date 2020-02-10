package com.skilldistillery.jets;

public abstract class PassengerPlane extends Jet{
	private String tickets;
	private boolean Passengers;
	
	
	public PassengerPlane(String model, double speed, int range, long price, String tickets) {
		super(model, speed, range, price);
		this.tickets = tickets;
	}
	public PassengerPlane(String model, double speed, int range, long price, String tickets, boolean passengers) {
		super(model, speed, range, price);
		this.tickets = tickets;
		Passengers = passengers;
	}
	public String getTickets() {
		return tickets;
	}
	public void setTickets(String tickets) {
		this.tickets = tickets;
	}
	public boolean isPassengers() {
		return Passengers;
	}
	public void setPassengers(boolean passengers) {
		Passengers = passengers;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + (Passengers ? 1231 : 1237);
		result = prime * result + ((tickets == null) ? 0 : tickets.hashCode());
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
		PassengerPlane other = (PassengerPlane) obj;
		if (Passengers != other.Passengers)
			return false;
		if (tickets == null) {
			if (other.tickets != null)
				return false;
		} else if (!tickets.equals(other.tickets))
			return false;
		return true;
	}
	@Override
	public String toString() {
		String output = "Type : Passenger Plane," + " Model - " + model + " Speed - " + speed + " Range - " + range + " Price $" + price;
		return output;
	}
	public String fly() {
		String output = "Welcome to Southwest non-stop flight to Kansas City";
		return fly();
	}
	
	
	
}
