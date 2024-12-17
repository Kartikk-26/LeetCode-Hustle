//Date : 17.12.2024
//Porblem Statement no : 2182.                    
//Porblem Statement Topic :  Construct String With Repeat Limit


class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        int[] freq = new int[26];

        for (char c : s.toCharArray())
            //Converts the character to its corresponding index
            freq[c - 'a']++;

        int pendingLetterIndex = -1;
        //Creates a StringBuilder object sb
        StringBuilder sb = new StringBuilder();

        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0)
                continue;

            if (pendingLetterIndex > 0) {
                //f there is a pending character, appends the current character ('a' + i) to the StringBuilder
                //and decreases its frequency by 1
                sb.append((char) ('a' + i));
                freq[i]--;
                i = pendingLetterIndex;
                pendingLetterIndex = -1;

            } else {
                for (int j = 0; j < repeatLimit && freq[i] > 0; j++, freq[i]--)
                    sb.append((char) ('a' + i));

                //After appending the current character, if its frequency is still greater than 0 (i.e., not
                //fully used), sets pendingLetterIndex to i + 1
                if (freq[i] > 0)
                    pendingLetterIndex = i + 1;
            }
        }
        
        //Converts the StringBuilder object sb 
        return sb.toString();
    }
}