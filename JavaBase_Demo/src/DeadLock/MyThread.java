package DeadLock;

public class MyThread extends Thread{
	private Test test;
	private String name;

    public MyThread(Test test,String name) {
        super(name);
        this.test = test;
    }

    @Override
    public void run() {
        try {
            test.insert(Thread.currentThread());
        } catch (InterruptedException e) {
            System.out.println("time=" + System.currentTimeMillis() + " ,线程 " + Thread.currentThread().getName() + "被中断...");
        }
    }
}
