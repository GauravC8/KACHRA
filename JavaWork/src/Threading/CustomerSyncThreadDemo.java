package Threading;

class Customers {
	int amount = 0;
	int flag = 0;

	public synchronized int withdraw(int amount) {
		System.out.println(Thread.currentThread().getName() + " is going to withdraw");

		if (flag == 0) {
			try {
				System.out.println("waiting....");
				wait();
			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed");
		return amount;
	}

	public synchronized void deposit(int amount) {
		System.out.println(Thread.currentThread().getName() + " is going to  deposit");
		this.amount += amount;
		System.out.println("deposit completed");
		notifyAll();
		flag = 1;
	}
}

public class CustomerSyncThreadDemo {
	public static void main(String[] args) {
		final Customers c = new Customers();

		Thread t1 = new Thread() {
			@Override
			public void run() {
				c.withdraw(5000);
				System.out.println("After withdraw amount is " + c.amount);
			}
		};

		Thread t2 = new Thread() {
			@Override
			public void run() {
				c.deposit(9000);
				System.out.println("After deposit amount is " + c.amount);
			}
		};

		t1.setName("Dinesh");
		t2.setName("Sweety");
		t1.start();
		t2.start();

	}
}

/*
 * Dinesh is going to withdraw waiting.... Sweety is going to deposit deposit
 * completed After deposit amount is 9000 withdraw completed After withdraw
 * amount is 4000
 */
