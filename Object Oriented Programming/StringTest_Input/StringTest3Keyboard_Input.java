/**
 * Auto Generated Java Class.
 */
//import java.util.Scanner;
import java.util.*;
public class StringTest3Keyboard_Input {
  
  
  public static void main(String[] args) { 
    
    Scanner scan = new Scanner (System.in); //scan can be changed
    
    String phrase = scan.nextLine();
    //String phrase = new String("Bappi lahiri is a good singer");
    String mutation1, mutation2, mutation3, mutation4;
    System.out.println("Original string:\"" + phrase + "\"");
    System.out.println("Original string:" + phrase + "\"");
    System.out.println("Original string:\"" + phrase );
    System.out.println("Length of string:" + phrase.length());
    
    mutation1 = phrase.concat(", expect from vending machines.");
    mutation2 = mutation1.toUpperCase();
    mutation3 = mutation2.replace('E', 'X');
    mutation4 = mutation3.substring(3,30);
    
    
    System.out.println("Mutation #1: "+mutation1);
    System.out.println("Mutation #2: "+mutation2);
    System.out.println("Mutation #3: "+mutation3);
    System.out.println("Mutation #4: "+mutation4);
    
    System.out.println("Mutation length: "+mutation4.length());
    System.out.println("Phrase:\"" + phrase + "\"");
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
