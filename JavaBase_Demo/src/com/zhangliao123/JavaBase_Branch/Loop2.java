package com.zhangliao123.JavaBase_Branch;

import java.util.Scanner;

public class Loop2 {

	private static Scanner input;

	//for loop	
	public static void forDemo(int num){
		System.out.println("In method of forDemo:");
		for (int i = 0; i < num; i++) {
			if (i == 3){
				//break;
				//continue;
				//return;
			}
			System.out.println("Java编程思想-------" + i);
		}
		System.out.println("In method of forDemo is end!!!");
	}
	
	//while loop
	public static void whileDemo(int num){
		System.out.println("In method of whileDemo:");
		int j = 0;
		while(j < num){
			System.out.println("Java编程思想--------" + j);
			j++;
		}	
	}
	
	//doWhile loop
	public static void doWhileDemo(int num){
		System.out.println("In method of doWhileDemo:");
		int f = 0;
		do{
			System.out.println("Java编程思想--------"+ f);
			f++;
		}while(f < num);
	}
		
	//foreach loop
	public static void forEachDemo(){
		System.out.println("In method of forEachDemo:");
		String strs[] = {"AA","BB","CC"};
		for (String string : strs) {
			System.out.println("系统输出值为："+string);
			
		}	
	}	
	
	//主函数
	public static void main(String[] args) {
		System.out.println("请输入一个数：");
		input = new Scanner(System.in);
		int num = input.nextInt();		
		
		
		forDemo(num);
		
		/*whileDemo(num);
		
		doWhileDemo(num);
		
		forEachDemo();*/
		
	}				
}

