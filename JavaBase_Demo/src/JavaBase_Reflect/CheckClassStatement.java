package JavaBase_Reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;

import sun.security.action.GetBooleanAction;

public class CheckClassStatement {

	public static void main(String[] args) throws ClassNotFoundException {

		Class<?> classTest = Class.forName("java.lang.ArrayList");
		
		System.out.println("根据指定的对象获取其类名：" + classTest.getName());
		Annotation[] annotations = classTest.getAnnotations();
		
		System.out.println("指定对象的注解为：");
		if (annotations.length > 0) {
			for (Annotation annotation : annotations) {
				System.out.println(annotation + "\t");
			}
		}else {
			System.out.println("输出为空");
		}
		System.out.println("获得Java语言规范化名称：" + classTest.getCanonicalName());
		
		System.out.println("获取类上的修饰符，共有：" + classTest.getModifiers() + "个，" 
		+ "类型名为：" + Modifier.toString(classTest.getModifiers()) );
		
		
		TypeVariable<?> [] typeVariableV = classTest.getTypeParameters();
		System.out.println("获取的泛型类型为：");
		if (typeVariableV.length > 0) {
			for (TypeVariable<?> typeVariable : typeVariableV) {
				System.out.println(classTest.getName());}
		}else {
			System.out.println("输出为空");
		}
	}
}


