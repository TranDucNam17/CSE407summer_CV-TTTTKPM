// LocalCreditCard.java
public class LocalCreditCard implements CreditCardPayment {
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán thẻ nội địa: " + amount);
    }
}
