class Solution {
    public int hammingDistance(int x, int y) {
        int count = 0;
        // simply we are comparing elements at the ith bit of x and y is equal or not
        for(int i = 0; i < 31; i++){
            if((x & (1<<i)) != (y &(1<<i))){
                count++;
            }
        }
        return count;
    }
}