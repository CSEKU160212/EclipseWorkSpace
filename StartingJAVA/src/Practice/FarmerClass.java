package Practice;

public class FarmerClass extends HumanClass{
	
	private double ownLandInAcore;
	private int amountOfRicePerYear;
	private int noOfCow;
	public int noOfEngineMachine;
	public FarmerClass(double Land, int Rice, int Cow, int Engine ) {
		super();
		ownLandInAcore=Land;
		amountOfRicePerYear=Rice;
		noOfCow=Cow;
		noOfEngineMachine=Engine;
	}
//getter for Land
	public double getOwnLandInAcore() {
		return ownLandInAcore;
	}
//setter for Land
	public void setOwnLandInAcore(float ownLandInAcore) {
		this.ownLandInAcore = ownLandInAcore;
	}
//getter for rice
	public int geAmountOfRicePerYear() {
		return amountOfRicePerYear;
	}
//setter for Rice
	public void setAmountOfKgRicePerYear(int amountOfRicePerYear) {
		this.amountOfRicePerYear = amountOfRicePerYear;
	}
//getter for cow
	public int getNoOfCow() {
		return noOfCow;
	}
//setter for cow
	public void setNoOfCow(int noOfCow) {
		this.noOfCow = noOfCow;
	}
}
