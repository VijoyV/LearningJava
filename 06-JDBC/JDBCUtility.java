import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class JDBCUtility {

    private static final String DB_URL
            = "jdbc:mysql://192.168.1.248:3306/purpleslate?";

    private static Connection con = null;


    private static final String GET_ACCOUNTS = "SELECT account_number, account_name, account_balance FROM account";

    private static final String GET_AN_ACCOUNT = "SELECT account_number, account_name, account_balance FROM account WHERE account_number = ?";

    private static final String ADD_ACCOUNT = "INSERT INTO account(account_number, account_name, account_balance) VALUES (?, ?, ?)";

    private static final String UPDATE_ACCOUNT = "UPDATE account SET account_name = ? WHERE account_number = ?";

    private static final String DELETE_ACCOUNT = "DELETE FROM account WHERE account_number = ?";

    /**
     * @return
     */
    public static Connection getDBConnection() {

        if (con == null) {
            try {

                //Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                con =
                        DriverManager.getConnection(DB_URL +
                                "user=prakash&password=prakash1997");


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

    /**
     * @return
     */
    public static List<BasicBankAccount> getAccounts() {

        Connection localConn = getDBConnection();

        Statement stmt = null;
        ResultSet rs = null;

        List<BasicBankAccount> loadedBasicBankAccounts = new ArrayList();

        try {

            stmt = localConn.createStatement();
            rs = stmt.executeQuery(GET_ACCOUNTS);

            BasicBankAccount bba = null;

            while (rs != null && rs.next()) {

                bba = new BasicBankAccount();

                bba.setAccountNo(rs.getInt(1));
                bba.setAccountName(rs.getString(2));
                bba.setAccountBalance(rs.getDouble(3));
                loadedBasicBankAccounts.add(bba);
            }
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        } finally {

        }
        return loadedBasicBankAccounts;
    }

    /**
     *
     * @param accountNumber
     * @return
     */
    public static BasicBankAccount getAnAccount(int accountNumber) {

        Connection localConn = getDBConnection();

        PreparedStatement pStmt = null;
        ResultSet rs = null;

        BasicBankAccount bba = null;

        try {

            pStmt = localConn.prepareStatement(GET_AN_ACCOUNT);
            pStmt.setInt(1, accountNumber);
            pStmt.executeQuery();

            if (rs != null && rs.next()) {

                bba = new BasicBankAccount();

                bba.setAccountNo(rs.getInt(1));
                bba.setAccountName(rs.getString(2));
                bba.setAccountBalance(rs.getDouble(3));
            }
        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        } finally {

        }
        return bba;
    }


    /**
     *
     * @param bba
     */
    public static void createRecord(BasicBankAccount bba) {

        Connection localConn = getDBConnection();
        PreparedStatement pStmt = null;

        try {

            pStmt = localConn.prepareStatement(ADD_ACCOUNT);


            pStmt.setInt(1, (bba.getAccountNo()));
            pStmt.setString(2, bba.getAccountName());
            pStmt.setDouble(3, bba.getAccountBalance());

            pStmt.execute();

            System.out.println("\nRecord Inserted with ID=" + bba.toString());

        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        } finally {

        }
    }

    /***
     *
     * @param bba
     */
    public static void updateRecord(BasicBankAccount bba) {

        Connection localConn = getDBConnection();
        PreparedStatement pStmt = null;

        try {

            pStmt = localConn.prepareStatement(UPDATE_ACCOUNT);

            pStmt.setString(1, bba.getAccountName());
            pStmt.setInt(2, bba.getAccountNo());


            pStmt.execute();

            System.out.println("\nRecord Inserted with ID=" + bba.toString());

        } catch (SQLException sqle) {
            System.out.println(sqle.getMessage());
        } finally {

        }
    }

    /***
     *
     * @param bba
     */
    public static void deleteRecord(BasicBankAccount bba) {

        //TODO

        /**
         * Implement this method almost similar to updateRecord()
         */
    }



}
