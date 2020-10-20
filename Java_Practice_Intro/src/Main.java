import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Account [] a = new Account[6];
        Random r = new Random();
        for (int i = 0; i < 6; i++)
        {
            a[i] = new Account(i+1, "ACC" + (i+1), 10000 * r.nextDouble());
        }
        Branch [] b = new Branch[2];
        for (int i = 0; i < 2; i++) {
            b[i] = new Branch(i+1, "BR" + (i+1));
        }
        b[0].addAccount(a[0]); // add the Account to this Branch
        b[0].addAccount(a[1]); // add the Account to this Branch
        b[1].addAccount(a[2]); // add the Account to this Branch
        b[1].addAccount(a[3]); // add the Account to this Branch
        b[1].addAccount(a[4]); // add the Account to this Branch
        b[1].addAccount(a[5]); // add the Account to this Branch
        System.out.println(b[0].getBranchBalance()); // prints the total Balance of this Branch
        System.out.println(b[1].getBranchBalance()); // prints the total Balance of this Branch
        System.out.println(b[0].getMinBalanceAccount().getCustomer()); // prints the name of the Account with lowest Balance in this Branch
        System.out.println(b[1].getMinBalanceAccount().getCustomer()); // prints the name of the Account with lowest Balance in this Branch
        Branch.transferBalance(a[4], a[3], 100); // transfer 100 from balance of Account a[4] to Account a[3]
        Branch.printAllBranchesInfo(); // prints all branches info as follows (this is just a sample, you can't hardcode this output)
        /*Branch Id: 1, Branch Name: BR1
        Account Number: 1, Customer Name: ACC1, Balance: actual balance
        Account Number: 2, Customer Name: ACC2, Balance: actual balance
        Branch Id: 2, Branch Name: BR2
        Account Number: 3, Customer Name: ACC3, Balance: actual balance
        Account Number: 4, Customer Name: ACC4, Balance: actual balance
        Account Number: 5, Customer Name: ACC5, Balance: actual balance
        Account Number: 6, Customer Name: ACC6, Balance: actual balance*/
    }
}