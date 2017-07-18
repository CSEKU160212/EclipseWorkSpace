/**
 * Auto Generated Java Class.
 */
public class Student {
  String Name;
    int Roll, Phy, Chem, Java;
    
    
  
  public Student(){
     Name = new String ("Disha");
     Roll = 26;
     Phy = 77;
     Chem = 87;
     Java = 78;
  }
  
  public Student(String name, int rl, int d1, int d2, int d3){
  Name = name;
  Roll = rl;
  Phy = d1;
  Chem = d2;
  Java = d3;
  }
  
  public Student(Student obj){
   this.Name = obj.Name;
  this.Roll = obj.Roll;
   this.Phy = obj.Phy;
  this.Chem = obj.Chem;
  this.Java = obj.Java;
  
  }
  
  public void display(){
  System.out.println("\t"+Name+"\t"+Roll+"\t"+Phy+"\t"+Chem+"\t"+Java);
  }
  
  
  
  public void avg_marks_display(){
    int avg = (Phy + Chem + Java)/3;
  System.out.println("\tAverage marks of"+ " " +" "+Name+" "+"is: "+avg);
  }
  
}
