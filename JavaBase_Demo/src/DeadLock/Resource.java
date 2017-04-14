package DeadLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Resource {

	private int number = 0;        //资源序号
	private boolean flag = false;      //资源标记
	//private final Lock lock = new ReentrantLock();
	
	//生产资源
	public synchronized void create(){
		//lock.lock();
		if (flag) {
			//判断是否已经生产，如果生产，请等待
			try {
				wait();   //已生产，则等待
			} catch (Exception e) {
				e.printStackTrace();
			} /*finally {
				//lock.unlock();
			}*/
		}
		number++;
		System.out.println(Thread.currentThread().getName() + "生产者——————" + number );
		flag = true;
		notifyAll();
	}
	
	//判断是否已经销毁
	public synchronized void destroy(){
		//lock.lock();
		if (!flag) {
			try {
				wait();
			} catch (Exception e) {
				e.printStackTrace();
			} /*finally {
				//lock.unlock();
			}*/
		}
		number++;
		System.out.println(Thread.currentThread().getName() + "消费者******" + number);
	} 
}
