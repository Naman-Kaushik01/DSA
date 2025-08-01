package recursion;

import java.util.ArrayList;

public class LinearSearch {
	static boolean Search(int arr[],int target,int index) {
		if(index==arr.length) {
			return false;
		}
		return arr[index]==target || Search(arr, target, index+1);
	}
	static int FindIndex(int arr[],int target,int index) {
		if(index==arr.length) {
			return -1;
		}if(arr[index]==target) {
			return index;
		}
		return FindIndex(arr, target, index+1);
	}
	
	static int FindIndexLast(int arr[],int target,int index) {
		if(index==-1) {
			return -1;
		}if(arr[index]==target) {
			return index;
		}
		return FindIndex(arr, target, index-1);
	}
	static ArrayList<Integer> FindAllIndex(int arr[],int target,int index,ArrayList<Integer>list) {
		if(index==arr.length) {
			return list;
		}if(arr[index]==target) {
			list.add(index);
		}
		return FindAllIndex(arr, target, index+1,list);
	}
	
	static ArrayList<Integer> FindAllIndex2(int arr[],int target,int index) {
		ArrayList<Integer>list = new ArrayList<Integer>();
		if(index==arr.length) {
			return list;
		}if(arr[index]==target) {
			list.add(index);
		}
		ArrayList<Integer> ans= FindAllIndex2(arr, target, index+1);
		list.addAll(ans);
		return list;
	}
	
	public static void main(String[] args) {
		int arr[]= {1,3,4,5,11,11,7,11};
		int target=11;
		int index=0;
		System.out.println(Search(arr, target, index));
		System.out.println(FindIndex(arr, target, index));
		System.out.println(FindIndexLast(arr, target, arr.length-1));
	    ArrayList<Integer>ans=FindAllIndex(arr, target, index, new ArrayList<Integer>());
	    System.out.println(ans);
	    System.out.println(FindAllIndex2(arr, target, index));
	}

}
