package vehicles;

public class Bicycle extends Vehicles {
	public Bicycle(int numberOfRoads, int weight, int numberOfPassenger) {
		super(numberOfRoads, weight, numberOfPassenger);
	}
	
	public String toString() {
		return String.format("Type: Bicycle\n%s", super.toString());
	}
}
