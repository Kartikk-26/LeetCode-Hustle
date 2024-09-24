//Porblem Statement no : 1800 
//Porblem Statement Topic : Maximum_Ascending_Subarray_Sum


class Solution {
    public int maxAscendingSum(int[] nums) {
        int max = nums[0];
        int current = nums[0];

        for(int i = 1;i<nums.length; i++){
            if(nums[i-1]<nums[i]){
                current = current + nums[i];
            }
            else{
                max = Math.max(max , current);
                current = nums[i];
            }
        }
        max = Math.max (max, current);
        return max;
    }
}