import java.util.Scanner;

public class Lesson29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;

        year = input.nextInt();

        if (year <= 0 || year > 100000) {
            System.out.println("INVALID");
        } else {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}