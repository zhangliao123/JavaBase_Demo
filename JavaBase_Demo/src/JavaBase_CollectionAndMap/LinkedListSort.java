package JavaBase_CollectionAndMap;

import java.util.LinkedList;

public class LinkedListSort {

	public void sort(){
		
		LinkedList<Integer> list =new LinkedList<Integer>();
		list.add(2);
		list.add(6);
		list.add(5);
		list.add(4);
		list.add(3);
		
		int temp =0;
		for (int i = 0; i < list.size(); i++) {
			for (int j = i+1; j < list.size(); j++) {
				if(list.get(j) > list.get(i)){
				temp = list.get(j);
				/*list.get(j) = list.get(i);
				list.get(i) = temp;*/
				}
			}
		}
	}
}
