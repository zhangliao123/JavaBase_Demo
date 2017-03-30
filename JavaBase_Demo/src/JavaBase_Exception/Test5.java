package JavaBase_Exception;

import java.util.Scanner;

public class Test5 {

	private static int age;
	
	
	/*private static Exception e(String string) {
		return null;
	}
	*/
	public static void main(String[] args) throws Exception {

		try {
			System.out.println("请输入学生年纪：");
			Scanner input =new Scanner(System.in);
			int age = input.nextInt();
			
			
			throw new Exception("学生年纪不能为负");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		} 
	}
}
