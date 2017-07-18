public class Rosemary extends Plant{  // The tragedic Rosemary class....

  String name;
  static int numRosemary=0; //  Will be static so that change effects on all objects.
  int numLeaves = 1024; // As default value 1024.
  
  public Rosemary(String name)    // As called in plant with one parameter.
  {
  
   super(name);  // Plant's constuctor accept a String ; name.
   this.name = name;
   numRosemary++;   // So far we created a new object Number of Rosemary increased by one.
  
  }
  
  public Rosemary(String name, int numLeaves) // As called in plant with two parameter.
  {
    super(name);  // Plant's constuctor accept only one String ; name.
                    // No matter how much leaves there are. so passed name only 
    this.name = name;
    this.numLeaves = numLeaves;
     numRosemary++;   // So far we created a new object Number of Rosemary increased by one.
  
  }
  
  public String getName()  // As called as getName from plant.
  {
  
    return "Rosemery:"+name+" numLeaves="+numLeaves; // Formatted as output.
  }
  
  public static int getNumRosemaries() // Cannot make a static reference to the non-static method getNumRosemaries() from the type Rosemary
  {
    return numRosemary;  // Return how much object we've created.
  
  }
  

}