//Date : 16.12.2024
//Porblem Statement no : 3264.                   
//Porblem Statement Topic :  Final Array State After K Multiplication Operations I


class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        
        //Using bruteforce approach
        //The condition k-- > 0 decrements k by 1 after each iteration and checks if k is still greater than 0.
        while(k-- > 0){
            int num = nums[0]; //smallest value 
            int index = 0;

            for(int i=1; i<nums.length; i++){
                
                //Checks if the current element (nums[i]) is smaller than the current smallest value (num).
                if(nums[i]<num){
                    num = nums[i];
                    index = i;
                }
            }

            //multiplies the smallest element (nums[index]) by the given multiplier and updates the value
            nums[index] = nums[index] * multiplier;
        }
        return nums;
    }
}