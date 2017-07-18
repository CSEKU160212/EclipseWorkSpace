/**
 * Auto Generated Java Class.
 */
public class Studentdemo {
  
  
  public static void main(String[] args) { 
    
    
    Student s1 = new Student();
    Student s2 = new Student("Anis", 12, 58, 96, 41);
    Student s3 = new Student(s2);
    
    System.out.println("\tName\tRoll\tPhy\tChem\tJava");
    System.out.println("\t----\t---\t---\t----\t----");
    
    s1.display();
    s2.display();
    s3.display();
    s3.avg_marks_display();
    
  }
  
  
}
