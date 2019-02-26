package Threading;

public class InterThreadDemo {
	public static void main(String[] args) {
		final Customer2 c = new Customer2();
		new Thread() {
			public void run() {
				c.withdraw(15000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();
		new Thread() {
			public void run() {
				c.deposit(10000);
			}
		}.start();
	}
}

class Customer2 {
	int amount = 10000;

	synchronized void withdraw(Integer amount) {
		System.out.println("Available Balance " + this.amount);
		System.out.println("Going to withdraw" + amount);
		if (this.amount < amount) {
			System.out.println("Insufficient Balance waiting for deposit");
			try {
				wait();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		this.amount -= amount;
		System.out.println("Detected ammount " + amount);
		System.out.println("Balance ammount " + this.amount);
	}

	synchronized void deposit(int amount) {
		System.out.println("Going to deposit " + amount);

		this.amount += amount;
		System.out.println("Avai;abe balance :" + this.amount);
		System.out.println("Transaction completed \n");
		notify();
	}
}