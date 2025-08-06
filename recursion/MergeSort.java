package recursion;

import java.util.Arrays;

public class MergeSort {
	static int[] sort(int arr[]) {
		if(arr.length==1) {
			return arr;
		}
		int mid=arr.length/2;
		
		int left[]=sort(Arrays.copyOfRange(arr, 0, mid));
		int right[]=sort(Arrays.copyOfRange(arr, mid, arr.length));
		
		int mergeArr[]=mergeArray(left,right);
		return mergeArr;
	}
	
	static int [] mergeArray(int first[],int second[]){
		int mix[]=new int [first.length+second.length];
		int i=0;
		int j=0;
		int k=0;
		
		while(i<first.length && j<second.length) {
			if(first[i]<second[j]) {
				mix[k]=first[i];
				i++;
			}
			else {
				mix[k]=second[j];
				j++;
			}
			k++;
		}
		
		//it may be possible that one of the array is not complete
		
		while(i<first.length) {
			mix[k]=first[i];
			i++;
			k++;
		}

		while(j<second.length) {
			mix[k]=second[j];
			j++;
			k++;
		}
		return mix;
	}

	public static void main(String[] args) {
		int arr[]= {3,4,8,6,2,5};
		arr=sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
}
