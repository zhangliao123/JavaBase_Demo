package JavaBase_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		int result = div();
		System.out.println("系统返回值为：" + result);
	}
	
	static Scanner input =new Scanner(System.in);
	public static int div(){
		try {
			System.out.println("请输入两个数相除：");
			int num1 = input.nextInt();
			int num2 = input.nextInt();
			System.out.println("两个数相除的结果为：" + (num1/num2));
			return 0;
		}catch (ArithmeticException ae) {
			System.out.println("我捕捉到了ArithmeticException异常！");
			return 1;
		}catch (InputMismatchException ime) {
			System.out.println("我捕捉到了InputMismatchException异常！");
			return 2;
		}catch (Exception e) {
			System.out.println("我捕捉到了异常！");
			System.out.println(e.getClass().getName());
			return 3;
		}finally {
			System.out.println("我是finally语句块中的内容！");
			return 4;
		}
		//System.out.println("系统执行到此结束！");
	}
}
