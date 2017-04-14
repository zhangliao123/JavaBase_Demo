package JavaBase_Serializable;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

import sun.awt.DisplayChangedListener;

public class TestGenerics {

	public static void main(String[] args) {

		ArrayList<String> arrayList1 =new ArrayList<String>();
		arrayList1.add("zhangsan");
		arrayList1.add("lisi");
		display(arrayList1);
		
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList2.add(5);
		arrayList2.add(6);
		//display(arrayList2);
	}
	
	
	public static void display(ArrayList<String> arrayList1){
		for (String string : arrayList1) {
			System.out.println(string);
		}
	}
	
	/*public static void display(ArrayList<Integer> arrayList2){
		for (Integer integer : arrayList2) {
		System.out.println(Integer);
		}
	}*/
}
