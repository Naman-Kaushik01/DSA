package recursion;

import java.util.Arrays;

public class MergeSortInPlace {
	static void sort(int arr[],int start,int end) {
		if(end-start==1) {
			return ;
		}
		int mid=(start+end)/2;
		
		sort(arr,0,mid);
		sort(arr, mid, end);
		
		 mergeArray(arr,start,end, mid);
		
	}
	
	static void mergeArray(int arr[],int start,int mid,int end){
		int mix[]=new int [end-start];
		int i=start;
		int j=end;
		int k=0;
		
		while(i<mid && j<end) {
			if(arr[i]<arr[j]) {
				mix[k]=arr[i];
				i++;
			}
			else {
				mix[k]=arr[j];
				j++;
			}
			k++;
		}
		
		//it may be possible that one of the array is not complete
		
		while(i<mid) {
			mix[k]=arr[i];
			i++;
			k++;
		}

		while(j<end) {
			mix[k]=arr[j];
			j++;
			k++;
		}
		for(int l=0;l < mix.length;l++) {
			arr[start+l]=mix[l];
		}
	}

	public static void main(String[] args) {
		int arr[]= {3,4,8,6,2,5};
		sort(arr,0,arr.length);
		System.out.println(Arrays.toString(arr));
		
	}

}
