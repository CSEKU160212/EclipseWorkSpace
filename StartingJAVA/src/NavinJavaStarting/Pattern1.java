package NavinJavaStarting;

public class Pattern1 {

	public static void main(String[] args) {

		for (int i = 1; i <10 ; i++){
			for (int j = 1; j <= 10; j++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}

		System.out.println("\n\n");

		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println("");
		}

		System.out.println("\n\n");

		for (int i = 1; i <= 10; i++) {
			for (int j = 10; j >= i; j--) {
				System.out.print(" * ");
			}
			System.out.println("");
		}

		System.out.println("\n\n");
		
		

		for (int i = 1; i <= 10; i++) {
			for (int j = 10; j > i; j--) {
				System.out.print("   ");
			}
				for (int l = 1; l <= i; l++) {
					System.out.print(" * ");
			}
			System.out.println("");
		}

		

		System.out.println("\n\n");
		
		
		
		for (int row = 1; row <= 10 ; row++) {
			for(int col=1; col<=10; col++) {
				if(row==1 || row==10 || col==1 || col==10)
				{
					System.out.print(" * ");
				}
				else
					System.out.print("   ");
			}
			System.out.println("");
		}
		
		System.out.println("\n\n\n");
		
		

	}

}
