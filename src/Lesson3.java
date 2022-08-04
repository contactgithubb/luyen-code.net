import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;
        int sum;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        sum = a + b + c;

        System.out.println(sum);
    }
}