//Date : 03.12.2024
//Porblem Statement no : 2109.        
//Porblem Statement Topic : Adding Spaces to a String

class Solution {
    public String addSpaces(String s, int[] spaces) {
        // N stores the length of the string
        int n = s.length();
        // m tores the number of positions where spaces need to be added
        int m = spaces.length;
        char[] chrs = new char[n+m];

        // To keep track of how many spaces have been added so far
        int j=0;
        for(int i=0; i<n; i++){
            //If current position in the new array (i + j) matches the space position
            if(j<m && i+j == spaces[j]+j){
                chrs[i+j]=' ';
                j++;
            }
            //The current character from s (s.charAt(i)) is copied to the next position in the 
            chrs[i+j]= s.charAt(i);
        }

        //Converted back to a string and returned
        return new String(chrs);
        
    }
}