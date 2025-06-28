package sorrtingalgo;

import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
	public static void PrintArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void PrintArray1(Integer arr1[]) {
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[]= {9,7,2,5,6,4,3,1};
		Integer arr1[]= {9,7,2,5,6,4,3,1};
		Arrays.sort(arr);
		Arrays.sort(arr,1,6);
		Arrays.sort(arr1,Collections.reverseOrder());
		
		PrintArray(arr);
		PrintArray1(arr1);
		
	}

}
