class Solution {
    public String capitalizeTitle(String title) {
        char ch[] = title.toCharArray();
        int i = 0;
        int n = ch.length;

        while(i < n){
            int j = i;
            while(j < n && ch[j] != ' '){
                j++;
            }

            int len = j - i;
            if(len <= 2){
                for(int k = i; k < j; k++){
                    ch[k] = Character.toLowerCase(ch[k]);
                }
            }else{
                ch[i] = Character.toUpperCase(ch[i]);
                for(int k = i + 1; k < j; k++){
                    ch[k] = Character.toLowerCase(ch[k]);
                }
            }
            i = j + 1;
        }
        return new String(ch);
    }
}