//Date : 5.11.2024
//Porblem Statement no : 2914. 
//Porblem Statement Topic : Minimum Number of Changes to Make Binary String Beautiful


class Solution {
    public int minChanges(String s) {
        char currentChar = s.charAt(0);
        int cc = 0;  // Count of consecutive characters
        int mcr = 0; // Minimum changes required

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == currentChar) {
                cc++;
                continue;
            }
            
            if (cc % 2 == 0) {
                cc = 1; // Start counting new sequence
            } else {
                cc = 0;
                mcr++;
            }
            
            currentChar = s.charAt(i); // Update current character
        }

        return mcr;
    }
}
