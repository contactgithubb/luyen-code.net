import java.util.Scanner;

public class Lesson18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long a;
        long b;
        long c;
        long x;
        long fx;

        a = input.nextLong();
        b = input.nextLong();
        c = input.nextLong();
        x = input.nextLong();

        fx = a * (x * x) + b * x + c;

        System.out.println(fx);
    }
}