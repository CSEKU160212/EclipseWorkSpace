package io_student_array;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serializer {
  
  public void serializeStudent_List(Student_List s){
    
    try{
      
      FileOutputStream fout = new FileOutputStream("student_list.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fout);   
      oos.writeObject(s);
      oos.close();
      System.out.println("Done");
      
    }catch(Exception ex){
      ex.printStackTrace();
    }
  }
}