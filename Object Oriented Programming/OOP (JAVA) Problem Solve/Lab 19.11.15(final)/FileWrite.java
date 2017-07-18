import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.*;
import java.util.Random;

public class FileWrite{

  public FileWrite()
  {
    try {
     FileOutputStream fout = new FileOutputStream("File.txt");
     PrintWriter data = new PrintWriter(fout);
    
    Random rand = new Random();
    for(int i = 1;i<=20;i++)
    {
    data.printf("%d ",rand.nextInt(100));
    }
    
    
    data.close();
    }
    catch(Exception e)
    {
    System.out.println(e.getMessage());
    }
  
  
  }

}