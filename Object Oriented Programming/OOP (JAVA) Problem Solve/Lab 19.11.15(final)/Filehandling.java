import java.io.*;
public class Filehandling{

public static void main(String args[])
{
  try{
 FileWrite w = new FileWrite();
 FileRead r = new FileRead(); 
  }
  catch(Exception x)
  {
  
  System.out.println(x.getMessage());
  }
}

}