public class Client {
    public static void main(String[] args) {
        // Sử dụng chiến lược rút tiền bình thường
        WithdrawStrategy normal = new NormalWithdraw();
        Account acc1 = new SavingsAccount(200, normal);
        acc1.showType();
        acc1.withdraw(150);
        System.out.println("Remaining balance: " + acc1.getBalance());

        System.out.println("------");

        // Sử dụng chiến lược rút tiền giới hạn
        WithdrawStrategy limited = new LimitedWithdraw();
        Account acc2 = new SavingsAccount(300, limited);
        acc2.showType();
        acc2.withdraw(120); // Vượt quá giới hạn
        acc2.withdraw(80);  // Hợp lệ
        System.out.println("Remaining balance: " + acc2.getBalance());
    }
}
