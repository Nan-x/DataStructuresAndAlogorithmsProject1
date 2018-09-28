
public class PropertyList {

		
		public Properties firstProperty;
		
		PropertyList(){
		
			firstProperty = null;
		}
		
		public boolean isEmpty() {
			
			return (firstProperty == null);
		}
		
		public void addProperty(String address, int numberOfRooms, String propertyType, int propReference, double distanceToWIT, int noOfParkingSpaces,  Properties nextProperty) {
			
			Properties newProperty = new Properties(address, numberOfRooms, propertyType, propReference, distanceToWIT, noOfParkingSpaces, nextProperty);
			
			newProperty.nextProperty = firstProperty;
			firstProperty = newProperty;
			
		}
		
		public Properties removeFirstProperty() {
			
			Properties propReference = firstProperty;
			
			if (!isEmpty()) {
				
				firstProperty = firstProperty.nextProperty;
			}
			else {
				System.out.println("Empty");
			}
			
			return propReference;
		  
	     	}
		 
	    public void display() {
	    	
	    	Properties theProperty = firstProperty;
	    	
	    	while(theProperty != null) {
	    		theProperty.display();
	    		
	    		System.out.println("Next Room :" + theProperty);
	    		
	    		theProperty = theProperty.nextProperty;
	    		
	    		System.out.println( );
	    	}
	    }
	    
	    public Properties findProperty(int propReference) {
	    	 
	    	Properties theProperty = firstProperty;
	    	
	    	if(!isEmpty()) {
	    		
	    		while(theProperty.propReference != propReference) {
	    			
	    			if(theProperty.nextProperty != null) {
	    				
	    				return null;
	    				
	    			}
	    			else
	    			{
	    				theProperty = theProperty.nextProperty;
	    			}
	    		}
	    	}else {
	    		
	    		System.out.println("Empty");
	    		
	    			}
	    	
	    	 return theProperty;
	    	 
	    		}
	    	public Properties removeProperty(int propReference) {
	    		
	    		Properties currentProperty = firstProperty;
	    		Properties previousProperty = firstProperty;
	    		
	    		while(currentProperty.propReference != propReference) {
	    			
	    			if(currentProperty.nextProperty == null) {
	    				
	    				return null;
	    			}
	    			else {
	    				previousProperty = currentProperty;
	    				currentProperty = currentProperty.nextProperty;
	    				
	    			}
	    		}
	 
	    		if(currentProperty == firstProperty) {
	    			
	    			firstProperty = firstProperty.nextProperty;
	    		}
	    		else {
	    			
	    			previousProperty.nextProperty = currentProperty.nextProperty;
	    		}
	    		
	    		return currentProperty;
	    	}

	}

