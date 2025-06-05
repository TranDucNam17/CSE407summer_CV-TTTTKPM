public class Main {
    public static void main(String[] args) {
        BankMediator mediator = new BankMediator();

        Account savings = new SavingsAccount(mediator, 1000);
        Account checking = new CheckingAccount(mediator, 500);

        mediator.registerSavings(savings);
        mediator.registerChecking(checking);

        savings.withdraw(200);
        checking.withdraw(100);
        savings.withdraw(1000); // thử rút vượt quá số dư
    }
}
