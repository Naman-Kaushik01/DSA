class Solution {
    public int[] closestPrimes(int left, int right) {
        
        boolean prime[] = new boolean[right + 1];
        Arrays.fill(prime , true);

        for(int i = 2; i < prime.length; i++){
            if(prime[i] == true){
                for(int j = 2 * i; j < prime.length; j += i){
                    prime[j] = false;
                }
            }
        }

        List<Integer> ans = new ArrayList<>();
        int i = 0;
        
        for(int k = Math.max(2,left); k <= right; k++){
            if(prime[k] == true){
               ans.add(k);
            }
        }
        for(int a : ans){
            System.out.println(a);
        }

        int minDiff = Integer.MAX_VALUE;
        int result[] = {-1 , -1};

        for(int x = 1; x < ans.size(); x++){

            if(ans.get(x) - ans.get(x-1) < minDiff){
                
                minDiff = ans.get(x) - ans.get(x-1);

                result[0] = ans.get(x-1);
                result[1] = ans.get(x);
            }
        }
        return result;

    }
}