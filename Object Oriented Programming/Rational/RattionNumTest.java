/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class RattionNumTest {
  
  
  public static void main(String[] args) {
    Scanner scanf = new Scanner(System.in);
//    int a,b;
//    a = scanf.nextInt();
//    b = scanf.nextInt();
    /*Input Using Keyboard*/
    System.out.println("Enter numerator & Denominator Respictively");
    RationalNumber r1 = new RationalNumber(scanf.nextInt(),scanf.nextInt());
    
    /*Input default*/
   // RationalNumber r1 = new RationalNumber(6,8);
    
    RationalNumber r2 = new RationalNumber(1,3);
    RationalNumber r4,r5,r6,r7,r8,r9,r10;
    
    
    System.out.println("First Rational Number : "+r1);
    System.out.println("Second Rational Number : "+r2);
    
    r4 = r1.add(r2);
    System.out.println("Additional value  : "+r4);
    r5 = r1.sub(r2);
    System.out.println("Subtract value  : "+r5);
    r6 = r1.reciprocal();
    System.out.println("Reciprocal of R1 is : "+ r6);
    r7 = r1.divide(r2);
    System.out.println("division result is : "+r1.divide(r2));
    r1.issame(r2);
    
//    r9 = RationalNumber.reduce(r1);
//    System.out.println("Reduced number : "+ r9);
    r1.reduce2();
    System.out.println("Reduced number is "+ r1);
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
