//Porblem Statement no : 334 
//Porblem Statement Topic : Increasing Triplet Subsequence

class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for(int i = 0 ; i<nums.length; i++){
            int test = nums[i];
            if(first>=test){
                first = test;
            }
            else if(second>=test){
                second = test;
            }
            else if(third >=test){
                third = test;
                return true;
            }
        }
        return false;
    }
}