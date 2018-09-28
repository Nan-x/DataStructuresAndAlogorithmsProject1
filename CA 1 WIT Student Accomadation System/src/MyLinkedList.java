

public class MyLinkedList  {

	//List Of Rooms
	
	public Room firstRoom;
	
	MyLinkedList(){
	
		firstRoom = null;
	}
	
	public boolean isEmpty() {
		
		return (firstRoom == null);
	}
	
	public void addFirstRoom(int roomRefNumber, int floorNumber, int ensuite, Room nextRoom) {
		
		
		Room newRoom = new Room(roomRefNumber, floorNumber, ensuite, nextRoom);
		
		newRoom.next = firstRoom;
		firstRoom = newRoom;
		
	}
	
	public Room removeFirstRoom() {
		
		Room roomReference = firstRoom;
		
		if (!isEmpty()) {
			
			firstRoom = firstRoom.next;
		}
		else {
			System.out.println("Empty");
		}
		
		return roomReference;
	  
     	}
	 
    public void display() {
    	
    	Room theRoom = firstRoom;
    	
    	while(theRoom != null) {
    		theRoom.display();
    		    		
    		theRoom = theRoom.next;
    		
    		System.out.println( );
    	}
    }
    
    public Room find(int roomRefNumber) {
    	 
    	Room theRoom = firstRoom;
    	
    	if(!isEmpty()) {
    		
    		while(theRoom.roomRefNumber != roomRefNumber) {
    			
    			if(theRoom.next != null) {
    				
    				return null;
    				
    			}
    			else
    			{
    				theRoom = theRoom.next;
    			}
    		}
    	}else {
    		
    		System.out.println("Empty");
    		
    			}
    	
    	 return theRoom;
    	 
    		}
    	public Room removeRoom(int roomRefNumber) {
    		
    		Room currentRoom = firstRoom;
    		Room previousRoom = firstRoom;
    		
    		while(currentRoom.roomRefNumber != roomRefNumber) {
    			
    			if(currentRoom.next == null) {
    				
    				return null;
    			}
    			else {
    				previousRoom = currentRoom;
    				currentRoom = currentRoom.next;
    				
    			}
    		}
 
    		if(currentRoom == firstRoom) {
    			
    			firstRoom = firstRoom.next;
    		}
    		else {
    			
    			previousRoom.next = currentRoom.next;
    		}
    		
    		return currentRoom;
    	}
    }
	
	

