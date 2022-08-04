import java.util.Scanner;

public class Lesson35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int sum = 0;
        int even = 0;
        int odd = 0;

        n = input.nextInt();

        for (int i = 1; i <= 3 * n + 1; i++) {
            if (i % 2 == 0) {
                even -= i;
            } else {
                odd += i;
            }
        }

        sum = even + odd;

        System.out.println(sum);
    }
}