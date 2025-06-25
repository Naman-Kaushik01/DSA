package binarySearch;

public class BinarySearch {
	public static int binarySearch(int nums[],int target) {
		int start=0;
		int end=nums.length;
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
		int nums[]= {2,3,4,5,6,7,10,15,37,40};
		int target=8;
		System.out.println(binarySearch(nums, target));
		
	}

}
