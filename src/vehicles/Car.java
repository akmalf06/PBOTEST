package vehicles;

public class Car extends Vehicles implements Taxable {
	private Engine engine;
	
	public Car(int numberOfRoads, int weight, int numberOfPassenger, Engine eng) {
		super(numberOfRoads, weight, numberOfPassenger);
		this.engine = eng;
	}
	
	public String toString() {
		return String.format("Type: Car\n%sHorsePower: %d\nFuel Per Meter: %f\nMaxDistance: %f\n", super.toString(), this.engine.getHorsePower(), this.engine.getFuelConsumptionPerMeter(), this.engine.getMaxDist());
	}
	
	public double getTaxes() {
		return this.engine.getHorsePower()*100;
	}

	@Override
	public String getTaxesInformation() {
		return String.format("Type: Car\nHorsePower: %d\nTaxes: %f\n", this.engine.getHorsePower(), this.getTaxes());
	}
}
