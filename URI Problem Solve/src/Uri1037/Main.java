package Uri1037;

import java.util.Scanner;
public class Main {

	public static Scanner Sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		while(Sc.hasNext()) {
			float fp=Sc.nextFloat();
			if(fp>=0.0f && fp<=25.0f) {
				System.out.println("Intervalo [0,25]");
			}
			else if(fp>25.0f && fp<=50.0f) {
				System.out.println("Intervalo (25,50]");
			}
			else if(fp>50.0f && fp<=75.0f) {
				System.out.println("Intervalo (50,75]");
			}
			else if(fp>75.0f && fp<=100.0f) {
				System.out.println("Intervalo (75,100]");
			}
			else
			{
				System.out.println("Fora de intervalo");
			}
		}
	}

}
