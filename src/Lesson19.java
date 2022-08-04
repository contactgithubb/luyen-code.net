import java.util.Scanner;

public class Lesson19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int x;
        int c;

        a = input.nextInt();
        b = input.nextInt();
        x = input.nextInt();

        c = (3 * x) - (a + b);

        System.out.println(c);
    }
}
