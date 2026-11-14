class Solution {
    public int minimumSumSubarray(List<Integer> list, int l, int r) {
        int minSum = Integer.MAX_VALUE;
        int n = list.size();
        for(int i = 0; i < n ; i++){
            int sum = 0;
            for(int j = i; j < n; j++){

                sum += list.get(j);

                int len = j - i + 1;

                if((len >= l && len <= r) && sum > 0 ){
                    minSum = Math.min(sum , minSum);
                }
            }
            
        }
        if(minSum == Integer.MAX_VALUE) return -1;
        return minSum;
    }
}