package JavaBase_Reflect;

import java.lang.reflect.Field;

public class TestReflect1 {

	private String name = null;
	
	public static void main(String[] args) throws Exception {
		Class<?> class1 = Class.forName("JavaBase_Reflect.Person");
		Object object = class1.newInstance(); 
		Field field = class1.getDeclaredField("name");
		field.setAccessible(true);
		field.set(object, "lisi");
		Person person = new Person();
		System.out.println("Person中name為：" + person.name);
		System.out.println("修改過後的name：" + field.get(object));
	}
}
