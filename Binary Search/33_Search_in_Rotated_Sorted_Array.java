//Porblem Statement no : 33 
//Porblem Statement Topic : Search in Rotated Sorted Array

class Solution {
    public int search(int[] nums, int target) {
       int start = 0;
       int end = nums.length-1;

       while(start<=end){
        int mid = (start + end )/2;

        //If mid = target than return mid 
        if(nums[mid]==target){
            return mid;
        }

        //If start number is less tha middle number to srt the first part
        else if(nums[start]<=nums[mid]){
            if(target>=nums[start] && target<nums[mid]){
                end = mid -1 ;
            }
            else{
                start = mid + 1 ;
            }
        }

        // To sort the second part 
        else{
            if(target>=nums[mid] && target<=nums[end]){
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
       }
       return -1; 
    }
}