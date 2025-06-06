// InternationalCreditCard.java
public class InternationalCreditCard implements CreditCardPayment {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán thẻ quốc tế: " + amount);
    }
}
