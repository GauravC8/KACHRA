package Threading;

//synchronized method
class First {
	// synchronized public void display(String msg) {
	public void display(String msg) {
		System.out.print("[  " + msg);
		try {
			Thread.sleep(1000);

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println(" ]");
	}
}

class Second extends Thread {
	String msg;
	First fobj;

	public Second(First fobj, String string) {
		this.fobj = fobj;
		this.msg = string;
		start();
	}

	@Override
	public void run() {
		// synchronized block using keyword synchronized
		synchronized (fobj) {
			fobj.display(msg);
		}

	}

}

public class ThreadSync {
	public static void main(String[] args) {
		First fobj = new First();
		Second s1 = new Second(fobj, "welcome");
		Second s2 = new Second(fobj, "Thread");
		Second s3 = new Second(fobj, "programming");

	}
}
