package JavaBase_Test;

import java.util.Arrays;

public class Array {

	int[] num = new int[10];
	int i = 0;
	int sum = 0;
	double avg =0;
	
	public void sumCal(){
		sum += num[i];
		i++;
		System.out.print("数值和为：" + sum);
	}
	
	public void avgCal(){
		avg = sum/num.length;
		System.out.println("平均值为：" + avg);
	}
	
	public void sortCal(){
		Arrays.sort(num);
		System.out.println("数组升序排列后为：" + Arrays.toString(num) + " ");
	}
	
	public void doccSortCal(){
		for(int i = 0 ; i < num.length-1 ; i++){
			for(int j = i+1 ; j < num.length ; j++){
			    if(num[j] > num[i]){
			         int temp = num[i];
			         num[i] = num[j];
			         num[j] = temp;
			    }
			}
		}
	}
	
	public void maxCal(){
		int max = num[0];
		for (int i = 0; max < num[i]; i++) {
			max = num[i];
		}
		System.out.println("数组中最大的值为：" + max);
	}
	
	public void minCal(){
		int min = num[0];
		for (int i = 0; min > num[i]; i++) {
			min = num[i];
		}
		System.out.println("数组中最小的值为：" + min);
	}
	
}


