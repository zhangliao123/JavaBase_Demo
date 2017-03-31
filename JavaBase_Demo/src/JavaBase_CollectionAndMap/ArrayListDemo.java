package JavaBase_CollectionAndMap;

import java.util.ArrayList;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> list =new ArrayList<String>();	
		list.add("我");
		list.add("在");
		list.add("学");
		list.add("习");
		list.add("计");
		list.add("算");
		list.add("机");
		
		System.out.println("list的内容：");
		for (String string : list) {
			System.out.println(string);
		}
		
		list.add(2, "合");
		list.add(3, "肥");
		System.out.println(list);
		
		list.get(0);
		System.out.println("list.get(0)：" + list.get(0));
		
		list.addAll(list);
		System.out.println("list.addAll(list):" + list.addAll(list));
		
		list.isEmpty();
		System.out.println("list.isEmpty():" + list.isEmpty());
		
		/*Object[] a = {"中","国"};
		list.toArray(a);
		System.out.println("list.toArray(a)：" + list);*/
		
		//list.size();
		//System.out.println("list.size():" + list.size());
		
		list.remove(0);
		System.out.println("list.remove(0):" + list);
		
		list.replaceAll(null);
		System.out.println("list.replaceAll(null):" + list);
	}
}
