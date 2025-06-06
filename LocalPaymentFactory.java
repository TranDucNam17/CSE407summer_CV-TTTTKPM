// LocalPaymentFactory.java
public class LocalPaymentFactory implements PaymentFactory {
    @Override
    public CashPayment createCashPayment() {
        return new LocalCash();
    }

    @Override
    public CreditCardPayment createCreditCardPayment() {
        return new LocalCreditCard();
    }
}
