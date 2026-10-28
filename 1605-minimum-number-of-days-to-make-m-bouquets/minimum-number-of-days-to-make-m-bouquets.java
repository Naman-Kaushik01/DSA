class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low = 1;
        int high = 0;
        for(int i = 0; i < bloomDay.length; i++){
            //low = Math.min(low , bloomDay[i]);
            high = Math.max(high, bloomDay[i]);
        }

        if((long) m*k > bloomDay.length){
            return -1;
        }
        while(low < high){
            int mid = (high + low) >> 1;

            if(canMake(bloomDay , m , k , mid)){
                high = mid;
            }else{
                low = mid + 1;
            }
        }
        return low;
        
    }
    public boolean canMake(int[] bloomDay , int m , int k , int mid){
        int bouqetCount = 0;
        int currentFlower = 0;

        for(int i = 0; i < bloomDay.length; i++){
            if(bloomDay[i] <= mid){
                currentFlower ++;
                if(currentFlower == k){
                    bouqetCount ++;
                    currentFlower = 0;
                }
            }else{
                currentFlower = 0;
            }
            
        }
        return bouqetCount >= m;
    }
}