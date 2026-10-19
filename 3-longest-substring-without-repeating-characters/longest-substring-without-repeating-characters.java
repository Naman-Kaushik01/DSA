class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int maxLen = 0;
        HashMap<Character , Integer> map = new HashMap<>();
        for(int right = 0; right < n; right++){
            char c = s.charAt(right);
            map.put(c , map.getOrDefault(c , 0)+1);

            //if duplicate exist remove
            while(map.get(c) > 1){
                char leftCh = s.charAt(left);
                map.put(leftCh , map.get(leftCh)-1);
                if(map.get(leftCh) == 0){
                    map.remove(leftCh);
                }
                left++;
            }

            maxLen = Math.max(maxLen , right - left + 1);
        }
        return maxLen;
    }
}