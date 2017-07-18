package Fifth_Lecture_Zulkarnine;

public class FifthLecture {

	
	private static  CarClass ourCar = new CarClass();
	private static  CarClass ourAnotherCar;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CarClass thirdCar=new CarClass("MAZDA", "Axelo", "Smndmsn", 1500, 20);
		
		SubCarClass ourSubCar=new SubCarClass("BMW", "7 series", "Smnfdjfjh", 3000, 25, 10, "Grey");		
		//String nameString = new String();
		ourAnotherCar = new CarClass("TOYOTA", "ALLION","qwerty", 10000, 30);
		//ourCar.presentAmountOfFuel();
		ourCar=new CarClass("NOVA", "METRO", "SJDJDD", 2500, 123);
		
		
		System.out.println("This is for OurAnotherCar: ");
		ourAnotherCar.printAllInfo();
		
//		System.out.println("Manufacturer: "+ourAnotherCar.manufacturerName);
//		
//		System.out.println("Manufacturer: "+ourAnotherCar.getModelName());
//		
//		System.out.println("Passward Mach: "+ourCar.matchPass("fhjdfhjdhf"));
//		
//		System.out.println("FirstCar: "+ourCar.manufacturerName);
//	
//	System.out.println("FirstCar CC: "+ourCar.engineCC);
//		System.out.println("SecondCar CC: "+ourAnotherCar.engineCC);
//		
//		System.out.println("AMount of fuel: "+ourAnotherCar.presentAmountOfFuel()+"L");
//		ourAnotherCar.addfuel(2);
//		System.out.println("after adding 2 liter: "+ourAnotherCar.presentAmountOfFuel()+"L");
//	    
//		ourAnotherCar.runForSec(60);
//		
//		System.out.println("Amount of fuel after driving for 60 sec: "+ourAnotherCar.presentAmountOfFuel()+"L");
//	
//		
		System.out.println("\n\n\n This is for thirdCar:");
		
//		3rd car
		thirdCar.printAllInfo();
		
//		System.out.println("Manufacturer: "+thirdCar.manufacturerName);
//		
//		System.out.println("Manufacturer: "+thirdCar.getModelName());
//		
//		System.out.println("Passward Mach: "+thirdCar.matchPass("fhjdfhjdhf"));
//		
//		System.out.println("Third Car CC: "+thirdCar.engineCC);
//		
//		System.out.println("AMount of fuel: "+thirdCar.presentAmountOfFuel()+"L");
//		thirdCar.addfuel(2);
//		System.out.println("after adding 2 liter: "+thirdCar.presentAmountOfFuel()+"L");
//	    
//		thirdCar.runForSec(60);
//		
//		System.out.println("Amount of fuel after driving for 60 sec: "+thirdCar.presentAmountOfFuel()+"L");
//		
		
		System.out.println("\n\n\n This is for OurSubCar:");
		//subCar
		ourSubCar.printAllInfo();
//		System.out.println("Manufacturer: "+ourSubCar.manufacturerName);
//		
//		System.out.println("Manufacturer: "+ourSubCar.getModelName());
//		
//		System.out.println("Passward Mach: "+ourSubCar.matchPass("fhjdfhjdhf"));
//		
//		System.out.println("Third Car CC: "+ourSubCar.engineCC);
//		
//		System.out.println("AMount of fuel: "+ourSubCar.presentAmountOfFuel()+"L");
//		ourSubCar.addfuel(2);
//		System.out.println("after adding 2 liter: "+ourSubCar.presentAmountOfFuel()+"L");
//	    
//		ourSubCar.runForSec(60);
//		
//		System.out.println("Amount of fuel after driving for 60 sec: "+ourSubCar.presentAmountOfFuel()+"L");
//		
//		System.out.println("Charge In BAttery: "+ourSubCar.getChargeInBattery());
//		System.out.println("Color of car: "+ourSubCar.getColorString());
		
		
		System.out.println("\n\n\n This is for ourCar:");
		ourCar.printAllInfo();
		
	}
	}
