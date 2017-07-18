package URI1043;

import java.util.Scanner;

public class Main {
	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		while (s.hasNext()) {
			double A, B, C, perimeter, AreaT;
			A = s.nextDouble();
			B = s.nextDouble();
			C = s.nextDouble();

			if ((A + B) > C && (A + C) > B && (B + C) > A) {
				perimeter = A + B + C;
				System.out.printf("Perimetro = %.1f\n", perimeter);
			} else {
				AreaT = .5 * (A + B) * C;
				System.out.printf("Area = %.1f\n", AreaT);
			}
		}

	}

}
