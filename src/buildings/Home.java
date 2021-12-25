package buildings;

public class Home extends Buildings {
	public Home(int length, int width, int numberOfRooms) {
		super(length, width, numberOfRooms);
	}
	
	public String toString() {
		return String.format("Type: Home\nArea: %d\nNumber of Rooms: %d\nTaxes: %f\n", this.getArea(), this.getNumberOfRooms(), this.getTaxes());
	}

	@Override
	public double getTaxes() {
		return this.getArea()*10 + this.getNumberOfRooms()*100;
	}
}
