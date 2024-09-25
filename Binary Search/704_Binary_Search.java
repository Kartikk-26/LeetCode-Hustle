//Porblem Statement no : 704 
//Porblem Statement Topic : Binary Search
//This was a simple binary search question in which we divide the array in 2 parts and if have the targer number which is less than mid than we will delete the right side and if it more than mid than we will delete the left side and accordingly adjust the start and stop 


class Solution {
    public int search(int[] nums, int target) {
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
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}