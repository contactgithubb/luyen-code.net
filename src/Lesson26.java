import java.util.Scanner;

public class Lesson26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a;
        double b;
        double x;

        a = input.nextInt();
        b = input.nextInt();

        if (a == 0) {
            if (b == 0) {
                System.out.println("INF");
            } else {
                System.out.println("NO");
            }
        } else {
            x = -b / a;

            System.out.printf("%.2f", x);
        }
    }
}