//Date : 02.12.2024
//Porblem Statement no : 1455.       
//Porblem Statement Topic : Check If a Word Occurs As a Prefix of Any Word in a Sentence


class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] arr = sentence.split(" ");               
        int n=arr.length;
        
        for(int i=0; i<n; i++){
            if(arr[i].startsWith(searchWord)){                
                return i+1;
            }
        }

        return -1;
    }
}