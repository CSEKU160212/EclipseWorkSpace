import java.util.*;
import java.util.Scanner;

public class CourseCodes2
{
//-----------------------------------------------------------------
// Counts the number of valid course (like XXX-9999)codes that are entered 
//-----------------------------------------------------------------
  public static void main (String[] args)
  {
    String code;
    char t_s;
    int theory=0, sessional=0, invalid = 0;
    boolean isTheory=true;
    System.out.print ("Enter course code (XXX to quit): ");
    Scanner scan = new Scanner (System.in);
    code = scan.nextLine();
    
    while (!code.equals ("XXX"))
    {
      try
      { 
        int numericPart = Integer.parseInt(code.substring(4, 8));
        
        isTheory = ((numericPart%2)==1);
        if(isTheory)
          theory++;
        else
          sessional++;
      }
      catch (StringIndexOutOfBoundsException exception)
      {
        exception.printStackTrace();
      }
      catch (NumberFormatException exception)
      {
        System.out.println (" Fifth to Eigth digit is not numeric: " + code);
      }
      System.out.print("Enter product code (XXX to quit): ");
      code = scan.nextLine();
    }
    System.out.println ("# of valid theory courses entered: " + theory);
    System.out.println ("# of valid sessional courses entered: " + sessional);
  }
}