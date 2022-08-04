import java.util.Scanner;

public class Lesson8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;

        a = input.nextInt();
        b = input.nextInt();

        c = a + b;

        System.out.println(a + " + " + b + " = " + c);
    }
}
