import java.util.Scanner;

public class Lesson27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;
        double x1;
        double x2;
        double delta;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        delta = Math.pow(b, 2) - (4 * a * c);

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("INF"); // Vo so nghiem
                } else {
                    System.out.println("NO"); // Vo nghiem
                }
            } else {
                System.out.printf("%.2f", (double) -c / Math.abs(b));
            }
        } else {
            if (delta < 0) {
                System.out.println("NO");
            } else if (delta == 0) {
                x1 = (double) -b / (2 * a);

                System.out.printf("%.2f", x1);
            } else {
                x1 = (-b - Math.sqrt(delta)) / (2 * a);
                x2 = (-b + Math.sqrt(delta)) / (2 * a);

                System.out.printf("%.2f ", x1);
                System.out.printf("%.2f", x2);
            }
        }
    }
}