class Solution {
    public boolean isPowerOfTwo(int n) {
        
        if(n <= 0) return false;
        int count = 0;
        while(n != 0){
            if((n & 1) == 1){
                count ++;   
            }
            n >>= 1;
        }

        return count == 1;


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