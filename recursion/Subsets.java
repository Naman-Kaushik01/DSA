package recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
	static List<List<Integer>> FindSubsets (int []arr){
		List<List<Integer>> outer = new ArrayList<List<Integer>>();
		
		outer.add(new ArrayList<Integer>());
		for(int num:arr) {
			int n=outer.size();
			for(int i=0;i<n;i++) {
				List<Integer> internal = new ArrayList<>(outer.get(i));
				internal.add(num);
				outer.add(internal);
				
			}
		}
		
		return outer;
	}
	public static void main(String[] args) {
		
		int arr[]= {1,2,3};
		List<List<Integer>> ans=FindSubsets(arr);
		
		for(List<Integer> nums:ans) {
			System.out.println(nums);
		}
	}

}
