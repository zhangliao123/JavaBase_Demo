package JavaBase_Serializable;

import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class WriteObject {

	public static void main(String[] args) {

		try {
			FileOutputStream fos =new FileOutputStream ("person.object");
			ObjectOutputStream oos =new ObjectOutputStream(fos);
			oos.writeObject(new Person(1,"zhangsan","1234"));
			oos.writeObject(new Person(2,"lisi","12345"));
			oos.close();
			System.out.println("success!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
