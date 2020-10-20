public class Branch {

    private int id;
    private String name;
    private Account []  accounts;
    private int accountCount;
    // add your code here
    // there can be at most 20 branches

    public static Branch[] branches = new Branch [20];
    public static int branchCount;

    // you are not allowed to write any other constructor
    public Branch(int id, String name) {
        this.id = id;
        this.name = name;
        this.accounts = new Account[10];
        addBranch (this);
    }

    public static void addBranch (Branch b)
    {
        branches[branchCount++] = b;
    }

    public void addAccount(Account a) {
        accounts[accountCount++] = a;
    }

    public double getBranchBalance(){
        double total_balance = 0;
        for (int i=0; i<accountCount; i++)
        {
            total_balance += accounts[i].getBalance();
        }
        return total_balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getMinBalanceAccount(){
        double min_balance = accounts[0].getBalance();
        int c = 0;
        for (int i=1; i<accountCount; i++)
        {
            if (accounts[i].getBalance() < min_balance)
            {
                min_balance = accounts[i].getBalance();
                c = i;
            }
        }
        return accounts[c];
    }

    public static void transferBalance (Account A, Account B, double amount)
    {
        A.setBalance(A.getBalance() - amount );
        B.setBalance(B.getBalance() + amount);
    }

    public static void printAllBranchesInfo()
    {
        for (int i =0; i< branchCount; i++)
        {
            Branch b = branches [i];
            System.out.println("Branch Id: " + b.getId() + " Branch Name: " + b.getName());
            for (int j = 0; j<b.accountCount; j++)
            {
                Account a = b.accounts[j];
                System.out.println("Account Number: " + a.getNumber() + " Customer Name: " + a.getCustomer() + " Balance: " + a.getBalance());
            }
        }

    }

    // add your code here

}