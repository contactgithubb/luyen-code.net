import java.util.Scanner;

public class Lesson4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int tong;
        int hieu;
        int tich;
        double thuong;

        a = input.nextInt();
        b = input.nextInt();

        tong = a + b;
        hieu = a - b;
        tich = a * b;
        thuong = (double) a / (double) b;

        System.out.println(tong);
        System.out.println(hieu);
        System.out.println(tich);

        if (b == 0) {
            System.out.println("INF");
        } else {
            System.out.printf("%.2f", thuong);
        }
    }
}