
public class Bed {

	public int bedRefNumber;
    public String bedType;
    public String avalible;
    public double costPerWeek;
    public Bed nextBed;
    
    
	public Bed(int bedRefNumber, String bedType,String avalible, double costPerWeek, Bed nextBed) {
		super();
		this.bedRefNumber = bedRefNumber;
		this.bedType = bedType;
		this.avalible = avalible;
		this.costPerWeek = costPerWeek;
		this.nextBed = nextBed;
	}

	

	

	public void display() {
		System.out.println("Bed Ref No. :  " + bedRefNumber + "Floor Number :  " + bedType +"Avalible?" + avalible + "Cost Per Week : " + costPerWeek);
		
	}



	@Override
	public String toString() {
		return "Bed [bedRefNumber=" + bedRefNumber + ", bedType=" + bedType + ", avalibile=" + avalible + ",costPerWeek=" + costPerWeek +", next="
				+ nextBed + "]";
	}


	
}
