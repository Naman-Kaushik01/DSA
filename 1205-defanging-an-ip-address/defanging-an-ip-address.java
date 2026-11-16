class Solution {
    public String defangIPaddr(String s) {
     StringBuilder sb = new StringBuilder();
     int i = 0;
     int n = s.length();
     while(i < n){
        if(s.charAt(i) == '.'){
            sb.append('[');
            sb.append(s.charAt(i));
            sb.append(']');
        }else{
            sb.append(s.charAt(i));
        }
        i++;
     }  
     return sb.toString(); 
    }
}