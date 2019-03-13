
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable rb1 = new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 1; i <= 10000; i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						System.err.println(Thread.currentThread().getName() + " is woke up!!");
						Thread.currentThread().stop();
//						return;
					}
					System.out.println(Thread.currentThread().getName() + ":" + i);
				}
			}
		};
		Thread th1 = new Thread(rb1);
		th1.setName("Thread1");
		th1.setDaemon(true);
		th1.start();
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		// TODO Auto-generated catch block

//		Runnable rb2 = new Runnable() {
//
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				try {
//					Thread.sleep(5000);
//					th1.interrupt();
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//
//			}
//		};
//		Thread th2 = new Thread(rb2);
//		th2.setName("Thread2");
//		th2.start();
	}

}
