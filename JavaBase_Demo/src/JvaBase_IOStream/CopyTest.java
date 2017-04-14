package JvaBase_IOStream;

import java.io.*;

public class CopyTest {

	public void testCopyFile() {
		long l1 = System.currentTimeMillis();
		File src = new File("E:\\","File abc.wmv "); //
		File dest = new File("E:\\workspace","abccopy.wmv"); //
		//copyFile(src, dest);
		long l2 = System.currentTimeMillis();
		System.out.println(l2 - l1);
	}

	public void copyFile(String src, String dest) {

		// 1.提供读入和写入的文件
		File f1 = new File(src);
		File f2 = new File(dest);
		// 2.提供相应的流对象
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(f1);
			fos = new FileOutputStream(f2);
			// 3.实现复制
			byte[] b = new byte[200];
			int len;
			while ((len = fis.read(b)) != -1) {
				fos.write(b, 0, len);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
