class Solution {
    public int reverseDegree(String s) {
        int degree = 0;
        for(int i = 0; i < s.length(); i++){
            int revPosition = 'z' - s.charAt(i) + 1;
            int position = i + 1;
            degree += position * revPosition;
        }
        return degree;
    }
}