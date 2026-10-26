class Solution {
    public List<Integer> maxPrimes(int n, int s) {
        List<Integer> list = new ArrayList<>();

        // Step 1: Sieve of Eratosthenes
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime , true);

        isPrime[0] = false;
        if(n >= 1){
            isPrime[1] = false;
        }
        for(int i = 2; i * i <= n; i++){
            if(isPrime[i]){
                for(int j = i * i; j <= n; j += i){
                    isPrime[j] = false;
                }
            }
        }

        // Step 2: Select primes while the sum stays <= s
        long sum = 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                if (sum + i > s) {
                    break;
                }

                list.add(i);
                sum += i;
            }
        }

        return list;
    }
}