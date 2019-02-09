import java.io.FileWriter;

/**
 * This Program won't compile in IDE and may show red underline on certain places
 * Try compiling it through command line.
 */

public class CheckedExceptionInitial {

        public static void main(String args[]) {
            FileWriter myWriter = new FileWriter("MyTestFile.txt");

            myWriter.write("Hi, I'm trying to write something.");
            myWriter.close();
        }

}
