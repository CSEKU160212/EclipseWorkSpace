package practice2;

public class toStringMethod {

	private String name;
	private int roll;
	private double cGPA;
	
	public toStringMethod(String name, int roll, double cGPA) {
		super();
		this.name = name;
		this.roll = roll;
		this.cGPA = cGPA;
	}
	
	public String toString() {
		return "Name is: "+getName()+", Roll is: "+getRoll()+", cGPA is: "+getcGPA();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public double getcGPA() {
		return cGPA;
	}
	public void setcGPA(double cGPA) {
		this.cGPA = cGPA;
	}
	

	
	
	
	
	
}
