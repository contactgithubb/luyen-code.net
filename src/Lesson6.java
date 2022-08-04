import java.util.Scanner;

public class Lesson6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int d;
        int r;
        int chuVi;
        int dienTich;

        d = input.nextInt();
        r = input.nextInt();

        chuVi = (d + r) * 2;
        dienTich = d * r;

        System.out.println(chuVi);
        System.out.println(dienTich);
    }
}
