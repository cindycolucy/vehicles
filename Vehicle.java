package vehicles;

public class Vehicle {
	private String make;
	private String model;
	private int rateOfSpeed;
	private int time;
	private int distance;
	
	//constructor
	public Vehicle(int rateOfSpeed, String make, String model) {
		this.rateOfSpeed = rateOfSpeed;
		this.make = make;
		this.model = model;
		System.out.println(this + " has a rate of speed of " + rateOfSpeed);
		System.out.println(this + " has a make of " + make);
		System.out.println(this + " has a model of " + model);
	}
	//method
	public void getDistanceToTravel(int time) {
		this.distance = rateOfSpeed * time;
		System.out.println("Distance for " + this + " is " + distance + " in " + time +" hours");
	}
	//method
	public void getTimeToTravel(int distance) {
		this.time = distance / rateOfSpeed;
		System.out.println("Time to travel for " + this + " is " + time + " hours");

	}
	//method to make rate of speed 0 every two hours
	public void breakTime (int time){
		if (time % 2 == 0){
		rateOfSpeed = 0;
		}
		System.out.println("ROS for " + this + " is " + rateOfSpeed);
	}

	

	@Override
	public String toString() {
		return getClass().getSimpleName(); 

	}
}
