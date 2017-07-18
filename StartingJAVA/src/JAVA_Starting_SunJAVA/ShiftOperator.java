package JAVA_Starting_SunJAVA;

public class ShiftOperator {

	public static void main(String[] args) {
		
		int firstNumber = 16;
		int secondNumber = firstNumber << 2;
		System.out.println("The result of << operator "+secondNumber);
		
		secondNumber = firstNumber >> 2;
		System.out.println("The result of >> operator "+secondNumber);
		
		secondNumber = firstNumber >>> 2;
		System.out.println("The result of >>> operator "+secondNumber);
		
		int thirdNumber = -32;
		
		secondNumber = thirdNumber >> 2;
		System.out.println("The result of >> operatation "+secondNumber);
		
		secondNumber = thirdNumber >>> 2;
		System.out.println("The result of >>> operation "+secondNumber);
		

	}

}
