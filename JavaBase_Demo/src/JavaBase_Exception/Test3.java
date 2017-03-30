package JavaBase_Exception;

import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class Test3 {
	public static void divide() throws Exception {
		  //可能出现异常的代码
		Scanner in = new Scanner(System.in);
		System.out.print("请输入被除数:");
		int num1 = in.nextInt();
		System.out.print("请输入除数:");
		int num2 = in.nextInt();
		System.out.println(String.format("%d / %d = %d", 
						num1, num2, num1/ num2));
		System.out.println("感谢使用本程序！");
	}
	
	public static boolean main(String[] args) {
		 try {
			divide();
		 } catch (Exception e) {
			e.printStackTrace();
		 }
		 return true;
		 
		/* finally {
			System.out.println("");
		}*/
	}
	/*public static void main(String[] args) throws Exception {
		 divide();
	}*/

}
