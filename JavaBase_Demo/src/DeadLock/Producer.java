package DeadLock;

public class Producer implements Runnable{

	private Resource resource;
	
	public Producer(Resource resource) {
		this.resource =resource;
	}
	
	public void run() {
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			resource.create();
		}
	}
}
