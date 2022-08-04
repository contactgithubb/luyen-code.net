import java.util.Scanner;

public class Lesson5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a;
        int b;
        int chiaLayDu;

        a = input.nextInt();
        b = input.nextInt();

        chiaLayDu = a % b;

        System.out.println(chiaLayDu);
    }
}