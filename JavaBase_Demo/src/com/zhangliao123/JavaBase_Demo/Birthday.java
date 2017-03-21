package com.zhangliao123.JavaBase_Demo;

public class Birthday {

	private static int year = 2015;
	private static int month = 6;
	private static int date =6;
	
	public static void display1(int year,int month,int date){
		year = 2016; month = 7; date = 7;
		System.out.println("值传递中："+ year + "-" + month +"-" + date);
	}
	
	public static void display2(Birthday birthday){
		Birthday.year = 2016;
		Birthday.month =7;
		Birthday.date = 7;	
		System.out.println("引用传递中："+ Birthday.year + "-" + Birthday.month + "-" + Birthday.date);
	}
	
	public static void testValue1(){
		Birthday birthday = new Birthday ();
		int year = 2016; int month = 6; int date = 6;
		System.out.println("值传递之前：" + year + "-" + month + "-" + date);
		birthday.display1(2015, 6, 6);
		System.out.println("值传递之后：" + year + "-" + month + "-" + date);
	}
	
	public static void testValue2(){
		Birthday birthday = new Birthday ();
		Birthday.year = 2015;
		Birthday.month = 6;
		Birthday.date = 6;
		System.out.println("引用传递之前："+Birthday.year + "-" + Birthday.month + "-" + Birthday.date);
		birthday.display2(birthday);
		System.out.println("引用传递之后："+Birthday.year +  "-"+ Birthday.month + "-" + Birthday.date);
			
	}
	public static void main(String[] args) {

		testValue1();
		System.out.println("----------------");
		testValue2();
		
	}

}
