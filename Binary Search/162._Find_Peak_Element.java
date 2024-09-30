//Porblem Statement no : 162
//Porblem Statement Topic : Find_Peak_Element_

// In this question i used the approach of binary serach in which first i check the that 
// 1 : the length of array is 1 than return 0
// 2 : if first element is greater than second element than return 0
// 3 : if last element if greater than last second element return the last element 
// 4 : if mid element is gerater than (mid -1 && mid + 1) tha  return mid 
// 5 : if mid element is smaller than (mid -1 && mid + 1) than (start = mid + 1 ) else (end = mid -1 )


class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length == 1){
            return 0;
        }
        else if(nums[0]>nums[1]){
            return 0;
        }
        else if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }
        else{
            int start = 1;
            int end = nums.length-2;
            while(start<=end){
                int mid = (start + end )/2;
                if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                    return mid;
                }
                else if(nums[mid]<nums[mid+1]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            return -1;
        }
    }
}