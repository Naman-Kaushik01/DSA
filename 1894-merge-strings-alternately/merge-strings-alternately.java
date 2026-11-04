class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        String ans = "";
        int i = 0 , j = 0;
        while(i < n && j < m){
            ans += word1.charAt(i);
            ans += word2.charAt(j);
            i++;
            j++;
        }
        if(i < n){
            ans += word1.substring(i , n);
        }
        if(j < m){
            ans += word2.substring(j , m);
        }
        return ans;
    }
}