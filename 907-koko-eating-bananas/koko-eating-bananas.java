class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for(int pile : piles){
            high = Math.max(pile , high);
        }
        
        while(low < high){
            int mid = (high + low) >> 1;
            if(canEat(piles , mid , h)){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
    }
    public boolean canEat(int[] piles , int k , int h){
        long totalHour = 0;
        for(int i = 0; i < piles.length; i++){
            totalHour +=( (long)piles[i] + (long)k -1) / k;
        }
        return totalHour <= h;
    }
}