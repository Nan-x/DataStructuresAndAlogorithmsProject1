
public class StudentList {

	public Student firstStudent;
	
	StudentList(){
		
		firstStudent = null;
		
	}
	
	public boolean isEmpty() {
		
		return(firstStudent == null);
		
	}
	
	public void addFirstStudent(String name, String gender, int car, int studentRefNo, Student nextStudent) 
	{
		Student newStudent = new Student(name, gender, car, studentRefNo, nextStudent);
		
		newStudent.nextStudent = firstStudent;
		firstStudent = newStudent;
		
	}
		
public Student removeFirstStudent() {
		
	Student studentRefNo = firstStudent;
		
		if (!isEmpty()) {
			
			firstStudent = firstStudent.nextStudent;
		}
		else {
			System.out.println("Empty");
		}
		
		return studentRefNo;
	  
     	}
	 
    public void display() {
    	
    	Student theStudent = firstStudent;
    	
    	while(theStudent != null) {
    		theStudent.display();
    		
    		System.out.println("Students :" + theStudent);
    		
    		theStudent = theStudent.nextStudent;
    		
    		System.out.println( );
    	}
    }
    
    public Student findStudent(int studentRefNo) {
    	 
    	Student theStudent = firstStudent;
    	
    	if(!isEmpty()) {
    		
    		while(theStudent.studentRefNo != studentRefNo) {
    			
    			if(theStudent.nextStudent != null) {
    				
    			}
    			else
    			{
    				theStudent = theStudent.nextStudent;
    				
    			}
    		}
    	}else {
    		
    		System.out.println("Empty");
    		
    			}
    	
    	 return theStudent;
    
    	 
    		}
    
    	public Student removeStudent(int studentRefNo) {
    		
    		Student currentStudent = firstStudent;
    		Student previousStudent = firstStudent;
    		
    		while(currentStudent. studentRefNo !=  studentRefNo) {
    			
    			if(currentStudent.nextStudent == null) {
    				
    				return null;
    			}
    			else {
    				previousStudent = currentStudent;
    				currentStudent = currentStudent.nextStudent;
    				
    			}
    		}
 
    		if(currentStudent == firstStudent) {
    			
    			firstStudent = firstStudent.nextStudent;
    		}
    		else {
    			
    			previousStudent.nextStudent = currentStudent.nextStudent;
    		}
    		
    		return currentStudent;
    	}
}