
public class Properties {
	
	public String address;
	public int numberOfRooms;
	public String propertyType;
	public int propReference;
	public double distanceToWIT;
	public int noOfParkingSpaces;
	public Properties nextProperty;

	public Properties(String address, int numberOfRooms, String propertyType, int propReference, double distanceToWIT, int noOfParkingSpaces, Properties nextProperty) {
		super();
		this.address = address;
		this.numberOfRooms = numberOfRooms;
		this.propertyType = propertyType;
		this.propReference = propReference;
		this.distanceToWIT = distanceToWIT;
		this.noOfParkingSpaces = noOfParkingSpaces;
		this.nextProperty = nextProperty;
	}

	public void display() {
		System.out.println("Property Ref No. :  " + propReference + "Property Type :  " + propertyType + "Number Of Rooms : " + numberOfRooms + "Address : " + address + "Dostance From WIT : " + distanceToWIT + "Number Of Parking Spaces : " + noOfParkingSpaces  ); 
		
	}

	@Override
	public String toString() {
		return "Properties [address=" + address + ", numberOfRooms=" + numberOfRooms + ", propertyType=" + propertyType
				+ ", propReference=" + propReference + ", distanceToWIT=" + distanceToWIT + ", noOfParkingSpaces="
				+ noOfParkingSpaces + ", nextProperty=" + nextProperty + "]";
	}

	
	

}
