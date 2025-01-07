//Date : 07.01.2025
//Porblem Statement no : 1408.                                  
//Porblem Statement Topic :  String Matching in an Array

class Solution {
    ////Defines a public method string Matching
    public List<String> stringMatching(String[] words) {
        int n = words.length;
        
        //Creates an empty list ans of type String
        List<String> ans = new ArrayList<>();

        // Outer loop iterates over each word in the words array
        for(int i=0; i<n; ++i){
            //Inner loop iterates over every word in the array
            for(int j=0; j<n; ++j){
                //Checks two conditions
                if(i != j && words[j].contains(words[i])){
                    //If both conditions are true, the word at words[i] is added to the result list ans
                    ans.add(words[i]);
                    break;
                }
            }
        }

        //After all iterations, the list ans is returned as the output of the method.
        return ans;
    }
}