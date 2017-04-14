package JavaBase_Thread;

public class TestThread1 {

	public static void main(String[] args) {

		myThread thread1 = new myThread("A");
		myThread thread2 = new myThread("B");
		thread1.start();
		thread2.start();
	}
}
