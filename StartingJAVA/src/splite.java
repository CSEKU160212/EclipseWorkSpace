import java.io.BufferedReader;
import java.io.InputStreamReader;

public class splite {
public static void main(String[] args) throws Exception{
	InputStreamReader l=new InputStreamReader(System.in);
	BufferedReader s=new BufferedReader(l);
	String str=s.readLine();
	
	String name[]=str.split(","); 
	for( String std: name)
	{
		System.out.println(std);
	}
	
	
	
}
}
