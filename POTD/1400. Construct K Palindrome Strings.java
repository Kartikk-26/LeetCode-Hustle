//Date : 11.01.2025
//Porblem Statement no : 1400.                        
//Porblem Statement Topic :   Construct K Palindrome String

class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length() < k){
            return false;
        }
        else if(s.length()== k){
            return true;
        }

        //Find Frequency
        int count [] = new int[26];
        for(int i=0; i<s.length(); i++){
            count[s.charAt(i)-'a']++;
        }

        //Odd count 
        int c=0;
        for(int i=0; i<26; i++){
            if(count[i]%2!=0){
                c++;
            }
        }
        return (c<=k);
    }
}