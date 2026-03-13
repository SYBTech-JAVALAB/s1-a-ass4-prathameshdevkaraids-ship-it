abstract class BankAccount {

    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (balance - amount >= 1000) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Minimum balance ₹1000 required");
        }
    }
}

class CurrentAccount extends BankAccount {

    CurrentAccount(double balance) {
        super(balance);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (balance - amount >= -5000) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Overdraft limit ₹5000 exceeded");
        }
    }
}

public class BankDemo {

    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount(5000);
        CurrentAccount c = new CurrentAccount(2000);

        s.deposit(1000);
        s.withdraw(4500);
        s.displayBalance();

        c.deposit(500);
        c.withdraw(6000);
        c.displayBalance();
    }
}
