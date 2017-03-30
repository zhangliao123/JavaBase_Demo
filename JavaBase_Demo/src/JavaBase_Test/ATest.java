package JavaBase_Test;

public class ATest {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B();
		B b = new B();
		C c = new C();
		D d = new D();

		System.out.println(a1.show(a1));
		/*System.out.println(a1.show(a2));
		System.out.println(a1.show(b));
		System.out.println(a1.show(c));
		System.out.println(a1.show(d));*/
		
		
		System.out.println(a1.show(d));
		System.out.println(a2.show(b));	//多态，父类使用子类的方法，第一个方法父类不可见，第二个方法为重写的方法
		System.out.println(a2.show(c)); //多态，父类使用子类的方法，第一个方法父类不可见，第二个方法为重写的方法
		System.out.println(a2.show(d));
		System.out.println(b.show(b));
		System.out.println(b.show(c)); 	//抽象类不可实例化，查看父类B类
		System.out.println(b.show(d));  //继承，继承自B类,B类继承自A类
	}
}
