package binarySearch;

public class OrderAgnosticBinarySearch {
	static int orderAgnosticBS(int nums[],int target) {
		
		
		int start=0;
		int end=nums.length;
		
		boolean isAsc;
		if(nums[start]<nums[end]) {
			isAsc=true;
		}
		else {
			isAsc=false;
		}
		
		
		while(start<=end) {
			int middle=(start+end)/2;
	
			
			if(nums[middle]==target) {
				return middle;
			}
			if(isAsc) {
				if(nums[middle]<target) {
					start=middle+1;
				}else if(nums[middle]>target) {
					end=middle-1;
				}
			}
			
			else {
				if(nums[middle]>target) {
					start=middle+1;
				}else if(nums[middle]<target) {
					end=middle-1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
	}

}
