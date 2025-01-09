//Date : 09.01.2025
//Porblem Statement no : 2185.                               
//Porblem Statement Topic : Counting Words With a Given Prefix

class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        
        //A for-each loop that iterates through each string in the words array.
        for(String word : words){
            //Checks if the current word starts with the prefix pref
            if(word.startsWith(pref)){
                count++;
            }
        }
        
        //Returns the final value of count, which is the total number of words in the words array that start with the prefix pref.
        return count;
    }
}