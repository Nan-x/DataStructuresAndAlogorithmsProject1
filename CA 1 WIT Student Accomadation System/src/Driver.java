import java.util.Scanner;
/**
 * Menu Class
 * @author Rhianna Paine 20076268
 *
 */

public class Driver {


    private Scanner input;
    private MyLinkedList roomList;
    private MyBedList bedList;
    private PropertyList propList;
    private StudentList studentList;
    
    public Driver()
    {
        input = new Scanner(System.in);
        roomList = new MyLinkedList();
        bedList = new MyBedList();
        propList = new PropertyList();
        studentList = new StudentList();
        runMenu();
    }
    
    //Starts the application
    
    public static void main (String args[]) {
    	
    	Driver app = new Driver();
    }
    
    private int mainMenu()
    {
    	System.out.println("WIT Student Accomadation System");
    	System.out.println("...............................");
    	System.out.println(" 1) Add New Property");
    	System.out.println(" 2) List All Properties");
    	System.out.println(" 3) Delete Properties");
    	System.out.println("......");
    	System.out.println(" 4) Add New Room");
    	System.out.println(" 5) List All Rooms");
    	System.out.println(" 6) Delete Room");
    	System.out.println("......");
    	System.out.println(" 7) Add New Bed");
    	System.out.println(" 8) List All Beds");
    	System.out.println(" 9) Delete Beds");
    	System.out.println(" 10) Add Student");
    	System.out.println(" 11) List All Students");
    	System.out.println(" 12) Delete Student");
    	System.out.println("........");
    	System.out.println("13) Search Bed By RefNo");
    	System.out.println(" 0) Exit");
    	int option = input.nextInt();
    	return option;
    }
    
    private void runMenu()
    {
    
    	int option = mainMenu();
    	while (option !=0)
    	{
    		switch (option)
    		{
  case 1:    System.out.println("Add New Property");
  			System.out.print("Enter address: ");
  			String address=input.nextLine();
  			System.out.println("Enter number of rooms:");
  			int numberOfRooms=input.nextInt();
  			System.out.println("Enter property type : ");
  			String propertyType=input.nextLine();
  			System.out.println("Enter Property Reference Number : ");
  			int propReference=input.nextInt();
  			System.out.println("Enter distance from WIT : ");
  			double distanceToWIT=input.nextDouble();
  			System.out.println("Enter number of parking spaces : ");
  			int noOfParkingSpaces=input.nextInt();
             propList.addProperty(address, numberOfRooms, propertyType, propReference, distanceToWIT, noOfParkingSpaces, null); 
             break;
             
  case 2:    System.out.println("List All Properties");
             propList.display();
             break;
             
  case 3:    System.out.println("Delete Properties");
             propReference = input.nextInt();
             propList.removeProperty(propReference);
             System.out.println("DELETED");
             break;
             
  case 4:    System.out.println("Add New Room"); 
             System.out.println("Enter Room Reference Number : ");
             int roomRefNumber = input.nextInt();
             System.out.println("Enter floor number : ");
             int floorNumber = input.nextInt();
             System.out.println("Number of ensuites? : ");
             int ensuite = input.nextInt();
             roomList.addFirstRoom(roomRefNumber, floorNumber, ensuite, null);
 
             break;
             
  case 5:    System.out.println("List All Rooms");
             roomList.display();
             break;
             
  case 6:    System.out.println("Delete Room");
             System.out.println("Enter Room ID you want to delete");
             roomRefNumber = input.nextInt();
             roomList.removeRoom(roomRefNumber);
             System.out.println("DELETED");
             break;
             
  case 7:    System.out.println("Add New Bed");
             System.out.println("Enter Bed Reference number : ");
             int bedRefNumber = input.nextInt();
             System.out.println("Enter Bed Type : ");
             String bedType = input.nextLine();
             System.out.println("Availible? Yes/No : ");
             String avalible = input.nextLine();
             System.out.println("Cost Per Week : ");
             Double costPerWeek = input.nextDouble();
             bedList.addFirstBed(bedRefNumber, bedType, avalible, costPerWeek, null);
  			 break;
  			 
  case 8:    System.out.println("List All Beds");
             bedList.display();
             break;
             
  case 9 :   System.out.println("Delete Bed");
             bedRefNumber = input.nextInt();
             bedList.removeBed(bedRefNumber);
             System.out.println("DELETED");
             break;
             
  case 10 :  System.out.println("Add Student : ");
             System.out.println("Enter Name : ");
             String name = input.nextLine();
             System.out.println("Enter Bed Type : ");
             String gender = input.nextLine();
             System.out.println("Number of Cars (if any) ");
             int car = input.nextInt();
             System.out.println("Student Reference Number : ");
             int studentRefNo = input.nextInt();
             studentList.addFirstStudent(name, gender, car, studentRefNo, null);
             break;
             
  case 11 :  System.out.println("List All Students");  
             studentList.display();
             break;
             
  case 12 :  System.out.println("Delete Student");
             System.out.println("Enter Ref of Student to Delete : ");
             studentRefNo = input.nextInt();
             studentList.removeStudent(studentRefNo);
             System.out.println("DELETED");
             break;
 
             
  case 13 : System.out.println("Search Bed");
            System.out.println("Enter Bed Ref Number");
            bedRefNumber = input.nextInt();
            bedList.findBed(bedRefNumber);
            bedList.displayABed(bedRefNumber);
 
            
             
                 
             
      
 default:    System.out.println("Invalid option entered: " + option);
             break;
    		}
    		
    		 System.out.println("\n Press any Key to continue");
    		 input.nextLine();
    		 
    		 option = mainMenu();
    	}
    }
}
