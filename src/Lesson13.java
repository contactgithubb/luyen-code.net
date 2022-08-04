import java.util.Scanner;

public class Lesson13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char myChar;

        myChar = input.next().charAt(0);

        int charToNumber = myChar;
        int nextCharNumber = charToNumber + 1;
        char result = (char) nextCharNumber;

        if (nextCharNumber > 122) {
            System.out.println('a');
        } else {
            System.out.println(result);
        }
    }
}
