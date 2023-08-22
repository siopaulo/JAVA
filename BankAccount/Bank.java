package BankAccount;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<BankAccount> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public List<BankAccount> createBankAccount(String accountNumber, String accountHolderName, double balance,
            String accountType) {
        if (accountType.equals("saving")) {
            accounts.add(new SavingsAccount(accountNumber, accountHolderName, balance));
            return accounts;
        } else if (accountType.equals("checking")) {
            accounts.add(new CheckingAccount(accountNumber, accountHolderName, balance));
            return accounts;
        } else {
            System.out.println("You choose wrong account type.");
            return null;
        }
    }

    public BankAccount findBankAccount(String accountNumber) {
        for (BankAccount bankAccount : accounts) {
            if (bankAccount.getAccountNumber().equals(accountNumber))
                return bankAccount;
            else
                System.out.println("There is no account with that number.");
        }
        return null;
    }

    public Boolean accountTransfer(BankAccount fromAccount, BankAccount toAccount, double amount) {
        if (fromAccount.balance >= amount) {
            fromAccount.balance -= amount;
            toAccount.balance += amount;
            return true;
        } else {
            System.out.println("There is not enought money to trasnfer.");
            return false;
        }
    }
}
