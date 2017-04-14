package JavaBase_Thread;

import lombok.Getter;
import lombok.Setter;

public class ThreadStop extends Thread{

	@Getter@Setter
	private boolean flag = true;

	@Override
	public void run() {
		int i=0;
		while (flag) {
			++i;
			System.out.println("****"+"---"+i);
		}
	}
}
