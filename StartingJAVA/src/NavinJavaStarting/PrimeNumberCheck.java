package NavinJavaStarting;

import java.util.Scanner;

public class PrimeNumberCheck {

	private static Scanner myScanner=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int n, i, a, b, flag;
		 System.out.println("Enter the two number: ");
		    a=myScanner.nextInt();
		    b=myScanner.nextInt();

		    for(i=a; i<=b; i++)
		    {
		    flag=0;
		        for(n=2; n<=i/2; n++){
		            if (i%n==0)
		            {
		                flag=1;
		                break;
		            }

		        }
		        if(flag==0 && i!=0 &&i!=1)
		            {
		            System.out.println(i+" ");

		            }
		    }
		
	}

}
