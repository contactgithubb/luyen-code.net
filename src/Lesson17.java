import java.util.Scanner;

public class Lesson17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int date;
        int month;
        int year;

        date = input.nextInt();
        month = input.nextInt();
        year = input.nextInt();

        if (((1 <= date) && (date <= 31)) && (1 <= month && month <= 12) && (2000 <= year && year <= 3000)) {
            System.out.println("users setClock \\" + month + "\\" + date + "\\" + year);
        }
    }
}