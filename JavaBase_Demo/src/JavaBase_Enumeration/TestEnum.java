package JavaBase_Enumeration;

public class TestEnum {

	public void main(String[] args){
		for (EnumTest e : EnumTest.values()) {
			System.out.println(e.toString());
		}
		
		System.out.println("我是分隔符———————————————————");
		
		EnumTest test = EnumTest.THU;
		switch (test) {
		case MON:
			System.out.println("我是星期一");
			break;

		case TUE:
			System.out.println("我是星期二");
			break;
			
		case THU:
			System.out.println("我是星期四");
			break;
			
		//...
			
		default:
			System.out.println(test);
			break;
		}
	}
}
