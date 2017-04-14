package JvaBase_IOStream;

import java.io.File;

import com.sun.xml.internal.messaging.saaj.soap.ver1_1.Fault1_1Impl;
import com.sun.xml.internal.messaging.saaj.soap.ver1_2.Fault1_2Impl;

public class TestFile {

	public static void main(String[] args) {

		File f1 =new File("a.txt");
		File f2 =new File("E:/temp/");
		System.out.println("Name:" + f1.getName());
		System.out.println("Path:" + f1.getPath());
		System.out.println("AbsolutePath:" + f1.getAbsolutePath());
		System.out.println("Parent:" + f1.getParent());
		System.out.println("LastModified:" + f1.lastModified());
		System.out.println("length:" + f1.length());
		System.out.println("existes:" + f1.exists());
		System.out.println("canRead:" + f1.canRead());
		System.out.println("canWrite:" + f1.canWrite());
		System.out.println("isFile:" + f1.isFile());
		System.out.println("isHidden:" + f1.isHidden());
		System.out.println("isDireector:" + f1.isDirectory());
		System.out.println("length:" + f1.length());
		f1.delete();
	}

}
