package JvaBase_IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileByteStream {

	public static void main(String[] args) {

		try {
			FileInputStream fis =new FileInputStream ("sun.bmp");
			FileOutputStream fos =new FileOutputStream ("sunBack.bmp");
			int read = fis.read();
			while(read != -1){
				fos.write(read);
				read = fis.read(); 
			}
			fis.close();
			fos.close();
			System.out.println("Copy success!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
