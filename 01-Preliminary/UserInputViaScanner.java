import java.util.Scanner;
// an example of using Scanne

public class UserInputViaScanner {

    public static void main(String[] args) {

        Scanner console;
        String theWord;
        int theWholeNumber;
        double theRealNumber;
        console = new Scanner(System.in);
        System.out.print("Enter a string: ");
        theWord = console.next();
        System.out.print("Enter an int: ");
        theWholeNumber = console.nextInt();
        System.out.print("Enter a double: ");
        theRealNumber = console.nextDouble();
        System.out.print("You have entered ");
        System.out.print(theWord);
        System.out.print(", ");
        System.out.print(theWholeNumber);
        System.out.print(", and ");
        System.out.print(theRealNumber);
        System.out.println();
    }
}
