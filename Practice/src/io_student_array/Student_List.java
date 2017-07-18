package io_student_array;

import java.util.*;
import java.io.Serializable;

public class Student_List implements Serializable{

    ArrayList<Student> sList = new ArrayList<Student>();
    
    
    public void addStudent(Student s){
     sList.add(s);
    }
    
    public Student get(int index){
     return sList.get(index);
    }
   
    public String toString() {
      String st = "";
      for (Student s : sList) {
            st+=s;}
      return st;
    }
}