
public class Room {

	public int roomRefNumber;
	public int floorNumber;
	public int ensuite;
	
	public Room next;

	public Room(int roomRefNumber, int floorNumber, int ensuite, Room nextRoom) {
		super();
		this.roomRefNumber = roomRefNumber;
		this.floorNumber = floorNumber;
		this.ensuite = ensuite;
		this.next = nextRoom;
		
	}
	
	public void display() {
		System.out.println("Room Ref No. :  " + roomRefNumber + "Floor Number :  " + floorNumber + "Ensuite? : " + ensuite);
		
	}

	@Override
	public String toString() {
		return "Room [roomRefNumber=" + roomRefNumber + ", floorNumber=" + floorNumber + "ensuite=" + ensuite + ", next=" + next + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*private  String roomType;
	private int roomID;
	private int numberOfBeds;
	
	public Product(String roomType, int roomID, int numberOfBeds)
	{
		this.setRoomType(roomType);
		this.setRoomID(roomID);
		this.setNumberOfBeds(numberOfBeds);
	}
	
	public Room()
	{
		
	}

	public int getRoomID() {
		return roomID;
	}

	public String getRoomType() {
		return roomType;
	}
	
	public int getNumberOfBeds() {
		return numberOfBeds;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}

	public void setNumberOfBeds(int numberOfBeds) {
		this.numberOfBeds = numberOfBeds;
	}
	
	public String toString()
	{
		return "Room Type: " + roomType
			+ "Room ID: " + roomID
			+ "Number of beds :" + numberOfBeds;
	}
	
	*/
	
	
}
