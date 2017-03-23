package com.zhangliao123.JavaBase_Branch;

import java.util.Scanner;

public class homeWork3 {

	private static Scanner input;

	public static void main(String[] args) {

		System.out.println("请输入张浩的Java成绩：");
		Scanner input = new Scanner(System.in);
		int scoreJava = input.nextInt();
		
		System.out.println("请输入张浩的Music成绩：");
		Scanner input1 = new Scanner(System.in);
		int scoreMusic = input1.nextInt();
	
		boolean flag = (scoreJava > 98 && scoreMusic > 80) || (scoreJava == 100 && scoreMusic > 70);
		
		if(flag){
			System.out.println("成绩优秀，获得奖励！");
		}else{
			System.out.println("没有达到要求成绩，没有获得奖励！");
		}

	}

}
