class BankAccount {

    // String
    static String bankName = "Liceo Bank";
    private static String accountNumber = "ACC";
    String accountHolderName;

    // Int
    public static int totalAccounts = 0;


    // Double
    public static double intrestRate = 0.03;
    double balance = 0;


    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    public static int deposit(int amount){

        return amount;
    }

    public static int withdraw(int amount){

        return amount;
    }

    public static int calculateintrest(int intrest){

        return intrest;
    }

}

public class Main {
    public static void main(String[] args){

        double intrestPercentage = BankAccount.intrestRate * 100;


        System.out.println("Bank Name: " + BankAccount.bankName);
        System.out.println("Intrest Rate: " + intrestPercentage + "%");

        BankAccount bankAccount1 = new BankAccount("John Doe", 1000.0);

        System.out.println("\nAccount Created: ACC" + bankAccount1.totalAccounts + " for " + bankAccount1.accountHolderName + " with initial balance: $" + bankAccount1.balance);
    }
}
