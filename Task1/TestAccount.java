public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account("A001", "Alex", 5000);
        Account acc2 = new Account("A002", "Sam", 4000);

        // Display balances
        System.out.println("Account 1 balance: " + acc1.getBalance());
        System.out.println("Account 2 balance: " + acc2.getBalance());

        // Transfer $1000 from acc1 to acc2
        acc1.transferTo(acc2, 1000);

        // Display balances again
        System.out.println("After transfer:");
        System.out.println("Account 1 balance: " + acc1.getBalance());
        System.out.println("Account 2 balance: " + acc2.getBalance());
    }
}
