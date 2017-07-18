import java.util.*;
public class Deserializer_Test {
  
  public static void main (String args[]) {
    
    Deserializer deserializer = new Deserializer();
    Student_List sList = deserializer.deserialzeStudent_List();
    System.out.println(sList);
    Student s1 = sList.get(1);
    System.out.println(s1);
  } 
}
