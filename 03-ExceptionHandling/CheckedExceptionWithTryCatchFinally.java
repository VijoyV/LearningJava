import java.io.FileWriter;
import java.io.IOException;

/**
 * In this program, the checked exception which is forced by Java Compiler is correctly handled.
 *
 * Refer: CheckedExceptionInitial.java
 *
 * Still, it is developer or user duty to provide correct access to OS to make a file writeable.
 * Exception just give us a chance to do 'defensive programming'.
 *
 */

public class CheckedExceptionWithTryCatchFinally
{
    public static void main(String args[]) {

        FileWriter myWriter;

        try {

            myWriter = new FileWriter("MyTestFile.txt");

            myWriter.write("Hi, I'm trying to write something.");
            myWriter.close();

        } catch (IOException e) {

            System.out.println("Exception thrown: " + e);

        } finally {

            System.out.println("End of execution.");

        }

    }
}
