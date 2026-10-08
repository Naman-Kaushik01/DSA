class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        long sum = 0;
        long maxSum = 0;

        int left = 0;
        for(int right = 0; right < nums.length;  right++){
            //step 1: check duplicate
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            // step 2: if not duplicate then add to set and calculate sum
            set.add(nums[right]);
            sum += nums[right];

            // step 3: maintain window size of k
            while(right - left + 1 > k){
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }

            // when window size == k
            if(right - left + 1 == k){
                maxSum = Math.max(sum , maxSum);
            }
        }
        return maxSum;
    }
}