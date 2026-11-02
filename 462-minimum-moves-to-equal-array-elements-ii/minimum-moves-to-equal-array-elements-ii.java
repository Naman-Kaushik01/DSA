class Solution {
    public int minMoves2(int[] nums) {
        int moves = 0;
        Arrays.sort(nums);
        int med =  nums[nums.length / 2];

        for(int i : nums){
            moves += Math.abs(i - med);
        }
        return moves;
    }
}