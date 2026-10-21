class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long maxSum = 0;
        HashMap<Integer , Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        while(right < nums.length){
            sum += nums[right];
            map.put(nums[right] , map.getOrDefault(nums[right] , 0) + 1);

            if((right - left +1) == k){
                if(map.size() == k){
                    maxSum = Math.max(sum , maxSum);
                }

                sum -= nums[left];
                map.put(nums[left] , map.get(nums[left])-1);
                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
            }
            right++;
        }
        return maxSum;
    }
}