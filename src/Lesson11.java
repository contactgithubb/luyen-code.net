import java.util.Scanner;

public class Lesson11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int tich;

        a = input.nextInt();
        b = input.nextInt();

        tich = a * b;

        if (tich > 0) {
            System.out.println(1);
        } else if (tich < 0) {
            System.out.println(-1);
        } else {
            System.out.println(0);
        }
    }
}
