package JavaBase_Serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

public class TestStandardStreamResert {

	public static void main(String[] args) throws FileNotFoundException{

		System.setIn(new FileInputStream("C:\\myinfo\\info"));
		System.setOut(new PrintStream("C:\\myBack.info"));
		Scanner in = new Scanner(System.in);
		String messgae = null;
		do {
			String message = in.next();
			System.out.println(message);
		} while (in.hasNextLine());
		in.close();
		System.out.println("拷贝成功！");
	}
}
