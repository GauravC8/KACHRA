package Threading;

public class Customer implements Runnable {
    @Override
    public void run() {
    	Bank2 bank2 = Bank2.getInstance();
        BankAccount account = bank2.getAccount(123456);
    	/*synchronized (account) {
            account.deposit(100);
            account.withdraw(200);
		}*/
        account.deposit(100);
        account.withdraw(200);
    }
}