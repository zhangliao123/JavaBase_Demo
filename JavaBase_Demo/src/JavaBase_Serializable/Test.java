package JavaBase_Serializable;

public class Test {

	public static void main(String[] args) {

		Test test =new Test();
		String valid1 =test.evaluate("tiger","tiger");
		Integer valid2 =test.evaluate(new Integer(300),new Integer(350));
		System.out.println(valid1);
		System.out.println(valid2);
	}

	public <T> T evaluate(T a, T b){

		if (a.equals(b)) {
			return a;
		}else{
			return null;
		}
	}
}
