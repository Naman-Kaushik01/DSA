class Solution {
    public int maximumSum(int[] arr) {
        int noDel = arr[0];
        int oneDel = Integer.MIN_VALUE;
        int res = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int prevNoDel = noDel;

            // Maximum sum without deletion
            noDel = Math.max(arr[i], noDel + arr[i]);

            // Maximum sum with one deletion
            if (oneDel == Integer.MIN_VALUE) {
                oneDel = prevNoDel;
            } else {
                oneDel = Math.max(prevNoDel, oneDel + arr[i]);
            }

            // Update the overall maximum
            res = Math.max(res, Math.max(noDel, oneDel));
        }

        return res;
    }
}