import java.sql.Connection;
import java.util.List;

public class JDBCTest {

        public static void main (String[] args)
        {

            List<BasicBankAccount> myBankAccounts = JDBCUtility.getAccounts();

            myBankAccounts.forEach((bba) -> System.out.println(bba.toString()));
        }
}
