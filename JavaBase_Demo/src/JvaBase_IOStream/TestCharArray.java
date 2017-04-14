package JvaBase_IOStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.CharArrayReader;
import java.io.CharArrayWriter;
import java.io.IOException;

public class TestCharArray {

	public static void main(String[] args) throws IOException{

		char []charArray = {'H','e','l','l','o',' ','W','o','r','l','d','!'};
		CharArrayReader cr = new CharArrayReader(charArray);
		BufferedReader br =new BufferedReader(cr);
		
		CharArrayWriter cw = new CharArrayWriter ();
		BufferedWriter bw =new BufferedWriter (cw);
		
		bw.write(br.readLine());
		System.out.println(cw);
	}

}
