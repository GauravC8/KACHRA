package Threading;

import java.util.HashMap;

public class Bank2 {
private static Bank2 instance = new Bank2();
private HashMap<Integer, BankAccount> accountNumberVsAccount;
    private Bank2() {
    accountNumberVsAccount = new HashMap<Integer, BankAccount>();
    accountNumberVsAccount.put(123456, new BankAccount(123456));
    }
    public static Bank2 getInstance(){
        return instance;
    }
    public BankAccount getAccount(Integer accountNumber) {
        return accountNumberVsAccount.get(accountNumber);
    }
}