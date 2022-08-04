import java.util.Scanner;

public class Lesson37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int k;
        int n;
        int giaiThuaK = 1;
        int giaiThuaN = 1;
        int giaiThuaNK = 1;
        int result;

        k = input.nextInt();
        n = input.nextInt();

        for (int j = 1; j <= k; j++) {
            giaiThuaK *= j;
        }

        for (int i = 1; i <= n; i++) {
            giaiThuaN *= i;
        }

        for (int x = 1; x <= (n - k); x++) {
            giaiThuaNK *= x;
        }

        result = (giaiThuaN) / ((giaiThuaK) * (giaiThuaNK));

        System.out.println(result);
    }
}