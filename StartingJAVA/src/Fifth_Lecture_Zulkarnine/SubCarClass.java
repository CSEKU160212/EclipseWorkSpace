package Fifth_Lecture_Zulkarnine;

public class SubCarClass extends CarClass{
	
	private float chargeInBattery;
	private String colorString;
	public SubCarClass() {
		super();
	}
	
	public SubCarClass(String manu, String mod, String key, int cc, float fl, float charge, String col) {
	super(manu, mod, key, cc, fl);
	chargeInBattery = charge;
	colorString=col;
	
	}	
	
	public SubCarClass(String manu, String mod, String key, int cc, float fl,int year, float charge, String col) {
		super(manu, mod, key, cc, fl,year);
		chargeInBattery = charge;
		colorString=col;
		
		}
	public float getChargeInBattery() {
		return chargeInBattery;
	}
	public void setChargeInBattery(float chargeInBattery) {
		this.chargeInBattery = chargeInBattery;
	}
	public String getColorString() {
		return colorString;
	}
	public void setColorString(String colorString) {
		this.colorString = colorString;
	}
	
	@Override
	public void printAllInfo() {
		super.printAllInfo();
		
		System.out.println("Charge In BAttery: "+getChargeInBattery());
		System.out.println("Color of car: "+getColorString());
		
		
	}
	

}
