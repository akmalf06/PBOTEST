package buildings;

import vehicles.Taxable;

public abstract class Buildings implements Taxable {
	private int length;
	private int width;
	private int numberOfRooms;
	
	public Buildings(int length, int width, int numberOfRooms) {
		super();
		this.length = length;
		this.width = width;
		this.numberOfRooms = numberOfRooms;
	}
	
	public int getLength() {
		return length;
	}
	public void setLength(int length) throws Exception {
		if(length>0) {
			this.length = length;			
		} else {
			throw new Exception("Length must be greater than zero");
		}
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	
	public int getArea() {
		return this.length*this.width;
	}
	
	@Override
	public String getTaxesInformation() {
		return String.format("Type: Buildings\nArea: %d\nTaxes: %f\n", this.getArea(), this.getTaxes());
	}
}
