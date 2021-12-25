package buildings;

public class Hotel extends Buildings {
	private int numberOfBallroom;
	private int numberOfMeetingRoom;
	
	public Hotel(int length, int width, int numberOfRooms, int numberOfBallroom, int numberOfMeetingRoom) {
		super(length, width, numberOfRooms);
		try {
			this.setNumberOfBallroom(numberOfBallroom);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			this.setNumberOfMeetingRoom(numberOfMeetingRoom);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String toString() {
		return String.format("Type: Hotel\nArea: %d\nNumber of Rooms: %d\n Number of Ballroom: %d\nNumber of Meeting Room: %d\nTaxes: %f\n", this.getArea(), this.getNumberOfRooms(), this.getNumberOfBallroom(), this.getNumberOfMeetingRoom(), this.getTaxes());
	}

	public int getNumberOfBallroom() {
		return numberOfBallroom;
	}

	public void setNumberOfBallroom(int numberOfBallroom) throws Exception {
		if(numberOfBallroom>=0) {
			this.numberOfBallroom = numberOfBallroom;
		} else {
			throw new Exception("Number of Ballrooms cannot be negative");
		}
	}

	public int getNumberOfMeetingRoom() {
		return numberOfMeetingRoom;
	}

	public void setNumberOfMeetingRoom(int numberOfMeetingRoom) throws Exception {
		if(numberOfMeetingRoom>=0) {
			this.numberOfMeetingRoom = numberOfMeetingRoom;
		} else {
			throw new Exception("Number of Meeting Rooms cannot be negative");
		}
	}
	
	@Override
	public double getTaxes() {
		return this.getArea()*15 + this.getNumberOfRooms()*100 + this.getNumberOfMeetingRoom()*200 + this.getNumberOfBallroom()*150;
	}
	
	
}
