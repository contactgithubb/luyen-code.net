import java.util.Scanner;

public class Lesson7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double r;
        double chuVi;
        double dienTich;
        double PI = 3.14;

        r = input.nextDouble();

        chuVi = r * 2 * PI;
        dienTich = Math.pow(r, 2) * PI;

        System.out.printf("%.3f ", chuVi);
        System.out.printf("%.3f ", dienTich);
    }
}
