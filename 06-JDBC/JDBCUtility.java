import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtility {

    private static final String DB_URL
            = "jdbc:mysql://localhost/test?";
    private static Connection con = null;

    public static Connection getDBConnection() {

        if (con == null) {
            try {

                Class.forName("com.mysql.jdbc.Driver").newInstance();
                con =
                        DriverManager.getConnection( DB_URL+
                                "user=minty&password=greatsqldb");



                System.out.println("DB Connection Got");
                System.out.println("New JDBC Connection Created!");
            } catch (SQLException ex) {
                System.err.println("SQLException: " + ex.getMessage());
                ex.printStackTrace();
            } catch (java.lang.Exception e) {
                System.out.print("ClassNotFoundException: ");
                e.printStackTrace();
            }

        } else {
            System.out.println("JDBC Connection is being reused !");
        }

        return con;
    }
}



