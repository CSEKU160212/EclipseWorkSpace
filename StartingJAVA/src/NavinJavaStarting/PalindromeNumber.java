package NavinJavaStarting;

import java.util.Scanner;

public class PalindromeNumber {

	private static Scanner myScanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int reminder, temp = 0, number, n;
			System.out.print("Plzzzz enter the number to check Palindrome: ");
			number = myScanner.nextInt();
			n = number;
			while (number > 0) {
				reminder = number % 10;
				number = number / 10;
				temp = temp * 10 + reminder;
			}
			if (n == temp) {
				System.out.println(n + " is Palindrome\n");
			} else if (n != temp) {
				System.out.println(n + " isn't Palindrome\n");
			}
		}

	}
}
