import java.sql.Connection;
import java.util.List;

/**
 * This is the client program for JDBCUtil
 */
public class JDBCTest {

    public static void main(String[] args) {

        String option = "";

        if ((args != null) && (args.length >= 1)) {
            option = args[0];
            switch (option) {
                case "C":
                    create();
                    break;
                case "R":
                    readAll();
                    break;
                case "U":
                    update();
                    break;
                case "D":
                    delete();
                    break;
                default:
                    System.out.println("Unrecoganzied Option. Only use C / R / U / D");

            }

        }


    }

    public static void create()
    {
        //TODO

        /**
         * This method need to be modified in such a way that the user need to enter the account no, account name
         * and opening balance from the console and them you create an object and set used-input value.
         */


        BasicBankAccount bba = new BasicBankAccount();
        bba.setAccountNo(10000);
        bba.setAccountName("Vijoy SB Account");
        bba.setAccountBalance(4500.00);
        JDBCUtility.createRecord(bba);
    }

    public static void readAll()
    {
        List<BasicBankAccount> myBankAccounts = JDBCUtility.getAccounts();

        myBankAccounts.forEach((bba) -> System.out.println(bba.toString()));

    }

    public static void update()
    {
        //TODO

        /**
         *
         * 1. Accept an "account no" as input. Then use a different version of getAccounts() as getAnAccount() [Ref: JDBCUtility.java]
         *
         * 2. Display the single account object back to the user in console.
         *
         * 3. Then, ask the new name for the 'Account Name' as a user input.
         *
         * 4. Then, set that 'Account Name' with already retrieved account object
         *
         * 5. Pass the modified account object  to JDBCUtility.updateRecord() to update the the account details.
         */
    }

    public static void delete()
    {
        //TODO

        /**
         * Same like Update() method steps
         *
         * 1. Get an account number from user as an input
         *
         * 2. Retrieve that account object and show the account details to the user,
         *      with an option "D" for Delete "C" for Cancel.
         *
         * 3. If user input is "D", try deleting the account details from the database using JDBCUtility.deleteRecord()
         */
    }
}
