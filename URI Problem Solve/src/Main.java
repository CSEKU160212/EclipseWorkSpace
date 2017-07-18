import java.util.Scanner;


public class Main {

    public static Scanner m = new Scanner(System.in);

    public static void main(String[] args) {
        double a, b, c;
        while (m.hasNext()) {
            a = m.nextDouble();
            b = m.nextDouble();
            c = m.nextDouble();

            double d = b * b - 4 * a * c;
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            if (a != 0 && d > 0) {
                System.out.printf("R1 = %.5f\nR2 = %.5f\n", r1, r2);
            }
           else
               System.out.println("Impossivel calcular");

    }
}
}