package JavaBase_Test;

public class User {

	private String name;
	private int age;
	
	public User() {

	}
	
	public User(String name, int age){
		super();
		this.name =name;
		this.age =age ;
	}
	
	public String getName(String name){
		return name;
	}
	
	public void setName(String name){
		this.name =name;
	}
	
	public int getAge(int age){
		return age;
	}
	
	public void setAge(int age){
		this.age =age;
	}
	
	
}
