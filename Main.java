class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;


    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    
    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    double checkBalance() {
        return balance;
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        int accountNumber = 1234;
        String accountHolderName = "Yuthikhaa";
        double balance = 1000.0;

        BankAccount account = new BankAccount(accountNumber, accountHolderName, balance);

        double depositAmount = 500.0;
        account.deposit(depositAmount);

        double withdrawAmount = 200.0;
        account.withdraw(withdrawAmount);

        System.out.println("Final Account Details:");
        account.displayAccount();

    }
}