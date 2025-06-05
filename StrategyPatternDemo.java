public class StrategyPatternDemo {
    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount(2000);

        // Dùng chiến lược rút tiền thông thường
        myAccount.setStrategy(new NormalWithdrawStrategy());
        myAccount.withdraw(500);   // OK
        myAccount.withdraw(1800);  // Không đủ tiền

        // Dùng chiến lược giới hạn rút tiền
        myAccount.setStrategy(new LimitWithdrawStrategy());
        myAccount.withdraw(1200);  // Vượt giới hạn
        myAccount.withdraw(800);   // OK
    }
}
