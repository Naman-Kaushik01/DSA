class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        int maxLen = 0;
        Map<Character , Integer> map = new HashMap<>();

        for(int right = 0; right < n; right++){
            char rightChar = s.charAt(right);
            map.put(rightChar , map.getOrDefault(rightChar , 0) + 1);

            // if frequency of any character is greater than 1 it means it is duplicate

            while(map.get(rightChar) > 1){
                char leftChar = s.charAt(left);
                map.put(leftChar , map.get(leftChar) - 1);
                if(map.get(leftChar) == 0){
                    map.remove(leftChar);
                }
                left++;
            }
            maxLen = Math.max(maxLen , right - left + 1);
        }
        return maxLen;
    }
}