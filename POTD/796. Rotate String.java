//Date : 3.11.2024
//Porblem Statement no : 796
//Porblem Statement Topic : Rotate String


class Solution {
    public boolean rotateString(String s, String goal) {
        //Check if length of both string are equal or not
        if(s.length()!=goal.length()){
            return false;
        }
        //Convert Srting to String Builder
        StringBuilder sb = new StringBuilder(s);

        //Check if string are equal or not 
        for(int i=0; i<s.length(); i++){
            if(sb.toString().equals(goal)){
                return true;
            }
            char ch = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(ch);
        }
        return false;
    }
}