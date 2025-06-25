package binarySearch;
// https://leetcode.com/problems/find-in-mountain-array/description/

public class FindInMountainArray {
	

	public static int Search(int []arr,int target) {
		int peak=peakIndexInMountainArray(arr);
		int firstTry =orderAgnosticBS(arr, target, target, peak);
		if(firstTry!=-1) {
			return firstTry;
		}
		return orderAgnosticBS(arr, target, peak+1, arr.length-1);
	}
	
	
	
	public static int peakIndexInMountainArray(int[] nums) {
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
	
static int orderAgnosticBS(int nums[],int target,int start,int end) {
		
	
		
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

}
