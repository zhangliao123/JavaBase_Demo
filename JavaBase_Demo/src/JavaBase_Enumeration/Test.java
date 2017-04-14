package JavaBase_Enumeration;

public class Test {

	public static void main(String[] args) {

		for (EnumTest e : EnumTest.values()) {
			System.out.print(e.toString() + "\t");
		}
		
		System.out.println("\n");
		System.out.println("我是分隔符——————————");
		
		EnumTest enumTest =EnumTest.THU;
		int enumTestNum = enumTest.compareTo(EnumTest.SAT);
		
		if (enumTestNum < 0) {
			System.out.println(enumTest.getName() + "在前面");
		}else if (enumTestNum > 0) {
			System.out.println(enumTest.getName() + "在后面");
		}else {
			System.out.println(enumTest.getName() + "在同一位置");
		}
		
		
		/*switch (enumTest.compareTo(EnumTest.SAT)) {
		case -1:
			System.out.println("THU在SAT之前");
			break;

		case 1:
			System.out.println("THU在SAT之后");
			break;	
			
		default:
			System.out.println("THU在SAT同一位置");
			break;
		}*/
		
		System.out.println("getDeclaringClass():" + enumTest.getDeclaringClass().getName());
		
		System.out.println("name():" + enumTest.name());
		
		System.out.println("toString():" + enumTest.toString());
		
		System.out.println("ordinal():" + enumTest.ordinal());
	}

}
