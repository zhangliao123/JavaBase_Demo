package JavaBase_Thread;

public class myThread1 implements Runnable {

	private String name;
	public myThread1(String name){
		this.name = name;
	}
	
	public void run() {

		for (int i = 0; i < 100; i++) {
			System.out.println(name + "运行" + i);
		}
		
		try {
			Thread.sleep((int) Math.random() * 10);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
