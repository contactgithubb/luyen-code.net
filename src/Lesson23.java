import java.util.Scanner;

public class Lesson23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int subtraction;

        a = input.nextInt();
        b = input.nextInt();

        subtraction = a - b;

        System.out.println(Math.abs(subtraction));
    }
}