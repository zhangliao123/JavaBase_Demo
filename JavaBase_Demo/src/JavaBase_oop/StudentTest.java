package JavaBase_oop;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {

		Student student =new Student();
		System.out.println("请输入参加Java考试的学生成绩：");
		int[] scores = new int[3];
		for (int i = 0; i < 3; i++) {
			Scanner input =new Scanner(System.in);
			scores[i] = input.nextInt();
			//System.out.print("第"+ (i+1)+ "位学生的Java成绩为：" + student.scores[i] + "\n" );
		}
		double avgScore = student.calAvg(scores);
		int maxScore = student.calMax(scores);
		System.out.println("最高成绩：" + maxScore);
		System.out.println("平均成绩：" + avgScore);
	}
}
