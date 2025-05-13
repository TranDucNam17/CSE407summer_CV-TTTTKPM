public class Main {
    public static void main(String[] args) {
        AccountFactory factory = new SavingsAccountFactory();
        Account myAccount = factory.createAccount(500);

        System.out.println("Initial balance: $" + myAccount.getBalance());

        System.out.println("Trying to withdraw $300...");
        myAccount.withdraw(300);
        System.out.println("Balance after withdrawal: $" + myAccount.getBalance());

        System.out.println("Trying to withdraw another $300...");
        myAccount.withdraw(300);
        System.out.println("Final balance: $" + myAccount.getBalance());
    }
}
