public class Account {
    public Integer accountNumber;
    public Double balance;

    public Account(Integer accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }



    public Double showBalance() {
        return balance;
    }
}
