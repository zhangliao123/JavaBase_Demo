package JavaBase_oop3;

public class ThiftProofDoorImpl extends Door implements ILock {

	public void close() {
		System.out.println("轻轻关门，门关上了！");
	};
	
	public void lockUp() {
		System.out.println("插进钥匙，向左旋转钥匙三圈，门锁上了，拔出钥匙！");
	}

	public void openLock() {
		System.out.println("插进钥匙，向右旋转三圈，门锁开了，拔出钥匙！");
	}

	public void open() {
		System.out.println("轻轻拉门，门打开了！");
	};

}
