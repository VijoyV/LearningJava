import java.io.*;

public class ObjectFromFileReader {
    public static void main(String args[]) {

        ObjectInputStream inputStream = null;

        try {

            inputStream = new ObjectInputStream(new FileInputStream("ObjectStore.txt"));

            Employee emp = (Employee) inputStream.readObject();

            System.out.println("Deserialized Object Details=" + emp.toString());

            inputStream.close();

        } catch (ClassNotFoundException clnfe) {
            System.err.println("Error on Casting back: " + clnfe);
        } catch (FileNotFoundException fnfe) {
            System.err.println("Error locating file: " + fnfe);
        } catch (IOException ioe) {
            System.err.println("Error in I/O operation on file: " + ioe);
        } catch (Exception e) {
            System.err.println("Generic Error in file operation: " + e);
        } finally {
            //Close the ObjectOutputStream
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
} 
