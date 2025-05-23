public interface AccountBuilder {
    void reset();
    void setInitialBalance(double amount);
    void withdraw(double amount);
    Account getResult();
}
