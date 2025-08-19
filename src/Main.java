class BankAccount {

    // String
    static String bankName = "Liceo Bank";
    String accountHolderName;

    // Int
    public static int totalAccounts;
    int accountNumber;
    int amount;

    // Double

    public static double intrestRate = 0.03;
    double balance;


    public BankAccount(String accountHolderName, double balance, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public double deposit(double amount) {
        double newbal = 0;
        System.out.println(accountHolderName + " deposited $" + (amount) + ". New Balance: $" + (newbal = balance + amount));
        balance = newbal;
        return newbal;
    }

    public double withdraw(double amount){
        double newbal = 0;
        System.out.println(accountHolderName + " withdrew $" + (amount) + ". New Balance: $" + (newbal = balance - amount));
        balance = newbal;
        return newbal;
    }

    public double calculateintrest(){
        double temp = 0;
        System.out.println(accountHolderName + "'s intrest: $" + (temp = balance * intrestRate));
        return temp;
    }

}

public class Main {
    public static void main(String[] args){

        double intrestPercentage = BankAccount.intrestRate * 100;


        System.out.println("Bank Name: " + BankAccount.bankName);
        System.out.println("Intrest Rate: " + intrestPercentage + "%");

        BankAccount bankAccount1 = new BankAccount("John Doe", 1000.0, 1);
        BankAccount bankAccount2 = new BankAccount("Jane Smith", 2500.0,2 );
        BankAccount bankAccount3 = new BankAccount("Bob", 500.0,3 );
        
        System.out.println("\nAccount Created: ACC00" + bankAccount1.accountNumber + " for " + bankAccount1.accountHolderName + " with initial balance: $" + bankAccount1.balance);
        System.out.println("Account Created: ACC00" + bankAccount2.accountNumber + " for " + bankAccount2.accountHolderName + " with initial balance: $" + bankAccount2.balance);
        System.out.println("Account Created: ACC00" + bankAccount3.accountNumber + " for " + bankAccount3.accountHolderName + " with initial balance: $" + bankAccount3.balance);

        System.out.println("\n- Account Operations -");
        bankAccount1.deposit(500);
        bankAccount2.withdraw(300);

        System.out.println("\n - Intrest Calculation -");
        bankAccount1.calculateintrest();
        bankAccount2.calculateintrest();
        bankAccount3.calculateintrest();

        System.out.println("\nTotal Accounts Created: " + bankAccount1.totalAccounts);
    }
}
