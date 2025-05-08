public class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 100.0;

    public SavingsAccount(double initiaBalance){
        super(initiaBalance);
    }

    @Override
    public void withdraw(double amount){
        if(getBalance() - amount >= MIN_BALANCE){
            super.withdraw(amount);
        }else{
            System.out.println("Rút tiền thất bại, số dư sau rút phải lớn hơn hoặc bằng " + MIN_BALANCE);
        }
    }
}
