package Thread;

public class MyThread extends Thread {

	public void run() {

		for (int i = 1; i <= 100; i++) {
			System.out.println("MyThread = " + i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

	public void m1() {

		for (int i = 101; i <= 200; i++) {
			System.out.println("M1 Logic = " + i);
			try {
				Thread.sleep(75);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}
