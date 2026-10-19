class Solution {
    public int totalFruit(int[] nums) {
        int left = 0;
        int res = -1;
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int right = 0; right < nums.length; right++){
            //adding all the fruits category with their count
            map.put(nums[right] , map.getOrDefault(nums[right], 0) + 1);

            // shrinking map size if size is greater than 2
            while(map.size() > 2){
                map.put(nums[left] , map.get(nums[left])-1);
                if(map.get(nums[left]) == 0){
                    map.remove(nums[left]);
                }
                left++;
            }
            //now find the answer
            if(map.size() <= 2){
                res = Math.max(res , right - left + 1);
            }
        }
        return res;

    }
}