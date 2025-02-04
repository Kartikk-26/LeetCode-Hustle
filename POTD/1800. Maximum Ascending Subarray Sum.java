//Date : 04.02.2025
//Porblem Statement no : 1800.                              
//Porblem Statement Topic :  Maximum Ascending Subarray Sum

class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = nums[0];
        int current = nums[0];
        int n = nums.length;

        // A loop to itertrate for array
        for(int i=1; i<n; i++){
            
            //If 1 digit is smaller than second digit than we will add that number to current
            if(nums[i-1]<nums[i]){
                current = current + nums[i];
            }

            //if first digit is not smaller than that is the max element comparing with second element
            else{
                max = Math.max(max,current);
                current  = nums[i];
            }
        }
        max = Math.max(max,current);
        return max;
    }
}