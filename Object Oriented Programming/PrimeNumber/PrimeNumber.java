/**
 * Auto Generated Java Class.
 */

import java.util.*;
public class PrimeNumber {
  
  
  public static void main(String[] args) { 
    
    
    int s1, s2;
    Scanner num = new Scanner(System.in);
    
    s1 = num.nextInt();
    s2 = num.nextInt();
    
    int st = (s1<s2)? s1:s2;
    int end = (s1>s2)? s1:s2;
    int count=0;
    
    for(int i=st; i<=end; i++)
    {
     int flag=0;
        for(int n=2; n<=i/2; n++){
            if (i%n==0)
            {
                flag=1;
                break;
            }

        }
        if(flag==0 && i!=0 && i!=1)
            {
                count++;
            }
    }
    
    System.out.println(count);
  }
  
  /* ADD YOUR CODE HERE */
  
}
