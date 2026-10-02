class Solution {
    public char findTheDifference(String s, String t) {
     List<Character> list = new ArrayList<>();
     for(char c : t.toCharArray()){
        list.add(c);
     }
     for(char c : s.toCharArray()){
        if(list.contains(c)){
            list.remove(Character.valueOf(c));
        }
     }
     char ans = list.get(0);
     return ans;
    }
}