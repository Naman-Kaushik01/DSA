package recursion;

import java.util.Arrays;

public class BubbleSort {
	static void Sort(int arr[],int r,int c) {
		if(r==0) {
			return;
		}
		if(c<r) {
			if(arr[c]>arr[c+1]) {
				int temp=arr[c];
				arr[c]=arr[c+1];
				arr[c+1]=temp;
			}
			Sort(arr,r, c+1);
		}else {
			
			Sort(arr,r-1, 0);
		}
	}
	public static void main(String[] args) {
		int arr[]= {5,3,4,6,1};
		Sort(arr, arr.length-1, 0);
		System.out.println(Arrays.toString(arr));
	}

}
