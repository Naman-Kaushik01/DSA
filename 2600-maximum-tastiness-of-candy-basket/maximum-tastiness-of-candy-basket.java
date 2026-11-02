class Solution {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int low = 1;
        int high = price[price.length - 1] - price[0];

        while(low <= high){
            int mid = (low + high) >> 1;
            if(isTasty(price , k , mid)){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return high;
    }
    public boolean isTasty(int prices[] , int k , int mid){
        int canSell = 1;
        int prev = prices[0];
        for(int i = 1; i < prices.length; i++){
            if(prices[i] - prev >= mid){
                canSell ++;
                prev = prices[i];
            }
            if(canSell == k){
                return true;
            }
        }
        return false;
    }
}