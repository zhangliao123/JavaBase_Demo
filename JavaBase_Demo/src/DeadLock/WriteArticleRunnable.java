package DeadLock;

public class WriteArticleRunnable implements Runnable {

	private Paper paper;
	private Pen pen;
	private boolean isRunning = true;
	private int count = 20;            //循环次数
	
	public WriteArticleRunnable(Paper paper,Pen pen){
		super();
		this.paper =paper;
		this.pen =pen;
	}
	
	public void run() {

		while (isRunning) {
			
			//判断纸资源是否被占有
			if (!paper.getIsPrivated()) {
				paper.setIsPrivated(true);
				paper.setOwner(Thread.currentThread().getName());
			}
			
			//判断笔资源是否被占有
			if (!pen.getIsPrivated()) {
				pen.setIsPrivated(true);
				pen.setOwner(Thread.currentThread().getName());
			}
			
			//判断资源被占有的占有者
			Boolean getPaper =paper.getOwner().equals(Thread.currentThread().getName());
			Boolean getPen =pen.getOwner().equals(Thread.currentThread().getName());
			
			//判断资源占有者谁可以进行书写
			if (getPaper && getPen) {
				System.out.println(Thread.currentThread().getName() + "我得到了paper和pen，我可以进行写作了！");
				System.out.println(Thread.currentThread().getName() + "我书写完毕，将释放资源");
				System.out.println("程序正常退出");
				paper.setIsPrivated(false);;
				pen.setIsPrivated(false);
				this.isRunning = false;
				
			} else if (getPaper && !getPen) {
				System.out.println(Thread.currentThread().getName() + "我得到了纸，但是缺少笔，我无法进行写作");
				System.out.println(Thread.currentThread().getName() + "我要等待资源！");
				--count;
				if (count < 0) {
					System.out.println("i == :" + count);
					System.out.println(Thread.currentThread().getName() + "我检测到了死锁!");
					System.out.println(Thread.currentThread().getName() + "我将释放资源，让别人进行书写！");
					paper.setIsPrivated(false);
					Thread.currentThread().setPriority(1);					
				}
			}else if (!getPaper && getPen) {
				System.out.println(Thread.currentThread().getName() + "我得到了笔，但是缺少纸，我无法进行写作");
				System.out.println(Thread.currentThread().getName() + "我要等待资源！");
				--count;
				if (count < 0) {
					System.out.println("i == :" + count);
					System.out.println(Thread.currentThread().getName() + "我检测到了死锁!");
					System.out.println(Thread.currentThread().getName() + "我将释放资源，让别人进行书写！");
					pen.setIsPrivated(false);
				}
			}else {
				System.out.println(Thread.currentThread().getName() + "我什么资源都没有得到！");
				System.out.println("程序正常退出");
			}
		}
	}
	public void stop(){
		this.isRunning = false;
	}
}
