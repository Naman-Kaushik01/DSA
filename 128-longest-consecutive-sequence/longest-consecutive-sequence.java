class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int maxLen = 1;
        for(int n : set){
            if(!set.contains(n-1)){
                int count = 1;
                int currNum = n;
                while(set.contains(currNum + 1)){
                    count++;
                    currNum ++;
                }
                maxLen = Math.max(maxLen , count);
            }
        }
        return maxLen;
    }
}