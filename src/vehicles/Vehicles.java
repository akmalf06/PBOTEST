package vehicles;

import com.barhan.exception.LessEqualZeroException;

public class Vehicles {
	private int numberOfRoads;
	private int weight;
	private int numberOfPassenger;

	public Vehicles(int numberOfRoads, int weight, int numberOfPassenger) {
		super();
		try {
			this.setWeight(weight);
		} catch (LessEqualZeroException e) {
			e.printStackTrace();
		}
		try {
			this.setNumberOfRoads(numberOfRoads);
		} catch (LessEqualZeroException e) {
			e.printStackTrace();
		}
		try {
			this.setNumberOfPassenger(numberOfPassenger);
		} catch (LessEqualZeroException e) {
			e.printStackTrace();
		}
	}
	
	public String toString() {
		return String.format("Number Of Roads: %d\nNumber of Passenger: %d\nWeight: %d\n", this.getNumberOfRoads(), this.getNumberOfPassenger(), this.getWeight());
	}
	
	public int getNumberOfRoads() {
		return numberOfRoads;
	}
	public void setNumberOfRoads(int numberOfRoads) throws LessEqualZeroException {
		if(numberOfRoads>0&&numberOfRoads==(int)numberOfRoads) {
			this.numberOfRoads = numberOfRoads;			
		} else {
			throw new LessEqualZeroException("Number of roads should be greater than zero and an integer number");
		}
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) throws LessEqualZeroException {
		if(weight>0) {
			this.weight = weight;
		} else {
			throw new LessEqualZeroException("Weight must be greater than zero");
		}
	}
	public int getNumberOfPassenger() {
		return numberOfPassenger;
	}
	public void setNumberOfPassenger(int numberOfPassenger) throws LessEqualZeroException {
		if(numberOfPassenger>0&&numberOfPassenger==(int)numberOfPassenger) {
			this.numberOfPassenger = numberOfPassenger;
		} else {
			throw new LessEqualZeroException("Number of passenger should be greater than zero and an integer number");
		}
	}
}
