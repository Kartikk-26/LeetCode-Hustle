//Date : 16.01.2025
//Porblem Statement no : 2429.                        
//Porblem Statement Topic :  2425. Bitwise XOR of All Pairings

class Solution {
    public int xorAllNums(int[] A, int[] B) {
        int x = 0 , y = 0;
        
        //For each loop for A 
        for(int a: A){
            x^=a;
        }

        //For each loop for B 
        for(int b: B){
            y^=b;
        }

        return (A.length % 2 * y) ^ (B.length % 2 * x);
    }
}