package NavinJavaStarting;

import java.util.Scanner;

public class FibonacciSeries {

	public static int firstNumber=1; 
    public static int secondNumber=1;
	public static int nextNumber=0;
	private static Scanner myScanner;
	public static void main(String[] args) {
		int n;
	 myScanner = new Scanner(System.in);
	 System.out.println("Plzzz enter your number: ");
	 n=myScanner.nextInt();
	 System.out.print(+nextNumber+" "+firstNumber+" "+secondNumber+" ");
	 for(; nextNumber<=n; )
	 {
		 nextNumber=firstNumber+secondNumber;
		 if(nextNumber>n)
			 break;
		 System.out.print(+nextNumber+" ");
		 firstNumber=secondNumber;
		 secondNumber=nextNumber;
	 }
	 
	 
	}

}
