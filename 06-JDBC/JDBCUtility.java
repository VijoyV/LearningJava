import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class JDBCUtility {

    private static final String DB_URL
            = "jdbc:mysql://192.168.1.248:3306/purpleslate?";

    private static Connection con = null;


    private static final String GET_ACCOUNTS = "SELECT account_number, account_name, account_balance FROM account";

    private static final String ADD_ACCOUNT = "INSERT INTO <tableName> VALUES (<feildListSeparatedByComma> )";

    /**
     *
     * @return
     */
    public static Connection getDBConnection() {

        if (con == null) {
            try {

                //Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                con =
                        DriverManager.getConnection( DB_URL+
                                "user=root&password=prakash1997");


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
     *
     * @return
     */
    public static List<BasicBankAccount> getAccounts()
    {

        Connection localConn = getDBConnection();

        Statement stmt = null;
        ResultSet rs = null;

        List<BasicBankAccount> loadedBasicBankAccounts = new ArrayList();

        try{

            stmt = localConn.createStatement();
            rs = stmt.executeQuery(GET_ACCOUNTS);

            BasicBankAccount bba = null;

            while(rs!=null && rs.next()) {

                bba = new BasicBankAccount();

                bba.setAccountNo(rs.getInt(1));
                bba.setAccountName(rs.getString(2));
                bba.setAccountBalance(rs.getDouble(3));
                loadedBasicBankAccounts.add(bba);
            }
        }

        catch (SQLException sqle)
        {
            System.out.println(sqle.getMessage());
        }

        finally
        {

        }
        return loadedBasicBankAccounts;
    }

    /**
     *

    public void CreateRecord(BankAccount ba);
    {

        Connection localConn = null;
        PreparedStatement pStmt = null;
        try{

            pStmt = localConn.prepareStatement(ADD_ACCOUNT);


            pStmt.setInt(1, Integer.parseInt(toyIdTxf.getText()));
            pStmt.setString(2,  toyNameTxf.getText());
            pStmt.setString(3, (String)toyCategoryCbx.getSelectedItem());

            pStmt.execute();

            ("\nRecord Inserted with ID="+toyIdTxf.getText());
        }
        catch (SQLException sqle)
        {
            System.out.println(sqle.getMessage());
        }
        finally
        {

        }

                **/
    }




