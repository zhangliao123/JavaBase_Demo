package JavaBase_Training;

import java.util.Scanner;

public class NegException {

	public static void main(String[] args) {
		int num=-1;
		int k =-1;
		boolean isEx = false;

		do {
			Scanner input = new Scanner(System.in);
			System.out.println("请输入2個正确的数值：");
			try {
				num = input.nextInt();
				k = input.nextInt();
				isEx =false;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println("请重新输入2個正确的数值：");
				isEx = true;
			}

		} while (isEx);

		System.out.println(num);
		System.out.println(k);
	}
}