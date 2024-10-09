//Porblem Statement no : 66
//Porblem Statement Topic : Plus One

class Solution {
    public int[] plusOne(int[] digits) {
        // Size of array digits
        int n = digits.length;       

        // to check the if last value is not 9
        if(digits[n-1]!=9){
            digits[n-1] = digits[n-1] + 1;     
            return digits;
        }

        // reassigning the value 
        digits[n-1] = 0; 

        // if last second value is 9
        for(int i = n-2;i>=0;i--){   
            if(digits[i]!=9){
                digits[i] = digits[i] + 1;
                return digits;
            }
            digits[i]=0;
        }

        //storing in new array
        int [] ans = new int [n+1];
        ans[0] = 1;
        return ans;


    }
}