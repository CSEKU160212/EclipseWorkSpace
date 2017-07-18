package JAVA_Starting_SunJAVA;

public class TwoClass {

	public static void main(String[] args) {
		
		int addResult;
		OtherClass OtherObject = new OtherClass();
		
		OtherObject.setNumber(160212,160213);
		addResult = OtherObject.FirstNumber+OtherObject.SecondNumber;
		System.out.println("Result of addition = "+addResult);

	}

}
