package JavaBase_Enumeration;

public enum Color implements Behavior {
	 
	RED("红色", 1), GREEN("绿色", 2), BLANK("白色", 3), YELLO("黄色", 4);

	private String name;
	private String index;
	
	private Color(String name,int index) {
		this.index =index();
		this.name =name();
	}

	public String getInfo() {
		return null;
	}

	public void print() {

		System.out.println(this.name() + this.index());
	}

	private String index() {
		return null;
	}

}
