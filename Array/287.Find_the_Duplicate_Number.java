//Porblem Statement no : 287.  
//Porblem Statement Topic : Find the Duplicate Number

class Solution {
    public int findDuplicate(int[] nums) {
        int ans = 0;

        //We made the number negative and checked if one number 
        //has negative gain that means this is that number
        for(int i=0; i<nums.length; i++){
            int ele = nums[i];
            ele = Math.abs(ele);

            if(nums[ele]>0){
                nums[ele]=-nums[ele];
            }
            else{
                ans = ele;
                break;
            }
        }
        return ans;
    }
}