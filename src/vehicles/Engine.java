package vehicles;

import com.barhan.exception.LessEqualZeroException;

public class Engine {
	private Fuel typeOfFuel;
	private double fuelCapacityLitre;
	private int horsePower;
	
	public Engine(Fuel typeOfFuel, int fuelCapacityLitre, int horsePower) {
		super();
		this.typeOfFuel = typeOfFuel;
		try {
			this.setFuelCapacityLitre(fuelCapacityLitre);
		} catch (LessEqualZeroException e) {
			e.printStackTrace();
		}
		try {
			this.setHorsePower(horsePower);
		} catch (LessEqualZeroException e) {
			e.printStackTrace();
		}
	}
	
	public Fuel getTypeOfFuel() {
		return typeOfFuel;
	}
	public double getFuelCapacityLitre() {
		return fuelCapacityLitre;
	}
	public void setFuelCapacityLitre(double fuelCapacityLitre) throws LessEqualZeroException {
		if(fuelCapacityLitre>0) {
			this.fuelCapacityLitre = fuelCapacityLitre;			
		} else {
			throw new LessEqualZeroException("Fuel Capacity must be greater than zero");
		}
	}
	public int getHorsePower() {
		return horsePower;
	}
	public void setHorsePower(int horsePower) throws LessEqualZeroException {
		if(horsePower>0) {
			this.horsePower = horsePower;			
		} else {
			throw new LessEqualZeroException("Horsepower must be greater than zero");
		}
	}
	
	public double getFuelConsumptionPerMeter() {
		return (double)this.horsePower/100;
	}
	
	public double getMaxDist() {
		return this.fuelCapacityLitre/this.getFuelConsumptionPerMeter();
	}
}
