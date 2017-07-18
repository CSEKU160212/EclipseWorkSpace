package NavinJavaStarting;

 import java.util.Scanner;

public class add {
  private static Scanner myScanner=new Scanner(System.in);
	public static void main(String[] args) {
		int a, b, c;
		System.out.println("Enter your two number: ");
		a=myScanner.nextInt();
		b=myScanner.nextInt();
		c=a+b;
		System.out.println(+a+ " + " +b +" = " +c);
		
	}

}
