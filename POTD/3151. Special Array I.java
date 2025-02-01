//Date : 01.02.2025
//Porblem Statement no : 3151.                             
//Porblem Statement Topic : Special Array I

class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        //Loop to iterarte the nums array
        for(int i=1; i<n; i++){
            // if a number is even and previous number to it is also even
            if((nums[i] % 2) == (nums[i-1]%2)){
                return false;
            }
        }
        return true;
    }
}