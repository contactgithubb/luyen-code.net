import java.util.Scanner;

public class Lesson36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int giathua = 1;

        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            giathua *= i;
        }
        System.out.println(giathua);
    }
}