package vehicles;

public class VehiclesApp {

	public static void main(String[] args) {

		Vehicle car = new Car(65, "Toyota", "Prius");
		
		Vehicle bicycle = new Bicycle (15, "Specialized", "Hardrock");
		
		Vehicle plane = new Plane (600, "Boeing", "747");
		
		car.getDistanceToTravel(9);
		
		car.getTimeToTravel(100);
			
		bicycle.getDistanceToTravel(5);
		
		
		
		bicycle.getTimeToTravel(100);
		
		bicycle.breakTime(4);
						
		plane.getDistanceToTravel(2);
		
		plane.getTimeToTravel(2000);
	}
	
	
}
