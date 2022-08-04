import java.util.Scanner;

public class Lesson28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a;
        double b;
        char phepTinh;

        a = input.nextDouble();
        phepTinh = input.next().charAt(0);
        b = input.nextDouble();

        switch (phepTinh) {
            case '+' :
                System.out.printf("%.2f ", (a + b));
                break;
            case '-':
                System.out.printf("%.2f ", (a - b));
                break;
            case '*':
                System.out.printf("%.2f ", (a * b));
                break;
            case '/':
                if (a == 0 || b == 0) {
                    System.out.println("Math Error");
                } else {
                    System.out.printf("%.2f ", (a / b));
                }
                break;
        }
    }
}