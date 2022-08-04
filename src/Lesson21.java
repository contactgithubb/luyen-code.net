import java.util.Scanner;

public class Lesson21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;

        a = input.nextInt();
        b = input.nextInt();

        System.out.println(Math.max(a, b));
    }
}