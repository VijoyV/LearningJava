import java.sql.Connection;

public class JDBCTest {

        public static void main (String[] args)
        {
            Connection connect = JDBCUtility.getDBConnection();
        }
}
