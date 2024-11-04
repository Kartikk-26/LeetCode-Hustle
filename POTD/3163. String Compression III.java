//Date : 4.11.2024
//Porblem Statement no : 3163. 
//Porblem Statement Topic : String Compression III


class Solution {
    public String compressedString(String word) {
        //Make strijg builder as we have to play with strings
        StringBuilder sb = new StringBuilder();
        int len = 1;

        //To check if current value is equal to next value 
        for(int i=0; i<word.length()-1; i++){
            if(word.charAt(i)== word.charAt(i+1)){
                len++;
                if(len>9){
                    sb.append(len-1);
                    sb.append(word.charAt(i));
                    len = 1;
                }
            }
            else{
                sb.append(len);
                sb.append(word.charAt(i));
                len = 1;
            }
        }
        //Delete the last value as we take the loop till word.length()-1
        sb.append(len);
        sb.append(word.charAt(word.length()-1));

        //now return the string builder string to normal string 
        return sb.toString();
    }
}