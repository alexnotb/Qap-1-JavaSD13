public class Account {
    // Fields
    private String id;      // Account ID
    private String name;    // Account holder's name
    private int balance = 0; // Account balance, default 0

    // Constructor with id and name
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Constructor with id, name, and initial balance
    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getter for ID
    public String getID() {
        return id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for balance
    public int getBalance() {
        return balance;
    }

    // Add amount to balance and return new balance
    public int credit(int amount) {
        balance += amount;
        return balance;
    }

    // Subtract amount from balance if possible, else print error
    public int debit(int amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // Transfer amount to another account if possible, else print error
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    // Return string representation of the account
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}