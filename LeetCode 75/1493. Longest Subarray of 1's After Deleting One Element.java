class Solution {
    //Using sliding window approach
    public int longestSubarray(int[] nums) {
        //Declaration
        int n = nums.length;
        int left = 0;
        int zero = 0;
        int ans = 0;
        //int right = 0

        for(int right=0; right<n; right++){
            //incremanet the count of zero
            if(nums[right] == 0 ){
                zero++;
            }

            //adjust the slding window
            while(zero > 1){
                if(nums[left]==0){
                    zero--;
                }
                left++;
            }
            // Calculate the length of the current subarray and update the maximum length
            ans = Math.max(ans, right - left + 1 - zero);
        }

        //return the array
        return (ans == n) ? ans - 1 : ans;

    }
}