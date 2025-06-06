// LocalCash.java
public class LocalCash implements CashPayment {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán tiền mặt nội địa: " + amount);
    }
}
