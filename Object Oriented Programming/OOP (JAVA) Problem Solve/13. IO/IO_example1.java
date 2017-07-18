import java.io.*;
import java.util.Scanner;

public class IO_example1 {
  
  public static void main(String[] args)
  {
    Scanner scan = new Scanner (System.in);
    PrintWriter outputStream = null;
    try
    {
      outputStream =
        new PrintWriter(new FileOutputStream("out.txt"));
    }
    catch(FileNotFoundException e)
    {
      System.out.println("Error opening the file out.txt. " + e.getMessage());
      System.exit(0);
    }
    System.out.println("Enter three lines of text:");
    String line = null;
    int count;
    for (count = 1; count <= 3; count++)
    {
      line = scan.nextLine();
      outputStream.println(count + " " + line);
    }
    outputStream.close();
    System.out.println("... written to out.txt.");
  }
  
}