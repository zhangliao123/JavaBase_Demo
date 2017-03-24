package com.zhangliao123.JavaBase_Branch;

import java.util.Scanner;

public class Promble4 {

	public static void main(String[] args) {

		// 等腰三角形输出*，三个loop
		int max = 9;
		// int num = 0;

		for (int i = 0; i < max; i++) {

			for (int j = max; j > i; j--) {
				System.out.print(" ");
			}

			for (int k = 0; k <= i * 2; k++) {

				for (int a = 1; a <= 9; a++) {

					for (int b = 1; b <= 9; b++) {
						num = a * b;
						System.out.print(a + "*" + b + "=" + num + " ");
					}
				}
				System.out.print("*");
			}
			System.out.print("\n");
		}

		/*
		 * //等腰三角形输出*，一个loop Scanner input =new Scanner(System.in); int height =
		 * nextInt(); System.out.println("请输入等腰三角形的高：");
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * }
		 * 
		 * private static int nextInt() { // TODO Auto-generated method stub
		 * return 0;
		 */
	}

}
