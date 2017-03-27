package Java_oob_Encapsulation;

import com.sun.xml.internal.bind.v2.model.core.ID;
import com.sun.xml.internal.bind.v2.runtime.Name;

import sun.management.resources.agent;

public class Person_Test {

	public static void main(String[] args) {

		Person person =new Person();
		person.name = "zhangsan";
		person.age = 25;
		person.idNum = 16;
		
		System.out.println("我是"+ person.getIdNum() + "号的" + person.getName() + ",今年" + person.getAge() + "岁");
	}

}
