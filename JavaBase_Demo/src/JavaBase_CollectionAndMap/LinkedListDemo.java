package JavaBase_CollectionAndMap;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<Integer> list =new LinkedList<Integer>();
		list.add(2);
		list.add(6);
		list.add(5);
		list.add(4);
		list.add(3);
		
		System.out.println("系统原来值：" + list);
		
		list.element();
		System.out.println("list.element():" + list);

		list.removeFirst();
		System.out.println("list.removeFirst():" + list);
		
		list.descendingIterator();
		System.out.println("list.descendingIterator()" + list);
		
		list.contains(0);
		System.out.println("list.contains(0):" + list.contains(0));
		
		list.indexOf(5);
		System.out.println("list.indexOf(0):" + list.indexOf(5));
		
		list.peek();
		System.out.println("list.peek():" + list.peek());
		
		list.pop();
		System.out.println("list.pop():" + list.pop());
	}

}
