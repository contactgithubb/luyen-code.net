import java.util.Scanner;

public class Lesson24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n;

        n = input.nextDouble();

        int result = (int) Math.round(n);

        System.out.println(result);
    }
}