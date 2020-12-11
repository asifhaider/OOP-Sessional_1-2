/*
@author: Md. Asif Haider (1805112)
Date: 11/12/2020
*/

public class Main {
    public static void main(String[] args) {

        double [] balances = {5000, -1000, 2000};
        Account [] accounts = new Account[3];

        // the 2nd account creation will raise an InvalidBalanceException
        for (int i=0; i<balances.length; i++){
            try {
                accounts[i] = new Account(balances[i]);
            } catch (InvalidBalanceException e) {
                System.out.println(e);
            }
        }

        // As the 2nd account was not created,
        // accessing its initial balance will raise a NullPointerException
        for (int i=0; i<balances.length; i++){
            try{
                System.out.println("Initial Balance of account " +
                        (i+1) + ": " + accounts[i].getBalance() + " taka\n");
            } catch (NullPointerException e){
                System.out.println("This account couldn't be created!\n");
            }
        }

        // checking debit operations
        double [] debit_amounts = {1000, -1500, 3000, 6000};
        for (int i=0; i<debit_amounts.length; i++){
            try {
                accounts[0].debit(debit_amounts[i]);
                System.out.println(debit_amounts[i] + " taka debit successful!\n");
            } catch (InvalidAmountException e) {
                System.out.println(e);
            } catch (InvalidBalanceException e) {
                System.out.println(e);
            }

            try{
                accounts[2].debit(debit_amounts[i]);
                System.out.println(debit_amounts[i] + " taka debit successful!\n");
            } catch (InvalidAmountException e) {
                System.out.println(e);
            } catch (InvalidBalanceException e) {
                System.out.println(e);
            }
        }

        System.out.println("Balance after debit: ");
        System.out.println("Account 1: " + accounts[0].getBalance() + " taka");
        System.out.println("Account 3: " + accounts[2].getBalance() + " taka\n");

        // checking credit operations
        double [] credit_amounts = {-3000, 2000};
        for (int i=0; i<credit_amounts.length; i++){
            try{
                accounts[0].credit(credit_amounts[i]);
                System.out.println(credit_amounts[i] + " taka credit successful!\n");
            } catch (InvalidAmountException e) {
                System.out.println(e);
            }

            try{
                accounts[2].credit(credit_amounts[i]);
                System.out.println(credit_amounts[i] + " taka credit successful!\n");
            } catch (InvalidAmountException e) {
                System.out.println(e);
            }
        }

        System.out.println("Balance after credit: ");
        System.out.println("Account 1: " + accounts[0].getBalance() + " taka");
        System.out.println("Account 3: " + accounts[2].getBalance() + " taka\n");
    }
}