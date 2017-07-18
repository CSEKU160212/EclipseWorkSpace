/* demonstrating reading and writing text files
 */


import java.io.*;
import java.util.*;
import java.text.*;

public class FileIO
{
  public static void main(String[] arg)
  {
    try
    {
      BufferedReader inFileStream = 
        new BufferedReader(new FileReader("in.txt"));
      
      String name = null;
      int age = 0;
      float gpa = 0;
      
      String line = inFileStream.readLine();
      while (line != null)
      {
        StringTokenizer parser = 
          new StringTokenizer(line);
        
        // reading name, age, gpa from the line
        name = parser.nextToken();
        age = Integer.parseInt(parser.nextToken());
        gpa = Float.parseFloat(parser.nextToken());
        
        System.out.println(name + ' ' + gpa);
        line = inFileStream.readLine();
      }
      
      
      inFileStream.close();
      
    }
    catch(FileNotFoundException e)
    {
      System.out.println(e.getMessage());
      System.out.println("in.txt not found");
      System.exit(-1);
    }
    catch(IOException e)
    {
      System.out.println(e.getMessage());
      System.out.println("Error reading in.txt");
      System.exit(-1);
    }
  }
}

