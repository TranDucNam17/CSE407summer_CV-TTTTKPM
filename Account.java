

public class Account {
    protected double balance;

    protected void setInitialBalance(double amount){
        this.balance = amount;
    }

    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
        }
    }

    public double getBalance(){
        return balance;
    }
}
