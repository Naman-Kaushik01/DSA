package recursion;

public class RotatedSortedArray {
	static boolean search(int arr[],int target,int start,int end) {
		if(start>end) {
			return false;
		}
		int mid=start +(end-start)/2;
		
		if(arr[mid]==target) {
			return true;
		}
		
		if(arr[start]<=arr[mid]) {
			if(target>=arr[start] && target<=arr[mid]) {
				search(arr, target, start, mid-1);
			}else {
				search(arr, target, mid+1, end);
			}
			
		}
		if(target>=arr[mid] && target<= arr[end]) {
			search(arr, target , mid+1 , end);
		}else {
			search(arr, target, start, mid-1);
		}
		
		return false;
	}
	public static void main(String[] args) {
		int arr[]={2,5,6,0,0,1,2};
		int target=7;
		System.out.println(search(arr, target, 0, arr.length-1));
	}

}
