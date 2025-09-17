package arraylist;

import java.util.ArrayList;


public class Operations {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		
		//Get Operation
		
		int element = list.get(2);
		System.out.println(element);
		
		//Delete
		
		list.remove(2);
		System.out.println(list);
		
		//Set
		list.set(2, 10);
		System.out.println(list);
		
		//contains 
		System.out.println(list.contains(1));
		
		//Size - it is a function not a operation
		System.out.println(list.size());
		
		//print the arraylist
		
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i) + " ");
		}
		//System.out.println();
	}

}
