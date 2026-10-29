class Solution {
    public int minCapability(int[] nums, int k) {
        int low = 0;
        int high = 0;
        for(int n : nums){
            low = Math.min(n , low);
            high = Math.max(n , high);
        }
        while(low <= high){
            int mid = (high + low) >> 1;
            if(possible(nums , k , mid)){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    public boolean possible(int nums[] , int k , int mid){
        int houseCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= mid){
                houseCount ++;
                i++;
            }
        }
        return houseCount >= k;
    }
}