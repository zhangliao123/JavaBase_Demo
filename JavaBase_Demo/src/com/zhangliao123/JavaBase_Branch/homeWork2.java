package com.zhangliao123.JavaBase_Branch;

public class homeWork2 {

	public static void main(String[] args) {
		//water表示水缸里的水
		int water = 15;
		//i表示小和尚挑水的次数
		int i = 0;
		// totle表示水缸容量
		int totle = 50;
		
		//doWhile loop
		do{
			water = water + 5;
			++i;
		}while(water <+ totle);
		
		
		
		//while loop
		/*while (water < totle){
			water = water + 5;
			i++;
			//water = 15 + i*5;
		}
		
		
		int shengYu;
		shengYu = totle - water;
		i = shengYu/5;*/
		System.out.println("需要挑水的次数：" + i);
		
	}

}
