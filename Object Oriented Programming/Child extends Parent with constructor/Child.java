/**
 * Auto Generated Java Class.
 */
public class Child extends Parent {
  
   int n;
 public Child(int x, int y)
 {
   super(x);
   n=y;
   System.out.println("n has been initialized");
   
 }
  
  public void display_n()
  {
   System.out.println("This is from child : n = "+n);
  }
 
  public void display_m()
  {
   System.out.println("This is from child : m = "+m);
  }
  
  
}
