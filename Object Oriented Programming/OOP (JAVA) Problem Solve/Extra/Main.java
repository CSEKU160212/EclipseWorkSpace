import java.util.Scanner;
public class Main {
  
  
  public static void main(String[] args) { 
    Scanner s=new Scanner(System.in);
    long a,b;
    while(s.hasNext())
    {
      a=s.nextLong();
      b=s.nextLong();
      System.out.println(a>b?a-b:b-a);
    }
    
  }
  
}
