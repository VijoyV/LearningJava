import java.util.*;

/**
 * The program must produce two types of output from the counts thus obtained, a numerical output
 * and a bar-histogram. In both outputs, the program uses the numbers 0, 10, . . . , 90, 100 as the
 * representatives of the bins. These representative numbers are equal to ten times the indexes to the
 * bins. In the bar-histogram output, the program prints a horizontal line of hash marks for each bin. The
 * lengths of the lines are equal to the counts. The histogram can be generated using a double for-loop.
 */

public class ScoreDist {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int[] counts = new int[11];

        System.out.println("Enter scores in the range 0..100.");
        System.out.println("When you are done , enter CTRL -D.");
        while (keyboard.hasNext()) {
            int score = keyboard.nextInt();
            int position = score / 10;
            counts[position]++;
        }


        System.out.println("The histogram:");
        for (
                int index = 0;
                index <= 10; index++) {
            System.out.printf("%3d:%d%n", index * 10, counts[index]);
        }

        System.out.println("The bar histogram:");

        for (
                int index = 0;
                index <= 10; index++) {
            System.out.printf("%3d:", index * 10);
            for (int i = 1; i <= counts[index]; i++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
