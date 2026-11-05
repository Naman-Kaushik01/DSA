class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        // you have to do two steps only
        //STEP 1 : create difference array

        int diffArr[] = new int [n+2];
        for(int i = 0; i < bookings.length; i++){
            
            int first = bookings[i][0];
            int last = bookings[i][1];
            int seats = bookings[i][2];

            diffArr[first] += seats;
            diffArr[last+1] -= seats;
        }

        //STEP 2 : FIND SUM

        int ans[] = new int[n];
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += diffArr[i];
            ans[i-1] = sum;
        }
        return ans;
    }
}