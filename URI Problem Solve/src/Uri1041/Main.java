package Uri1041;

import java.util.Scanner;

public class Main {

	public static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		while (s.hasNext()) {
			float x=s.nextFloat();
			float y=s.nextFloat();
			
			if(x==0.0f && y==0.0f) {
				System.out.println("Origem");
			}
			
			else if(x==0.0f) {
				System.out.println("Eixo Y");
			}
			else if(y==0.0f) {
				System.out.println("Eixo X");
			}
			
			else if(x>0.0f && y>0.0f) {
				System.out.println("Q1");
			}
			
			else if(x<0.0f && y>0.0f) {
				System.out.println("Q2");
			}
			else if(x<0.0f && y<0.0f) {
				System.out.println("Q3");
			}
			else if(x>0.0f && y<0.0f) {
				System.out.println("Q4");
			}
			
}
	}

}
