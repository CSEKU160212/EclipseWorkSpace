package URI1035;

import java.util.Scanner;

public class Main {
  public static Scanner S=new Scanner(System.in);
	public static void main(String[] args) {

		while(S.hasNext())
		{
			int A=S.nextInt();
			int B=S.nextInt();
			int C=S.nextInt();
			int D=S.nextInt();
			
			if((B>C) && (D>A) && (C+D)>(A+B) && C>=0 && D>=0 && A%2==0)
				{
				System.out.println("Valores aceitos");
				}
			else {
				System.out.println("Valores nao aceitos");
			}
		}
	}

}
