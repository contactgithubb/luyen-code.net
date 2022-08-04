import java.util.Scanner;

public class Lesson31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;

        a = input.nextInt();
        b = input.nextInt();

        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
    }
}