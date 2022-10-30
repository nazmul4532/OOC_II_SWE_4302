package Task4;

public class Account {
    private String accountId;
    private long balance;
    public String getaccountId() {
        return accountId;
    }
    public long getbalance() {
        return balance;
    }
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    public void setBalance(long balance) {
        this.balance = balance;
    }
    public long getBalance(){
        return this.balance;
    }
    public void credit(long amount){
        this.balance = balance + amount;
    }
    public void debit(long amount){
        this.balance = balance - amount;
    }
    public Account(String accountId, long balance){
        this.accountId = accountId;
        this.balance = balance;
    }

}
