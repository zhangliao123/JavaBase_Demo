package JavaBase_Reflect;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class JavaBase_Reflect {

	public static void main(String[] args) throws ClassNotFoundException {

		System.out.println("第一种方式--用Object.getClass()方法获取String类的对象为：");
		Class class1 = new String().getClass();
		System.out.println(class1.getName());
		
		System.out.println("第二种方式--用.Class()方法获取String类的对象为：");
		Class class2 = Class.class;
		System.out.println(class2.getName());
		
		System.out.println("第三种方式--用forName()方法获取String类的对象为：");
		Class class3 = Class.forName("java.lang.String");
		System.out.println(class3.getName());
		
		System.out.println("第四种方式--用包装类的TYPE域获取到的Integer类的对象为：");
		Class class4 = Integer.TYPE;
		System.out.println(class4.getName());
		
		System.out.println("第五种方式--用getDeclaredClasses()获取String类的内部类对象：");
		Class<?> [] clazz = new String().getClass().getDeclaredClasses();
		for (Class<?> class5 : clazz) {
			System.out.println("\t " + class5);
		}
	}

}
