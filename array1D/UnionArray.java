package array1D;

import java.util.HashSet;
import java.util.Set;

public class UnionArray {
	
	public static void main(String[] args) {
		
		int arr1[]= {1, 2, 3, 4, 5};
		int arr2[]= {1, 2, 7};
		
		Set<Integer> set = new HashSet<Integer>();
		
		for(int i=0;i<arr1.length;i++) {
			set.add(arr1[i]);
		}
		for(int i=0;i<arr2.length;i++) {
			set.add(arr2[i]);
		}
		System.out.println(set);
		
		
		
		
		
	}

}
