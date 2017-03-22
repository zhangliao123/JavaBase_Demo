package com.zhangliao123.JavaBase_Branch;

import java.util.Scanner;

public class Branch_If {

	public static void main(String[] args) {
		
		System.out.println("请输入分数：");
		Scanner input = new Scanner(System.in);
		int score = input.nextInt();
		
		
		//if条件语句
		/*if (score == 100){
			System.out.print("恭喜您，奖励一台汽车");
		}else
		if (score <100 && score >=60){
			System.out.println("考试及格");
		} else
		if (score <60 && score >=0){
			System.out.println("考试不及格");
		} */
		
		
		//switch条件语句
		
		switch(score){
		case 100:
			System.out.println("恭喜您，奖励一台汽车");
			break;
		case 80:
			System.out.println("良好");
			break;
		case 60:
			System.out.println("及格");
			break;	
			default:
			break;
		}
		
		
	}

}
