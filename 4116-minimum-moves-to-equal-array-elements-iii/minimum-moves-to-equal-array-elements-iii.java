class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int maxVal = nums[nums.length-1];
        int count = 0;
        for(int n : nums){
            int diff = maxVal - n;
            if(diff != 0){
                count += diff;
            }
        }
        return count;
    }
}