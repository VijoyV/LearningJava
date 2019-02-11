import java.io.*;

public class ObjectToFileWriter {
    public static void main(String args[]) {

        ObjectOutputStream outputStream = null;

        try {

            outputStream = new ObjectOutputStream(new FileOutputStream("ObjectStore.txt"));

            Employee emp = new Employee(2168, "Vijoy");

            outputStream.writeObject(emp);
            emp = new Employee(2150, "Vinod");

            outputStream.writeObject(emp);

        } catch (FileNotFoundException fnfe) {
            System.err.println("Error locating file: " + fnfe);
        } catch (IOException ioe) {
            System.err.println("Error in I/O operation on file: " + ioe);
        } catch (Exception e) {
            System.err.println("Generic Error in file operation: " + e);
        } finally {
            //Close the ObjectOutputStream
            try {
                if (outputStream != null) {
                    outputStream.flush();
                    outputStream.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

    }
} 
