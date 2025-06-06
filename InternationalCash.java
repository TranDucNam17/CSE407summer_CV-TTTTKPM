// InternationalCash.java
public class InternationalCash implements CashPayment {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán tiền mặt quốc tế: " + amount);
    }
}
