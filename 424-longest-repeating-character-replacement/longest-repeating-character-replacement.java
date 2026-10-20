class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character , Integer> map = new HashMap<>();
        int left = 0;
        int maxWindow = Integer.MIN_VALUE;
        int maxFreq = Integer.MIN_VALUE;

        for(int right = 0; right < s.length(); right++){
            
            char c = s.charAt(right);
            map.put(c , map.getOrDefault(c , 0)+1);
            
            int currFreq = map.get(c);
            maxFreq = Math.max(maxFreq , currFreq );

            while((right - left + 1) - maxFreq > k){

                char leftChar = s.charAt(left);
                map.put(leftChar , map.get(leftChar)-1);

                if(map.get(leftChar) == 0){
                    map.remove(leftChar);
                }
                left++;
            }

            maxWindow = Math.max(maxWindow , (right - left + 1));
        }
        return maxWindow;
    }
}