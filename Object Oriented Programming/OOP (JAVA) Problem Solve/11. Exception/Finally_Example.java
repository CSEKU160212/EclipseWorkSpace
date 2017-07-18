/**
 * Auto Generated Java Class.
 */
public class Finally_Example {
  
  
  public static void main(String[] args) { 
     int numerator = 10;
     int denominator = 1;

      try {
          System.out.println (numerator / denominator);
          System.out.println ("This text will not be printed.");
      }
      catch(ArithmeticException e) {
          System.out.println (e.getMessage());
          System.out.println ("This text will be printed.");
      }
      finally {
          System.out.println ("This text will also be printed.");
      }

  }
  
  /* ADD YOUR CODE HERE */
  
}
