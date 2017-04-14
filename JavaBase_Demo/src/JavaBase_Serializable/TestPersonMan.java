package JavaBase_Serializable;

public class TestPersonMan {

	public void main (String []args){
		PersonMan<String> personMan1 =new PersonMan<String>();
		personMan1.setName("zhangsan");
		personMan1.setPass("1234");
		String info1 = personMan1.getName() + ":" + personMan1.getPass();
		System.out.println(info1);
		
		PersonMan<String> personMan2 =new PersonMan<String>();
		personMan2.setName("lisi");
		personMan2.setPass("5678");
		String info2 =personMan2.getName() + ":" + personMan2.getPass();
		System.out.println(info2);
	}
}
