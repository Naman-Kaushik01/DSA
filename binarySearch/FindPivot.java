package binarySearch;

public class FindPivot {
	
	public static int pivotIndex(int arr[]) {
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(mid<end && arr[mid]>arr[mid+1]) {
				return mid;
			}
			if(mid > start && arr[mid]<arr[mid-1]) {
				return mid-1;
			}
			//if mid , start and end are equal
			
			if(arr[start]==arr[mid] && arr[mid]==arr[end]) {
				//skip the duplicates
				//NOTE : what if these elements at start and end where the pivot ?
				//check if start is pivot
				
				if(arr[start]>arr[start+1]) {
					return start;
				}
				start++;
				
				if(arr[end] <arr[end-1]) {
					return end-1;
				}
				end--; 
			}
			
			//left side sorted
			else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[]= {1,7,3,6,5,6};
		System.out.println(pivotIndex(arr));
		
	}

}
