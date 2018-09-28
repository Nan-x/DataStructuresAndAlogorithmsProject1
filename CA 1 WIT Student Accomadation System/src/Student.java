
public class Student {
	
	public String name;
	public String gender;
	public int car;
	public int studentRefNo;
	
	public Student nextStudent;

	public Student(String name, String gender, int car, int studentRefNo, Student nextStudent) {
		super();
		this.name = name;
		this.gender = gender;
		this.car = car;
		this.studentRefNo = studentRefNo;
		this.nextStudent = nextStudent;
	}
	
	public void display() {
		System.out.println("Name : " + name + "Ganed : " + gender + "Car? : " + car + "Student Reference No." + studentRefNo);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gender=" + gender + ", car=" + car + ", studentRefNo=" + studentRefNo
				+ ", nextStudent=" + nextStudent + "]";
	}
	
	

}
