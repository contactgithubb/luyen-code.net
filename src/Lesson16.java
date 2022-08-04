import java.util.Scanner;

public class Lesson16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long n;
        long a;
        long b;

        n = input.nextInt();
        a = input.nextInt();
        b = input.nextInt();

        if (n % a == 0 && n % b == 0) {
            System.out.println("Co, tat ca!");
        } else if (n % a == 0 && n % b != 0) {
            System.out.println("Chi chia het cho " + a + ",");
        } else if (n % a != 0 && n % b == 0){
            System.out.println("Chi chia het cho " + b + ".");
        } else {
            System.out.println("Khong chia het cho so nao ca.");
        }
    }
}