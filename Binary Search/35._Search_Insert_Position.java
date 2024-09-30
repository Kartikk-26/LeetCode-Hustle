//Porblem Statement no : 35 
//Porblem Statement Topic : Search Insert Position
// In this i just used the binray serach to find the element and returned the index and if its not three then returned the start as it has be returned as per the question


class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start+end)/2;

            if(nums[mid]==target){
                return mid;
            }
            else if (target>nums[mid]){
                start = mid+1;
            }
            else if(target<nums[mid]){
                end = mid-1;
            }
            
        }
        return start;
    }
}