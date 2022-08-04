import java.util.Scanner;

public class Lesson34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        double sum = 0;

        n = input.nextInt();

        for (int i = 2; i <= n; i++) {
            sum += (1 / (double) i);
        }
        System.out.printf("%.4f",  sum);
    }
}