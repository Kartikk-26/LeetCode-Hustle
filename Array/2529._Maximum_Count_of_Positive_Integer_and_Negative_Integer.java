//Porblem Statement no : 2529
//Porblem Statement Topic : Maximum_Count_of_Positive_Integer_and_Negative_Integer

//The approach uses binary search to find the count of negative and positive numbers in a sorted array. The lastNegative function finds the index of the last negative number, giving the count of negatives as lastNegative(nums) + 1. The firstPositive function finds the first positive number, with the count of positives as nums.length - firstPositive(nums). The solution then returns the maximum of the two counts.


class Solution {
    public int maximumCount(int[] nums) {
        int lastnegIndex = lastNegative(nums) + 1;
        int firstposIndex = nums.length - firstPositive(nums);
        return Math.max(lastnegIndex, firstposIndex);
    }

    public int lastNegative( int[] nums){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;

        while(start<=end){
            int mid = (start + end )/2;
            if(nums[mid]<0){
                ans = mid;
                start = mid + 1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }

    public int firstPositive( int[] nums){
        int start = 0;
        int end = nums.length-1;
        int ans = nums.length;

        while(start<=end){
            int mid = (start + end )/2;
            if(nums[mid]>0){
                ans = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ans;
    }





}