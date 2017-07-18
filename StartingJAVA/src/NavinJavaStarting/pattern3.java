package NavinJavaStarting;

import java.util.Scanner;

public class pattern3 {
	private static Scanner myscanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("Enter the value of n: ");
			int n = myscanner.nextInt();
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(" " + (i + j) % 2 + " ");
				}
				System.out.println("");
			}
		}

	}
}
