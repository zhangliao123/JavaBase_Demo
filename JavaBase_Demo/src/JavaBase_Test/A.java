package JavaBase_Test;

class A { 
	public String show(D test) {
		return ("A and D");
	}
	public String show(A test) {
		return ("A and A");
	}
}
class B extends A {					//继承A类，实现A类中的方法
	public String show(B test) {	//B类自有的方法
		return ("B and B");
	}
	public String show(A test) {	//重写A类中的方法
		return ("B and A");
	}
}
class C extends B {   //抽象类，继承B类，实现b类中的方法和A类中的方法
}
class D extends B {   //抽象类，继承B类，实现b类中的方法和A类中的方法
}
