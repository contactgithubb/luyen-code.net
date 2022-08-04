import java.util.Scanner;

public class Lesson20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long a;
        long b;

        a = input.nextLong();
        b = input.nextLong();

        if (a > b) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}