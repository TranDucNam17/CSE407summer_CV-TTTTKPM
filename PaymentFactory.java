// PaymentFactory.java
public interface PaymentFactory {
    CashPayment createCashPayment();
    CreditCardPayment createCreditCardPayment();
}
