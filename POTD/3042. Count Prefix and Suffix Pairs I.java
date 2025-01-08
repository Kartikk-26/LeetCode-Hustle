//Date : 08.01.2025
//Porblem Statement no : 3042.                                  
//Porblem Statement Topic : Count Prefix and Suffix Pairs I

class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int n = words.length , count = 0;

        //A nested loop is used to iterate over all unique pairs of strings in the words array.
        for(int i=0; i<n; ++i){
            for(int j=i+1; j<n; ++j){
                if(isPrefixAndSuffix(words[i], words[j])){
                    count++;
                }
            }
        }
        return count;
    }

    //A helper method to check if str1 is both a prefix and a suffix of str2
    private boolean isPrefixAndSuffix(String str1, String str2){
        int n1 = str1.length(), n2 = str2.length();
        
        //If str1 is longer than str2, it cannot be a prefix or a suffix, so return false.
        if(n1>n2){
            return false;
        }
        
        //str2.substring(0, n1) extracts the first n1 characters from str2 (prefix) and checks if it equals str1.
        //str2.substring(n2-n1) extracts the last n1 characters from str2 (suffix) and checks if it equals str1.
        return str2.substring(0,n1).equals(str1) && str2.substring(n2-n1).equals(str1);
    }

}