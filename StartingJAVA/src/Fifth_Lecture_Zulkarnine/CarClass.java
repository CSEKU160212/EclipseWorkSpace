package Fifth_Lecture_Zulkarnine;

public class CarClass {

	public  String manufacturerName;
	int engineCC;
	//public float carWeight;
	private float fuelAmount;
	private String modelName;
	final private float amountOfFuelConsumedPerSecond = 0.02f; 
	private String carKeyValue;
	protected int manufacturingYear;
	
	
	
	public CarClass() {
		manufacturerName = new String();
		modelName = new String();
		engineCC = 1000;
		//carWeight = 0;
		fuelAmount = 0;
		manufacturingYear=0;
		
	}
	
	public CarClass(String CarName) {
		manufacturerName = new String(CarName);
		modelName = new String();
		engineCC = 0;
		//carWeight = 0;
		fuelAmount = 0;
		manufacturingYear=0;
		
	}
	
	public CarClass(String manu,String mod, String keyValue, int engineCC, float fuel) {
		manufacturerName= manu;
		modelName = mod;
		this.engineCC = engineCC;
		carKeyValue=keyValue;
		fuelAmount=fuel;
		
		
	}
	public CarClass(String manu,String mod, String keyValue, int engineCC, float fuel, int year) {
		this(manu, mod, keyValue, engineCC, fuel);
		manufacturingYear=year;
		
		
	}
	
	public void addfuel(float fuelAmount) {
		this.fuelAmount+=fuelAmount;
	}
	
	public void runForSec(int timeInSec) {
		float useFuel = timeInSec*amountOfFuelConsumedPerSecond;
		fuelAmount-=useFuel;	
	}
	
	public float presentAmountOfFuel() {
		
		return fuelAmount;
	}
	
	public String manufacturerName() {
		return manufacturerName;
		
	}
	
	public String getModelName() {
		
		return modelName; 
		
	}
	
	
	public Boolean matchPass(String userInput) {
		return userInput.equals(carKeyValue); 
	}
	
	
	public void printAllInfo() {
		System.out.println("Manufacturer: "+manufacturerName);	
		System.out.println("Passward Mach: "+matchPass("fhjdfhjdhf"));
		System.out.println("Third Car CC: "+engineCC);
		System.out.println("AMount of fuel: "+presentAmountOfFuel()+"L");
		addfuel(2);
		System.out.println("after adding 2 liter: "+presentAmountOfFuel()+"L");
		runForSec(60);
		System.out.println("Amount of fuel after driving for 60 sec: "+presentAmountOfFuel()+"L");
	}
	
	
}
