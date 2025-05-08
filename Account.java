public class Account{
    private double balance;

    public Account(double initiaBalance){
        if(initiaBalance < 0){
            throw new IllegalArgumentException("Số dư không thể âm");
        }
        this.balance = initiaBalance;
    }

    public double getBalance(){
        return balance;
    }

    protected boolean canWithdraw(double amount){
        return (balance - amount) >= 0;
    }

    protected void doWithdraw(double amount){
        balance -= amount;
    }

    public void withdraw(double amount){
        if(canWithdraw(amount)){
            doWithdraw(amount);
        }else{
            System.out.println("Rút tiền không đủ, số dư không đủ");
        }
    }
}