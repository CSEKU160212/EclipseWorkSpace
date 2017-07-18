package practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class split{

	public static void main(String[] args) throws Exception {
		System.out.println("Enter 1 String: ");
		InputStreamReader sn=new InputStreamReader(System.in);
		BufferedReader b=new BufferedReader(sn);
		String s=b.readLine();
		
		System.out.println(s);
		
		String name[]=s.split(",");
		for(String std: name) {
		System.out.println(std);
		}
	}

}
