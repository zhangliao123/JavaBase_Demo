package JavaBase_oop;

import java.util.Scanner;

public class Trip {

	String name;
	int age;
	
	public void show(){
		
		Scanner input =new Scanner(System.in); 
		//while(!"n".equals(name)){
			if (age > 60 || age < 18) {
				System.out.println(name + "年龄为" + age + "门票价格为20元！" );
			}else{
				System.out.println(name + "年龄为" + age + "门票价格为40元！" );
			}
		}
	}
//}
