package JavaBase_oop3;

public class TestILock {
	public static void main(String[] args) {

		Door door =new ThiftProofDoorImpl();
		
		door.close();
		door.lockUp();
		door.openLock();
		door.open();
	}

}
