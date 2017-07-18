package io_student;


public class Deserializer_Test {
  
  public static void main (String args[]) {
    
    Deserializer deserializer = new Deserializer();
    Student student = deserializer.deserialzeStudent();
    System.out.println("Name"+"\t"+"Roll"+"\t"+"Mark");
    System.out.println("----"+"\t"+"----"+"\t"+"----");
    System.out.println(student);
  } 
}
