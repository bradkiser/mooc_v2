package weekFour.Exercise072;

public class Account {
    private String accountName;
    private double balance;

    public Account(String accountName, double startingBalance) {
        this.accountName = accountName;
        this.balance = startingBalance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public String toString() {
        return this.accountName + " account balance is now: " + this.balance;
    }

    public static void transfer(Account from, Account to, double amount) {
        from.withdraw(amount);
        to.deposit(amount);
    }

    public static void main(String[] args) {
        // Phase 1
        // Account bartosAccount = new Account("Barto's account", 100.00);
        // System.out.println("Initial state");
        // System.out.println(bartosAccount);
        // bartosAccount.deposit(20.00);
        // System.out.println(bartosAccount);

        // Phase II
        // Account mattsAccount = new Account("Matt's Account", 1000.00);
        // Account myAccount = new Account("My account", 0.00);
        // mattsAccount.withdrawl(100.00);
        // myAccount.deposit(100.00);
        // System.out.println(mattsAccount);
        // System.out.println(myAccount);

        // Phase III
        Account a = new Account("A", 100.00);
        Account b = new Account("B", 0.00);
        Account c = new Account("C", 0.00);
        transfer(a, b, 50.00);
        transfer(b, c, 25.00);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
