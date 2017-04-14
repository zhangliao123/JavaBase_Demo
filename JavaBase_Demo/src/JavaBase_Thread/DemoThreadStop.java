package JavaBase_Thread;

public class DemoThreadStop {

	public static void main(String[] args) {

		ThreadStop threadStop = new ThreadStop();
		threadStop.setDaemon(true);
		System.out.println("启动线程...");
		threadStop.start();

		// threadStop.sleep(2000,200000);
		System.out.println("即将停止线程...");
		threadStop.setFlag(false);
		System.out.println("线程停止！");

	}
}
