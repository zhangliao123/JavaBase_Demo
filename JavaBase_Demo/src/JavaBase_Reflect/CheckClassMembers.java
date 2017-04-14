package JavaBase_Reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


/**
 * 查看类的成员
 * 
 * @author XIEHEJUN
 * 
 */
public class CheckClassMembers {

    public static void main(String[] args) {
        Class<?> strclass = new String().getClass();

        // 查看构造方法
        System.out.println(strclass.getName() + "的构造方法有：");
        Constructor<?>[] constructors =strclass.getConstructors();
        if (constructors.length > 0) {
			for (Constructor<?> constructor : constructors) {
				System.out.println("\t" + constructor);
			}
		} else {
				System.out.println("空");
		}
        
        // 查看非继承域
        System.out.println(strclass.getName() + "都非继承域有：");
        Field[] declaredFileds = strclass.getDeclaredFields();
        if (declaredFileds.length > 0) {
			for (Field field : declaredFileds) {
				System.out.println("\t" + field);
			}
		} else {
				System.out.println("空");
		}

        // 查看非继承方法
        System.out.println(strclass.getName() + "的非继承方法有：");
        Method[] declaredMethods = strclass.getDeclaredMethods();
        if (declaredMethods.length > 0) {
            for (Method method : declaredMethods) {
                System.out.println("\t" + method);
            }
        } else {
            System.out.println("空");
        }

        // 查看所有公共域
        System.out.println(strclass.getName() + "的所有域有：");
        Field[] fields = strclass.getFields();
        if (fields.length > 0) {
            for (Field field : fields) {
                System.out.println("\t" + field);
            }
        } else {
            System.out.println("空");
        }

        // 查看所有公共的方法
        System.out.println(strclass.getName() + "的所有继承方法有：");
        Method[] methods = strclass.getMethods();
        if (methods.length > 0) {
            for (Method method : methods) {
                System.out.println("\t" + method);
            }
        } else {
            System.out.println("空");
        }
    }
}
