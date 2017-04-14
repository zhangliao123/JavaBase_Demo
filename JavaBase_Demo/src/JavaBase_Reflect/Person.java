package JavaBase_Reflect;

import lombok.Getter;
import lombok.Lombok;
import lombok.Setter;

public class Person {
	String name = "Nancy";
	private int age = 23;
	private boolean married = false;
	
	/*@Getter
	@Setter*/
	
	public Person(){
		
	}
	
	
	public Person(String str,int i,boolean flag){
		name =str;
		age = i;
		married = flag;
	}
	
	private void display() {
		System.out.println("姓名："+ name + "\n" + "年龄：" + age + "\n" + "婚否:" + married);
		
	}

	public static void main(String[] args) {
		Person person = new Person("JACK",25,false);
		//Person person = new Person();
		person.display();

	}
}
