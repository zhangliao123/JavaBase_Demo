package JavaBase_Thread;

public class MyRunnablexx implements Runnable {

	public void run() {

		System.out.println("當前線程名稱：" + Thread.currentThread().getName());
		
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "------" + i);
			//让其进入后台
			/*if (i == 50) {
				Thread.currentThread().setDaemon(true);
			}*/
		}
	}
}