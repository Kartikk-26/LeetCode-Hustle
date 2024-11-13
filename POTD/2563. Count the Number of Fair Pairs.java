//Date : 13.11.2024
//Porblem Statement no : 2563. 
//Porblem Statement Topic : Count the Number of Fair Pairs


class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        //Sort the array 
        Arrays.sort(nums);
        return countless(nums,upper) - countless(nums,lower-1);
    }

    //Function Countless
    private long countless(int[]nums , int value){
        int l=0, r = nums.length-1;
        long result = 0;
        while(l<r){
            int sum = nums[l] + nums[r];
            if(sum<=value){
                result += (r-l);
                l++;
            }
            else{
                r--;
            }
        }
        return result;
    }
}