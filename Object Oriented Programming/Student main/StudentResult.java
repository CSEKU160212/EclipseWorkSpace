/**
 * Auto Generated Java Class.
 */
public class StudentResult {
  
  
  public static void main(String[] args) { 
    
    Student s1 = new Student();
    Student s2 = new Student();
    
    s1.setValues(160213, "MESU", 4.00);
    s2.setValues(160212, "LOTIF", 4.00);
    
    int Id1=s1.getId();
    int Id2=s2.getId();
    
    double Result1=s1.getResult();
    double Result2=s2.getResult();
    
    String Name1 = s1.getName();
    String Name2 = s2.getName();
    
    System.out.println("Here: "+ Id1 + " "+ Name1+ " " +Result1 + " " + "And Here" + " " + Id2+ " " + Name2 + " "+ Result2);
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
