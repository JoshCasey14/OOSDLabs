package Lab2a;

public class HotelRoom {
	
	private int roomNumber;
	private String roomType;
	private int occupied;
	private double rate;
	
	public HotelRoom() {
	}
	
	public HotelRoom(int roomNumber, String roomType, int occupied, double rate) {
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.occupied = occupied;
		this.rate = rate;
	}
	
	
	
	public int getRoomNumber() {
		return roomNumber;
	}
	
	public void setRoomNumber(int newRoomNumber) {
		roomNumber = newRoomNumber;
	}
	

	public String getRoomType() {
		return roomType;
	}
	
	public void setRoomType(String newRoomType) {
		roomType = newRoomType;
	}
	
	public int getOccupied() {
		return occupied;
	}
	
	public void setOccupied(int newOccupied) {
		occupied = newOccupied;
	}
	
	public double getRate() {
		return rate;
	}
	
	public void setRate(double newRate) {
		rate = newRate;
	}
	
	
	
}
