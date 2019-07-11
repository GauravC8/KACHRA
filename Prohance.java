import java.awt.AWTException;
import java.awt.Robot;

public class test implements Runnable {
	public void run() {
		try {
			// moves mouse to the middle of the screen
			// new Robot().mouseMove((int)
			// Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 2, (int)
			// Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 2);
			for (int i = 0; i < 60; i++) {
				Thread.sleep(60000);
				new Robot().mouseMove((int) (Math.random() * 1024), (int) (Math.random() * 768));
			}
			// remember to use try-catch block (always, and remember to delete this)
		} catch (AWTException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t = new test();
		Thread th = new Thread(t);
		th.start();
	}
}