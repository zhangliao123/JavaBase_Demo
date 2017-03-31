package JavaBase_Test;

import java.util.ArrayList;
import java.util.Collections;

public class JavaBase_Sort {

	public static void main(String[] args) {

		ArrayList<String > list =new ArrayList<String>();
		list.add("刘明");
		list.add("张三");
		list.add("王五");
		
		Collections.reverse(list);
		System.out.println(list);
	}

}
