// Client.java
public class Client {
    private final PaymentFactory factory;

    public Client(PaymentFactory factory) {
        this.factory = factory;
    }

    public void processPayments(double amount) {
        CashPayment cash = factory.createCashPayment();
        cash.pay(amount);

        CreditCardPayment credit = factory.createCreditCardPayment();
        credit.pay(amount);
    }

    public static void main(String[] args) {
        System.out.println("=== LOCAL PAYMENT ===");
        Client localClient = new Client(new LocalPaymentFactory());
        localClient.processPayments(500.0);

        System.out.println("\n=== INTERNATIONAL PAYMENT ===");
        Client internationalClient = new Client(new InternationalPaymentFactory());
        internationalClient.processPayments(1500.0);
    }
}
