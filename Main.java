public class Main {
    public static void main(String[] args) {
        AccountFactory factory = new SavingsAccountFactory();
        Client client = new Client(factory, 1000.0);

        client.showBalance();
        client.makeWithdrawal(200);
        client.makeWithdrawal(900);  // thử rút quá số dư
        client.showBalance();
    }
}
