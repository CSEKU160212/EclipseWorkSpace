package JAVA_Starting_SunJAVA;

public class Identifier1 {

	static int $mySerial = 20;
	static float My_salary = 400.50f;
	//serialNo. = d; Illegal
	
	public static void main(String[] args) {
		System.out.println($mySerial);
		System.out.println(giveSalary());
		System.out.println(My_salary);

	}
	
	
	public static double giveSalary() 
	{
		return My_salary*13;
	}

}
