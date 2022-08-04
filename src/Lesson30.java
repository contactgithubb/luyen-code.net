import java.util.Scanner;

public class Lesson30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month;
        int year;

        month = input.nextInt();
        year = input.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30");
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("29");
                } else {
                    System.out.println("28");
                }
                break;
            default:
                System.out.println("INVALID");
        }
    }
}