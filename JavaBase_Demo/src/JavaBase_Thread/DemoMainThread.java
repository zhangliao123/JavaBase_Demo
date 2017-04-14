package JavaBase_Thread;

public class DemoMainThread {

	public void main(String[] args) throws InterruptedException{
		
		Thread thread =Thread.currentThread();
		System.out.println("thread.getName():"+ thread.getName());
		System.out.println("thread.getId():" + thread.getId());
		System.out.println("thread.getPriority()" + thread.getPriority());
		System.out.println("thread.MAX_PRIORITY:" + thread.MAX_PRIORITY);
		System.out.println("thread.MIN_PRIORITY:" + thread.MIN_PRIORITY);
		System.out.println("thread.NORM_PRIORITY:" + thread.NORM_PRIORITY);
		System.out.println("thread.activeCount():" + thread.activeCount());
		System.out.println("thread.isAlive()" + thread.isAlive());
		System.out.println("thread.isDaemon()" + thread.isDaemon());
		System.out.println("thread.isInterrupted()" + thread.isInterrupted());
		
		System.out.println("將休眠5秒");
		long start = System.currentTimeMillis();
		System.out.println("當前時間為：" + start);
		Thread.sleep(5000);
		long end = System.currentTimeMillis();
		System.out.println("當前時間為：" + end);
		System.out.println("總計時間：" + (end - start));
		
		System.out.println("即將調用Thread.yield()");
		Thread.yield();
		System.out.println("調用Thread.yield()結束");
		}

	
}
