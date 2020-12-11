/*
@author: Md. Asif Haider (1805112)
Date: 11/12/2020
*/

// custom exception checking the negative amount input
class InvalidAmountException extends Exception {
    @Override
    public String toString() {
        return "The given amount can't be negative.\n";
    }
}

// custom exception checking the negative total balance
class InvalidBalanceException extends Exception{
    @Override
    public String toString() {
        return "The account balance can't be less than zero.\n";
    }
}

public class Account {
    private double balance = 0;

    public Account(double balance) throws InvalidBalanceException {
        if (balance < 0){
            throw new InvalidBalanceException();
        }
        else {
            this.balance = balance;
            System.out.println("Account creation successful with balance: " + balance + " taka!\n");
        }
    }

    // subtracts the amount from the remaining balance
    public void debit (double amount) throws InvalidAmountException, InvalidBalanceException {
        if (amount < 0){
            throw new InvalidAmountException();
        }
        else if ((this.balance-amount)<0) {
            throw new InvalidBalanceException();
        }
        else
            this.balance -= amount;
    }

    // adds the amount to the remaining balance
    public void credit (double amount) throws InvalidAmountException{
        if (amount < 0){
            throw new InvalidAmountException();
        }
        else
            this.balance += amount;
    }

    public double getBalance() {
        return this.balance;
    }
}
