//Porblem Statement no : 540 
//Porblem Statement Topic : Single Element in a Sorted Array


class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length == 1){      // to check if array is empty
            return nums[0];
        }
        else if ( nums[0]!=nums[1]){  // to check if first element is not equal to second element 
            return nums[0];
        }
        else if (nums[nums.length-1]!= nums[nums.length-2]){   // to check last and last second element
            return nums[nums.length-1];
        }

        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = (start + end ) / 2;
            if(nums[mid]!= nums[mid-1] && nums[mid]!=nums[mid+1]){ // To check if mid element is not equal to left and right num
                return nums[mid];
            }
            else if(mid%2==1){  //if index is odd
                if(nums[mid-1]==nums[mid]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else{  //if index is even 
                if(nums[mid]==nums[mid+1]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}