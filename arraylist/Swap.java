package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Swap {
	public static void swap(ArrayList<Integer> list , int idx1, int idx2) {
		while(list.size()!=0) {
			int temp =list.get(idx1);
			list.set(idx2 , list.get(idx2));
			list.set(idx2, temp);
			
		}
	}
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		list.add(2);
		list.add(5);
		list.add(9);
		list.add(6);
		list.add(8);
		
		//ascending
		Collections.sort(list);
		//descending
		Collections.sort(list , Collections.reverseOrder());
		
		
		int idx1 = 1 , idx2 = 2;
		System.out.println(list);
		swap(list , idx1, idx2);
		System.out.println(list);
	}

}
