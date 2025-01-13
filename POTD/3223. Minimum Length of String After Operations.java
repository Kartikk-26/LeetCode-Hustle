//Date : 13.01.2025
//Porblem Statement no : 3223.                        
//Porblem Statement Topic :    Minimum Length of String After Operations

class Solution {
    public int minimumLength(String s) {
        int [] charfrequency = new int[26];
        
        //This variable will store the result computed by the method
        int totallength = 0;
        
        //the input string s is converted to a character array using .toCharArray()
        for(char c : s.toCharArray()){
            charfrequency[c - 'a']++;
        }

        //This loop iterates over each frequency value in charfrequency
        for(int frequency : charfrequency){
            //If the frequency is 0 (i.e., the character is not present in s), it skips the iteration.
            if(frequency == 0){
                continue;
            }
            
            //If frequency % 2 == 0, add 2 to totallength
            else if(frequency%2==0){
                totallength += 2;
            }

            //If the frequency is odd, the code intends to add 1 to totallength
            else{
                totallength+=1;
            }
        }
        return totallength;
    }
}