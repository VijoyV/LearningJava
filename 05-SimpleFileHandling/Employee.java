import java.io.*;

public class Employee implements Serializable {

    private int ID;
    private String name;

    public Employee(int id, String name) {
        this.ID = id;
        this.name = name;
    }

    public String toString() {
        String empStr = this.ID + ":" + this.name;
        return (empStr);
    }

}
