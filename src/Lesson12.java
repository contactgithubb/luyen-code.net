import java.util.Scanner;

public class Lesson12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int A;
        int B;
        int X;
        int Y;
        int price;

        A = input.nextInt();
        B = input.nextInt();
        X = input.nextInt();
        Y = input.nextInt();

        price = (X * A) + (Y * B);

        System.out.println(price);
    }
}