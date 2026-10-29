class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0;
        int high = 0;
        for(int n : nums){
            low = Math.max(n , low);
            high += n;
        }

        while(low <= high){
            int mid = (low + high) >> 1;

            if(canSplit(nums , mid , k)){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    public boolean canSplit(int[] nums , int maxPages , int k){
        int subarrayCount = 1;
        int currSum = 0;
        for(int i = 0; i < nums.length; i++){
            if(currSum + nums[i] > maxPages){
                subarrayCount ++;
                currSum = nums[i];
            }else{
                currSum += nums[i];
            }
        }
        return subarrayCount <= k;
    }
}