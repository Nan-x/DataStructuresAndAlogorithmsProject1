
public class MyBedList {
	
	public Bed firstBed;
	
	MyBedList(){
	
		firstBed = null;
	}
	
	public boolean isEmpty() {
		
		return (firstBed == null);
	}
	
	public void addFirstBed(int bedRefNumber, String bedType, String avalible, double costPerWeek, Bed nextBed) {
		
		Bed newBed = new Bed(bedRefNumber, bedType, avalible, costPerWeek, nextBed);
		
		newBed.nextBed = firstBed;
		firstBed = newBed;
		
	}
	
	public Bed removeFirstBed() {
		
		Bed bedReference = firstBed;
		
		if (!isEmpty()) {
			
			firstBed = firstBed.nextBed;
		}
		else {
			System.out.println("Empty");
		}
		
		return bedReference;
	  
     	}
	 
    public void display() {
    	
    	Bed theBed = firstBed;
    	
    	while(theBed != null) {
    		theBed.display();
    		
    		System.out.println("Next Room :" + theBed);
    		
    		theBed = theBed.nextBed;
    		
    		System.out.println( );
    	}
    }
    
    public Bed displayABed(int bedRefNumber) {
    	
    	Bed theBed = firstBed;
    	
    	if(!isEmpty()) {
    		
    		while(theBed.bedRefNumber != bedRefNumber) {
    			
    			if(theBed.nextBed != null) {
    				
    				return null;
    				
    			}
    			else
    			{
    				theBed = theBed.nextBed;
    				System.out.println(theBed);
    			}
    		}
    	}
    	
    	else {
    		
    		System.out.println("Not Valid");
    		
    	}
    	
    	return theBed;
    	
    }
    

    
    
    public Bed findBed(int bedRefNumber) {
    	 
    	Bed theBed = firstBed;
    	
    	if(!isEmpty()) {
    		
    		while(theBed.bedRefNumber != bedRefNumber) {
    			
    			if(theBed.nextBed != null) {
    				
    				return null;
    				
    			}
    			else
    			{
    				theBed = theBed.nextBed;
    				System.out.println(theBed);
    			}
    		}
    	}else {
    		
    		System.out.println("Not Valid");
    		
    			}
    	
    	 return theBed;
    	 
    		}
    
    	public Bed removeBed(int bedRefNumber) {
    		
    		Bed currentBed = firstBed;
    		Bed previousBed = firstBed;
    		
    		while(currentBed.bedRefNumber != bedRefNumber) {
    			
    			if(currentBed.nextBed == null) {
    				
    				return null;
    			}
    			else {
    				previousBed = currentBed;
    				currentBed = currentBed.nextBed;
    				
    			}
    		}
 
    		if(currentBed == firstBed) {
    			
    			firstBed = firstBed.nextBed;
    		}
    		else {
    			
    			previousBed.nextBed = currentBed.nextBed;
    		}
    		
    		return currentBed;
    	}

}
