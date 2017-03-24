package JavaBase_oop;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class Student {
	
	//int scores[] = new int[3];

	//计算平均值	
	public double calAvg(int[] scores){
		
		int sum = 0;
		double avg = 0;
		for (int i = 0; i < 3; i++) {
			sum =sum + scores[i];
		}
		avg = (double)sum/3;
		return avg;
	}

	//计算最大值	
	public int calMax(int[] scores){
		
		int max =scores[0];
		for (int i = 1; i < 3; i++) {
			if (max < scores[i]) {
				max = scores[i];
			}
		}
		return max;
	}
}
