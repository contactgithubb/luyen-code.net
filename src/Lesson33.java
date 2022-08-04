import java.util.Scanner;

public class Lesson33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int sum;

        n = input.nextInt();

        sum = 2 * n;

        for (int i = 1; i <= n; i++) {
            if (i >= 2) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}