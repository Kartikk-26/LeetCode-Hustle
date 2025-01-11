class Solution {
    public String mergeAlternately(String word1, String word2) {
        //Made a new String Builder
        StringBuilder result = new StringBuilder();
        int i = 0;

        //Check The main condition of string
        while(i<word1.length() || i<word2.length()){
            //Remove the first letter from Word1 and append in result string
            if(i<word1.length()){
                result.append(word1.charAt(i));
            }

            ////Remove the first letter from Word2 and append in result string
            if(i<word2.length()){
                result.append(word2.charAt(i));
            }
            i++;
        }
        //return the new result string
        return result.toString();
    }
}