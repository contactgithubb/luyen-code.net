import java.util.Scanner;

public class Lesson10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int c;
        int result;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        result = (a - b) * c;

        System.out.println(result);
    }
}