import java.util.Scanner;

public class Lesson25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long n;
        long sqrtN;

        n = input.nextLong();

        sqrtN = (long) Math.sqrt(n);

        if (n == (Math.pow(sqrtN, 2))) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}