package binarySearch;

public class RotatedBinarySearch {
public int search(int[] nums, int target) {
	int start=0;
	int end=nums.length-1;
	int pivot=findPivot(nums);
	
	
	if(pivot==-1) {
		return binarySearch(nums, target, start, end);
	}
	if(target==nums[pivot]) {
		return pivot;
	}
	if(nums[start]<pivot) {
		end=pivot-1;
	}else {
		start=pivot+1;
	}
        return binarySearch(nums, target, start, end);
    }
	public static int findPivot(int arr[]) {
		int start=0;
		int end=arr.length-1;
		
		while(start<=end) {
			int mid=start+(end-start)/2;
			if(mid<end && arr[mid]>arr[mid+1]) {
				return mid;
			}
			if(mid > start && arr[mid]<arr[mid-1]) {
				return mid-1;
			}if(arr[start]>=arr[mid]) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return -1;
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
	public static void main(String[] args) {
		int arr[]= {4,5,6,7,0,1,2};
		System.out.println(findPivot(arr));
	}

}
