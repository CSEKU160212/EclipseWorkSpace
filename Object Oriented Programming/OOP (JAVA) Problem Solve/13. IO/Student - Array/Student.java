import java.io.Serializable;

public class Student implements Serializable{

    String name;
    int roll;
    float marks;
    
    public Student(){}
    public Student(String name, int roll, float marks){
     this.name = name;
     this.roll = roll;
     this.marks = marks;
    }
    
    public void setname(String name){
     this.name = name;
    }
    
    public void setroll(int roll){
     this.roll = roll;
    }
    
    public void setmarks(float marks){
     this.marks = marks;
    }
    
    public String getname(){
     return this.name;
    }
    
    public int getroll(){
     return this.roll;
    }
    
    public float getmarks(){
     return this.marks;
    }
    public String toString() {
       return this.name+"\t"+this.roll+"\t"+this.marks+"\n";
    }   
}