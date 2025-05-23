public class Main {
    public static void main(String[] args) {
        AccountBuilder builder = new SavingsAccountBuilder();
        AccountDirector director = new AccountDirector(builder);

        Account acc = director.createSavingsAccount(500, 300, 300);

        System.out.println("Số dư còn lại: " + acc.getBalance());
    }
}
