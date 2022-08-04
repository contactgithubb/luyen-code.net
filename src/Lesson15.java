import java.util.Scanner;

public class Lesson15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x;
        int d;

        x = input.nextDouble();

        d = (int) x;

        if (d <= x) {
            System.out.println(d + " " + ++d);
        } else {
            System.out.println(--d + " " + ++d);
        }
    }
}