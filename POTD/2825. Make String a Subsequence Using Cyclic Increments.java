//Date : 04.12.2024
//Porblem Statement no : 2825.         
//Porblem Statement Topic : Make String a Subsequence Using Cyclic Increments


class Solution {
    public boolean canMakeSubsequence(String source, String target) {
        int targetIdx = 0;
        int targetlength = target.length();

        // Usingfor-each loop, where currChar is each character of the source string
        //(convertinto a character array using toCharArray())
        for( char currChar : source.toCharArray()){
            //ensures that we are not exceeding the length
            if(targetIdx < targetlength && (target.charAt(targetIdx) - currChar + 26) %26 <=1){
                targetIdx++;
            }
        }
        return targetIdx == targetlength;
    }
}