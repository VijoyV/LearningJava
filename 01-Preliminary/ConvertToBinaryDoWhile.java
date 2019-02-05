import java.util.*;

// Good Example of do-while loop.
// Caution  : You may have to enter a negative number like -1 to get out of the infinite loop.
//          : Also Try Ctrl + D to exit from the infinite loop

public class ConvertToBinaryDoWhile {


    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int number;
        String result;

        do {
            System.out.print("Enter an integer: ");
            number = keyboard.nextInt();
            result = convert(number);
            System.out.printf("%d --> %s%n", number, result);
        } while (number >= 0);
    }

    public static String convert(int number) {
        if (number == 0) {
            return "0";
        }
        String binary = "";
        do {
            int bit = number % 2;
            binary = bit + binary;
            number /= 2;
            System.out.printf("%10d, %s%n", number, binary);
        } while (number > 0);
        return binary;
    }
}
