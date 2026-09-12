class Solution {
    public int findMin(int[] nums) {
        int currMin = Integer.MAX_VALUE;
        for(int i : nums){
            currMin = Math.min(currMin , i);
        }
        return currMin;
    }
}