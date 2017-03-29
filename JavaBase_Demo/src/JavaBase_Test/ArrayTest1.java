package JavaBase_Test;

import java.util.Scanner;

import java.util.Arrays;

public class ArrayTest1 {

	public static void main(String[] args) {

		int[] num = new int[3];
		int sum = 0;
		int i = 0;
		double avg =0;
		
		Scanner Input =new Scanner(System.in); 
		System.out.println("请输入十个数：");
		for (int j = 0; j < num.length; j++) {
			num[i] =Input.nextInt();
			//System.out.println("第" + (j+1) + "个数为：" + num[j]);
		}
		
			sum += num[i];
			i++;
			System.out.print("数值和为：" + sum);
		
			avg = sum/num.length;
			System.out.println("平均值为：" + avg);
		
			Arrays.sort(num);
			System.out.println("数组升序排列后为：" + num[i] + " ");
		
			int max = num[0];
			for (int k = 0; max < num[k]; k++) {
				max = num[k];
			System.out.println("数组中最大的值为：" + max);
		}
		
			int min = num[0];
			for (int m = 0; min > num[m]; m++) {
				min = num[m];
			}
			System.out.println("数组中最小的值为：" + min);
	}
}
