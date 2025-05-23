

public class SavingsAccount extends Account {
    public void safeWithdraw(double amount){
        if(balance - amount >= 100){
            withdraw(amount);
        }else{
            System.out.println("Khong the rut: " + amount + ": so du se duoi 100.");
        }
    }
}
