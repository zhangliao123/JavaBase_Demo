package DeadLock;

public class Consumer implements Runnable{

	private Resource resource;
	
	public Consumer (Resource resource){
		this.resource =resource;
	}
	
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			resource.destroy();
		}
	}
}
