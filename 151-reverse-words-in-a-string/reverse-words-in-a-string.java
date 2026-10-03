class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {

            //  remove all trailing spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) break;

            // i is now at the end of a word
            int j = i;

            // Find beginning of word
            while (j >= 0 && s.charAt(j) != ' ') {
                j--;
            }

            // Add word
            if (ans.length() > 0) {
                ans.append(' ');
            }

            ans.append(s, j + 1, i + 1);

            // Continue from before this word
            i = j - 1;
        }

        return ans.toString();
    }
}