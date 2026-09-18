class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        if((n & (n-1)) == 0) return true;
        return false;



          /*
        explanation : we have to count set bit , for every integer
        which is power of 2. there will be only one set bit.
        First approach : we can count set bit and if set bit count = 1 
        we can return true;
        Second approach : i observed that when we are doing n & n -1 we are
        gettin 0 
        */
    }
}