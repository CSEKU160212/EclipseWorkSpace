/*
 * A test driver for Person and its subclasses.
 */
public class TestPerson {
   public static void main(String[] args) {
      /* Test Student class */
      Student s1 = new Student("Tamim", "Khanjahan Ali Hall");
      s1.addCourseGrade("CSE 1201", 97);
      s1.addCourseGrade("CSE 1202", 99);
      s1.printGrades();
      System.out.println("Average is " + s1.getAverageGrade());
      
      /* Test Teacher class */
      Teacher t1 = new Teacher("Anis", "CSE, KU");
      System.out.println(t1);
      String[] courses = {"CSE 1201", "CSE 1202", "CSE 1201"};
      for (String course: courses) {
         if (t1.addCourse(course)) {
            System.out.println(course + " added.");
         } else {
            System.out.println(course + " cannot be added.");
         }
      }
      for (String course: courses) {
         if (t1.removeCourse(course)) {
            System.out.println(course + " removed.");
         } else {
            System.out.println(course + " cannot be removed.");
         }
      }
   }
}