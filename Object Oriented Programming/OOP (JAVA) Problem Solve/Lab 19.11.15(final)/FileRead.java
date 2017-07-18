import java.util.Scanner;
import java.io.*;
public class FileRead{
  
  
  public FileRead() throws Exception
  {
    
    FileOutputStream out = new FileOutputStream("Sorted.txt");
    DataOutputStream d = new DataOutputStream(out);
    String str = null;
    int num[] = new int[20];
    try{
      
      
      Scanner scan = new Scanner(new File("File.txt"));
      
      int i;
      for(i=0;i<20;i++)
      {
        
        num[i]=scan.nextInt();
        
      }
      // Sorting and writing
      
      int j,k;
      for( j=0;j<20;j++)
      {
        for( k=j+1;k<20;k++)
        {
          if(num[j]>num[k])
          {
            int temp = num[j];
            num[j]= num[k];
            num[k]=temp;
          }
          
          
        }
        
      }
      scan.close();
    }
    catch(Exception e)
    {
      System.out.println(e.getMessage());
      
    }
    
    
    for(int p=0;p<20;p++)
    {
      try {
        
        d.writeUTF(num[p]+"");
      }
      catch(Exception e)
      {
        
        System.out.println(e.getMessage());
        
      }
    }
    
  }
  
  
}

