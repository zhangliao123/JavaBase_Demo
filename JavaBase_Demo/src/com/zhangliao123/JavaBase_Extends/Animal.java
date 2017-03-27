package com.zhangliao123.JavaBase_Extends;

public class Animal {

	private String name;
	private int idNum;

	public Animal(String myName, int myIdNum){
		this.name =myName;
		this.idNum =myIdNum ;
	}
	
	public void eat(){
		System.out.println("正在吃！");
	}
	
	public void sleep(){
		System.out.println("正在睡！");
	}
	
	public void show(){
		System.out.println("大家好，我是" + idNum + "號的" + name);
	}
} 

