//Date : 15.01.2025
//Porblem Statement no : 2429.                        
//Porblem Statement Topic :   Minimize XOR

class Solution {
    public int minimizeXor(int num1, int num2) {
        int setBits = Integer.bitCount(num2); //n & n-1;
        int bit = 31;
        int res = 0;

        while(bit>=0 && setBits>0){
            //Check if bit is set in num1 and if so set the bit in res
            if((num1 &(1 << bit ))!=0){
                res = res | (1 << bit);
                setBits--;
            }
            bit--;
        }
        bit = 0;

        while(setBits>0 && bit<=32){
            //Check if bit is set in num1 and if so set the bit in res
            if((num1 &(1 << bit ))==0){
                res = res | (1 << bit);
                setBits--;
            }
            bit++;
        }
        return res;
    }
}