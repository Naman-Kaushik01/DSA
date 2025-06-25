package binarySearch;

public class SearchInInfiniteArray {
	
	static int ans(int arr[],int target) {
		int start=0;
		int end=1;
		
		while(target>arr[end]) {
			int temp=end+1;
			end=end+(end-start+1)*2;
			start=temp;
		}
		return binarySearch(arr, target, start, end);
	}
	public static int binarySearch(int nums[],int target,int start,int end) {
		
		while(start<=end) {
			int middle=(start+end)/2;
			
			if(nums[middle]==target) {
				return middle;
			}if(nums[middle]<target) {
				start=middle+1;
			}else {
				end=middle-1;
			}
		}
		return -1;
	}

}
