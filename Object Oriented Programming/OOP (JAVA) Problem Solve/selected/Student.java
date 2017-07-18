
import java.util.ArrayList;

public class Student extends Person{

 private int numCourses=0;
 private ArrayList<String> courses=new ArrayList();
 private ArrayList<Integer> grades=new ArrayList();
 
 public Student(String name, String address)
 {
  super(name, address);
 }
 
 public void addCourseGrade(String course, int grade)
 {
  courses.add(course);
  grades.add(grade);
 }
 
 public void printGrades()
 {
  System.out.println(toString()+"\n "+courses+":"+grades);
 }
 
 public double getAverageGrade()
 {
  double average=0;
  for( int i=0; i<grades.size(); i++ )
  {
   average=average+grades.get(i);
  }
  return average/grades.size();
 }
 
 public String toString()
 {
  return "Student: "+ super.toString();  
 }
 
}
