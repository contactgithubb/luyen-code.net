import java.util.Scanner;

public class Lesson14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;
        int currentYear = 2021;
        int ageOfPerson;

        year = input.nextInt();

        ageOfPerson = currentYear - year;

        System.out.println(ageOfPerson);
    }
}
