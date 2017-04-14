package JavaBase_Training;

import java.util.Scanner;

public class Test {

	static int height;
	static int shift;
	static boolean isEx;

	public static void main(String[] args) {

		do {
			Scanner input = new Scanner(System.in);
			System.out.println("请输入两个值：");
			
			try {
				height = input.nextInt();
				shift = input.nextInt();
				isEx = false;

			} catch (Exception e) {
				System.out.println("请重新输入两个正确的值：");
				isEx = true;
			}
			
		} while (isEx);
		
		for (int i = 1; i <= height; i++) {  
	        // 控制打印空格  
			for (int j = 1; j <= height - i + shift; j++) {  
				System.out.print(" ");  
	        }  
	            // 控制打印*  
	        	for (int k = 1; k <= 2 * i - 1; k++) {  
	                // 第一行,最后一行全部打印*  
	        		if (i == 1 || i == height) {  
	                    System.out.print("*");  
	                } else {  
	                // 第一个和最后一个打印*其余打印空格  
	                    if (k == 1 || k == 2 * i - 1) {  
	                        System.out.print("*");  
	                    } else {  
	                        System.out.print(" ");
	                    }  
	                }  
	            }  
	    System.out.println(); 
		}
	}
}
