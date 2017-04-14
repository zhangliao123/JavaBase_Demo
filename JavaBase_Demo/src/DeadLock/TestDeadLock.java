package DeadLock;

public class TestDeadLock {

	public static void main(String[] args) {

		Paper paper = new Paper();
		Pen pen = new Pen();
		WriteArticleRunnable writeArticleRunnable1 = new WriteArticleRunnable(paper,pen);
		WriteArticleRunnable writeArticleRunnable2 = new WriteArticleRunnable (paper,pen);
		Thread zhangsan = new Thread (writeArticleRunnable1,"zhangsan");
		Thread lisi = new Thread(writeArticleRunnable2,"lisi");
		zhangsan .start();
		lisi.start();
	}
}
