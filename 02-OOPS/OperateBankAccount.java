import java.util.*;


public class OperateBankAccount {

    // To Store three (or any number of) BankAccount created.
    private static ArrayList<SimpleBankAccount> BankAccounts = new ArrayList<SimpleBankAccount>();

    public static void main(String[] args) {

        //--> Creates 3 Bank Accounts


        Scanner keyboard = new Scanner(System.in);

        System.out.println("You will enter 3 Bank Account Details\n");

        for (int index = 1; index <= 3; index++) {

            System.out.printf("Enter name for account #%d: ", index);
            String name = keyboard.nextLine();
            System.out.printf("Enter amount for account #%d: ", index);
            int amount = Integer.parseInt(keyboard.nextLine());
            SimpleBankAccount anAccount = new SimpleBankAccount(name, amount);
            BankAccounts.add(anAccount);
        }

        displayAccountStatus();

        System.out.println("Mimicing some account operations ...!\n");

        // Let us do some transactions. It is not having any logic - just to learn
        for (int index = 0; index < 3; index++) {
            SimpleBankAccount ba = BankAccounts.get(index);

            switch (index) {
                case 0:
                    deposit(ba, 100);
                    break;
                case 1:
                    withdraw(ba, 500);
                    break;
                case 2:
                    transfer(ba, BankAccounts.get(0), 250);
                    break;
            }

        }

        displayAccountStatus();

    }


    public static void deposit(SimpleBankAccount acc, int amount) {
        System.out.println("Depositing into account " + acc.getName() + ", Amount = $" + amount);
        if (!acc.deposit(amount)) {
            System.out.println("Deposit unsuccessful");
        }
    }

    public static void withdraw(SimpleBankAccount acc, int amount) {
        System.out.println("Withdrawing from account " + acc.getName() + ", Amount = $" + amount);
        if (!acc.withdraw(amount)) {
            System.out.println("Withdrawal unsuccessful");
        }
    }

    public static void transfer(SimpleBankAccount fromAcct, SimpleBankAccount toAcct,
                                int amount) {
        System.out.println("Transferring from account " + fromAcct.getName() + ", Amount = $" + amount + " to account " + toAcct.getName());
        if (fromAcct.withdraw(amount)) {
            toAcct.deposit(amount);
        } else {
            System.out.println("Transfer unsuccessful");
        }
    }

    public static void displayAccountStatus() {
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
        System.out.println("Listing 3 Bank Account Details");
        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/\n");

        //--- This is a for-loop new Syntax. And also using Lambda expressions
        BankAccounts.forEach((ba) -> System.out.println(ba.getName() + " \t" + ba.getBalanceString()));

        System.out.println("-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

    }
}

