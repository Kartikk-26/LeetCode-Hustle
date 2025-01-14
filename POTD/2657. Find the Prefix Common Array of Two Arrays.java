//Date : 14.01.2025
//Porblem Statement no : 2657.                        
//Porblem Statement Topic :  Find the Prefix Common Array of Two Arrays

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] result = new int[n];
        int[] count = new int[n + 1];
        int common = 0;
        
        //Starts a for loop that iterates through the indices of the arrays from 0 to n-1.
        for(int i = 0; i < n; i++) {
            count[A[i]]++;  // Increments the count of the element A[i] in the count array
            
            //Checks if the count of the current element A[i] becomes 2.
            if(count[A[i]] == 2) common++;
            count[B[i]]++;
            
            //Checks if the count of the current element B[i] becomes 2.
            if(count[B[i]] == 2) common++;
            result[i] = common;
        }
        return result;
    }
}