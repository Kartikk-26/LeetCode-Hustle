class Solution {
    public String reverseWords(String s) {
        //trim the input string
        String[] str = s.trim().split("\\s+");

        //Initialise the Input string
        String out = "";

        //Iterarte withing the string
        for(int i = str.length - 1; i > 0; i--){
            out += str[i] + " ";
        }

        //Append the first word
        return out + str[0];

    }
}