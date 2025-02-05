//Date : 05.02.2025
//Porblem Statement no : 1790.                         
//Porblem Statement Topic :  Check if One String Swap Can Make Strings Equal

class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        //If both string are excacly similar
        if(s1.equals(s2)){
            return true;
        }

        int first = -1 , second = -1, count = 0;

        //Now to check the first and last element to increase the count 
        for(int i=0; i<s1.length(); i++){
            // /If the characters at the same index in s1 and s2 are not equal, we increase the count of mismatches.
            if(s1.charAt(i)!= s2.charAt(i)){
                count++;
                //If it's the first mismatch, store its index in first
                if(count==1){
                    first = i;
                }
                //If it's the second mismatch, store its index in second
                else if(count==2){
                    second = i;
                }
                //more than 2 mismatch
                else{
                    return false;
                }
            }
        }
        // return the swapped mismatched value
        return count ==2 && s1.charAt(first) == s2.charAt(second) && s1.charAt(second) == s2.charAt(first);

    }
}