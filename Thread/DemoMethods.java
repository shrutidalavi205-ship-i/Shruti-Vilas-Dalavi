package Thread;

public class DemoMethods extends Thread {

//	 1. Start and Run Method
//		@Override
//		public void run() {
//			System.out.println("Thread Class is Running");
//		}

//	     2.Sleep Method

//		@Override
//		public void run() {
//			for (int i = 1; i <= 10; i++) {
//				System.out.println("Sleep Method = " + i);
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		}

//		3.Join Method

//		@Override
//		public void run() {
//			for (int i = 1; i <= 10; i++) {
//				System.out.println("Demo");
//			}
//		}

//		4. GetName And SetName Method

//		@Override
//		public void run() {
//			System.out.println(Thread.currentThread().getName());
//		}

//		5.SetPriority and GetPriority Method

//		@Override
//		public void run() {
//			System.out.println(getPriority());
//		}

//		6.IsAlive Method

//		@Override
//		public void run() {
//			System.out.println("IsAlive Method");
//		}

//		7.Yield Method

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("Yield Method = " + i);
		}
	}
}
