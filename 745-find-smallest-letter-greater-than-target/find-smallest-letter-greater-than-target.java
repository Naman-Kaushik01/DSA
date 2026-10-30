class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0;
        int high = letters.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (letters[mid] <= target) {
                // If the current letter is less than or equal to target,
                // the answer must be to the right.
                low = mid + 1;
            } else {
                // If the current letter is greater than target,
                // it could be the answer, but let's look for a smaller one on the left.
                high = mid - 1;
            }
        }

        // After the loop, 'low' points to the smallest character greater than 'target'.
        // If 'low' is equal to letters.length, the modulo operator wraps it back to 0.
        return letters[low % letters.length];
    }
}
