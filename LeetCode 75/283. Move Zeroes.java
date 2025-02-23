class Solution {
    public void moveZeroes(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }

        int insertPos = 0;
        for(int num: nums){
            if(num!=0){
                nums[insertPos++] = num;
            }
        }

        while(insertPos < nums.length){
            nums[insertPos++] = 0;
        }
    }
}