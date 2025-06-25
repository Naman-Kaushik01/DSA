package binarySearch;

public class PeekElementInMountainArray {
	 public int peakIndexInMountainArray(int[] nums) {
	      int start=0;
	        int end=nums.length-1;

	        while(start<end){
	            int mid=start+(end-start)/2;
	            
	            if(nums[mid]>nums[mid+1]){
	                //You are in  descending part of the array 
	                //it may be the answer but check left side.
	                //this is why end != mid-1;

	                end=mid;
	            }
	            else{
	                //You are in ascending part of array
	                start=mid+1; //because we know mid+1>mid
	            }
	        }
	        return start;
	        
	    }
	public static void main(String[] args) {
		
	}

}
