//Porblem Statement no : 724 
//Porblem Statement Topic : Find Pivot Index

class Solution {
    public int pivotIndex(int[] nums) {
        int Rsum = 0;

        //Using for each loop to store all elements of nums in Rsum
        for( int ele : nums){
            Rsum += ele;
        }

        int Lsum = 0;

        // Compare Left sum and right sum to check pivot index 
        for(int i=0; i<nums.length; i++){
            Rsum -= nums[i];

            if(Rsum==Lsum){
                return i;
            }
            Lsum += nums[i];
        }
        return -1;
    }
}