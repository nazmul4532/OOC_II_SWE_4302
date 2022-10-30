package Task4;

import java.util.HashMap;
import java.util.Map;

public class AccountDB {
    private Map<String,Account> accounts;
    public void transfer(String accountIDSend,String accountIDReceive, long amount){
        accounts.get(accountIDSend).setBalance(accounts.get(accountIDSend).getBalance() - amount);
        accounts.get(accountIDReceive).setBalance(accounts.get(accountIDReceive).getBalance() + amount);
    }
    public void updateAccount(Account account ,long newBalance){
        accounts.get(account).setBalance(newBalance);
    }
    public Account findAccountForUser(String id){
        return accounts.get(id);
    }
    public void addAccount(String accountID , Account account){
        accounts.put(accountID, account);
    }
    public AccountDB()
    {
        this.accounts = new HashMap<String, Account>();
    }
}
