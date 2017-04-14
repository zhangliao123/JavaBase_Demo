package JavaBase_Serializable;

import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class TestStandardStream {

	public static void main(String[] args) {

		Scanner in =new Scanner(System.in);
		String message =null;
		do {
			System.out.println("请输入信息：");
			message = in.next();
			if (!message.equals("quit")) {
				System.err.println(message);
			}
		} while (!message.equals("quit"));
		in.close();
	}
}
