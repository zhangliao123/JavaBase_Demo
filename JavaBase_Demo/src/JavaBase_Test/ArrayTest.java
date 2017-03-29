package JavaBase_Test;

import java.util.Scanner;

public class ArrayTest {

	public static void main(String[] args) {

		//Scanner Input =new Scanner(System.in); 
		Array array =new Array(); 
		System.out.println("请输入十个数：");
		for (int i = 0; i < 10; i++) {
			array.num[i] = new Scanner(System.in).nextInt();;
			//System.out.println("第" + (i+1) + "个数为：" + num[i]);
		}
		
		array.sumCal();
		array.avgCal();
		array.sortCal();
		array.doccSortCal();
		array.maxCal();
		array.minCal();
	}
	

}
