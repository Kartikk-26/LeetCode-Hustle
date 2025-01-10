//Date : 10.01.2025
//Porblem Statement no : 916.                               
//Porblem Statement Topic :  Word Subsets

class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] req = new int[26];
        
        //Loops through each word in words2
        for (String word : words2) {
            int[] cur = new int[26];
            
            //Loops through each character c in the current word by converting it to a character array
            for (char c : word.toCharArray()) {
                cur[c - 'a']++;
                req[c - 'a'] = Math.max(req[c - 'a'], cur[c - 'a']);
            }
        }
        
        //Creates an empty list ans to store the words from words1 that meet the required criteria.
        List<String> ans = new ArrayList<>();
        
        //Loops through each word in words1
        for (String word : words1) {
            int[] cur = new int[26];
            
            //Loops through each character c in the current word and increments its frequency in the cur array.
            for (char c : word.toCharArray()) cur[c - 'a']++;
            
            //Initializes a boolean variable isValid to true
            boolean isValid = true;
            for (int i = 0; i < 26; i++) {
                if (cur[i] < req[i]) {
                    isValid = false;
                    break;
                }
            }
            
            //If isValid is still true after the loop, it means the current word satisfies all conditions, so it is added to the ans list.
            if (isValid) ans.add(word);
        }
        
        //Returns the list ans, which contains all the valid words from words1
        return ans;
    }
}