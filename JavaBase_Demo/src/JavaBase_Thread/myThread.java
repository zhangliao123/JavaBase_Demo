package JavaBase_Thread;

public class myThread extends Thread{

	private String name;
	public myThread(String name){
		this.name = name;
	}
	
	@Override
	public void run() {

		for (int i = 0; i < 30; i++) {
			System.out.println(name + "运行：" + i);
		}
		try {
			sleep(MIN_PRIORITY);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
