package JavaBase_oop;

import java.util.Scanner;

public class TripTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 
		System.out.println("请输入姓名：");
		Trip trip =new Trip();
		trip.name = input.next();
		System.out.println("请输入年龄：");
		trip.age = input.nextInt();
		
		trip.show();
	}
}


