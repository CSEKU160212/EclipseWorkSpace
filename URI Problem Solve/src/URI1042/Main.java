package URI1042;

import java.util.Scanner;

public class Main {
	public static Scanner S = new Scanner(System.in);

	public static void main(String[] args) {

		while (S.hasNext()) {
			int a, b, c, sn, bn, mid;
			a = S.nextInt();
			b = S.nextInt();
			c = S.nextInt();
			bn = a > b ? a : b;
			bn = bn > c ? bn : c;

			sn = a < b ? a : b;
			sn = sn < c ? sn : c;

			mid = (a + b + c) - (bn + sn);
			System.out.println(sn + "\n" + mid + "\n" + bn);
			System.out.println("");
			System.out.println( a + "\n" + b + "\n" + c);
		}
	}

}
