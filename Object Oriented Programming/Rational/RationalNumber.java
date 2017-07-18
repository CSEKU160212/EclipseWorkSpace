/**
 * Auto Generated Java Class.
 */
import java.util.Scanner;
public class RationalNumber {
  
  int numer;
  int denom;
  public RationalNumber(int a,int b)
  {
    numer =  a;
    denom = b;
  }
  
  public RationalNumber add(RationalNumber x)
  {
    //RationalNumber ra;
    int den1;
    int num1;
    den1 = this.denom*x.denom;
    num1 = (this.numer*x.denom)+(this.denom*x.numer);
    RationalNumber ra = new RationalNumber(num1,den1);
    return ra;
  }
 //Static Method for Reducing//;
  public static RationalNumber reduce(RationalNumber x)
  {
    int denom = x.denom;
    int numer = x.numer;
    int sum=1;
    for(int i=1;i<=((int)(x.denom/2));i++)
    {
      if((denom%i==0)&&(numer%i==0))
      {
        sum*=i;
      }
    }
      denom = denom/sum;
      numer = numer/sum;
      return new RationalNumber(numer,denom);
      
    }
  
  //Non-Static method for Reducing//;
  public void reduce2()
  {
    int sum=1;
    for(int i=1;i<=((int)(denom/2));i++)
    {
      if((denom%i==0)&&(numer%i==0))
      {
        sum*=i;
      }
    }
      denom = denom/sum;
      numer = numer/sum;
      //return new RationalNumber(numer,denom);
  }
  
  
  public RationalNumber sub(RationalNumber x)
  {
    //RationalNumber ra;
    int den1;
    int num1;
    den1 = this.denom*x.denom;
    num1 = (this.numer*x.denom)-(this.denom*x.numer);
    RationalNumber ra = new RationalNumber(num1,den1);
    return ra;
  }
  
  public RationalNumber reciprocal()
  {
//    int denom1,numer1;
//    denom1= this.denom;
//    numer1 = this.numer;
    return new RationalNumber(denom,numer);
    
  }
  public RationalNumber divide(RationalNumber x)
  {
    return reduce(new RationalNumber((this.numer*x.denom),(this.denom*x.numer)));
  }
  public void issame(RationalNumber x)
  {
    if((this.denom==x.denom)&&(this.numer==x.numer))
    {
      System.out.println("Numbers are same");
    }
    else
    {
      System.out.println("Numbers are not same");
    }
  }
  
  
  public String toString()
  {
    return numer+"/"+denom;
  }
  
}