package JavaBase_Thread;

public class TestThread2 {

	public static void main(String[] args) {

		myThread1 myThread1 = new myThread1("A");
		myThread1 myThread2 = new myThread1("B");
		myThread1.run();
		myThread2.run();
	}

}
