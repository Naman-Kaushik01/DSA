package binarySearch;

public class SplitArray {
	
public int splitArray(int[] nums, int k) {
         int start=0;
         int end=0;
         
         for(int i=0;i<nums.length;i++) {
        	 start=Math.max(start, nums[i]);// in the end of loop this will contain the max item
        	 end+=nums[i];
         }
         //binary search
         while(start<end) {
        	 int mid= start+ (end-start)/2;
        	 
        	 //calculate how many pieces you can divide this with max sum
        	 
        	 int sum=0;
        	 int pieces=0;
        	 for(int num:nums) {
        		 if(sum+num >mid) {
        			 //you cannot add this in this subarray make new one
        			 //say you add this num in new subarray , then sum =num
        			 sum=num;
        			 pieces++;
        		 }else {
        			 sum+=num;
        		 }
        	 }
        	 if(pieces>k) {
        		 start=mid+1;
        	 }else {
        		 end=mid;
        	 }
        	 
         }
         return end;
        
    }
	public static void main(String[] args) {
		
	}

}
