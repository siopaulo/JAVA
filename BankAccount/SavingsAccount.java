package BankAccount;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public Boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            System.out.println("You don't have enought money in your account to be withdrawn!");
            return false;
        }
    }
}
