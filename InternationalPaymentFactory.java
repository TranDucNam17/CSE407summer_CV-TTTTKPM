// InternationalPaymentFactory.java
public class InternationalPaymentFactory implements PaymentFactory {
    @Override
    public CashPayment createCashPayment() {
        return new InternationalCash();
    }

    @Override
    public CreditCardPayment createCreditCardPayment() {
        return new InternationalCreditCard();
    }
}
