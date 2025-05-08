public class Main {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(500.0);

        System.out.println("Số dư ban đầu: " + account.getBalance());

        System.out.println("Đang thử rút 300... vui lòng đợi");
        account.withdraw(300.0);
        System.out.println("Số dư sau khi rút: " + account.getBalance());

        System.out.println("Thử rút thêm 300.. vui lòng đợi");
        account.withdraw(300.0);
        System.out.println("Số dư cuối cùng: " + account.getBalance());
    }
}
