package Lab2a;

public class HotelDriver {

	public static void main(String[] args) {
		
		HotelRoom roomA = new HotelRoom();
		roomA.setRoomNumber(200);
		roomA.setRoomType("Single");
		roomA.setOccupied(1);
		roomA.setRate(100);
		
		HotelRoom roomB = new HotelRoom();
		roomB.setRoomNumber(201);
		roomB.setRoomType("Double");
		roomB.setOccupied(0);
		roomB.setRate(80);
		
		if (roomB.isOccupied() == false) {
			roomB.isOccupied(1);
		}
		if (roomB.isOccupied()== false) {
			roomB.isOccupied(1);
		}
		
		roomB.setOccupied(1);
		roomB.setOccupied(1);
		
		System.out.println("Information about the rooms: ");
		
		HotelRoom roomC = new HotelRoom(202, "Single", 0, 90);
		
		
		System.out.println("Room A:");
		System.out.println("Room Number: " + roomA.getRoomNumber());
		System.out.println("Room Type: " + roomA.getRoomType());
		System.out.println("Occupied (0=vacant, 1=occupied): " + roomA.getOccupied());
		System.out.println("Rate: " + roomA.getRate());
		
		System.out.println("Room B:");
		System.out.println("Room Number: " + roomB.getRoomNumber());
		System.out.println("Room Type: " + roomB.getRoomType());
		System.out.println("Vacant (0=vacant, 1=occupied): " + roomB.getOccupied());
		System.out.println("Rate: " + roomB.getRate());
		
		
	}

}
