/**
 * Auto Generated Java Class.
 */
public class StringTest2 {
  
  
  public static void main(String[] args) { 
    
    String name2 = new String("Md. Abdul");
    
    System.out.println("My 1st and 2nd name are:\"" + name2 + "\"");
    System.out.println("My 1st and 2nd name are:" + name2 + "\"");
    System.out.println("My 1st and 2nd name are:\"" + name2 );
    System.out.println("My 1st and 2nd name are:" + name2.length());
    
    String n1, n2, n3, n4;
    
    
     n1 = name2.concat("Lotif Limon.");
    n2 = n1.toUpperCase();
    n3 = n2.replace('E', 'X');
    n4 = n3.substring(3,9);
    
    
    System.out.println("N1 #1: "+n1);
    System.out.println("N2 #2: "+n2);
    System.out.println("N3 #3: "+n3);
    System.out.println("N4 #4: "+n4);
    
    System.out.println("Mutation length: "+n4.length());
    System.out.println("Name:\"" + name2 + "\"");
    
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
