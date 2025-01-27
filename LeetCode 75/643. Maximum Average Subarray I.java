class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
    //    /A loop iterates over the first k elements of the array nums
       for(int i = 0; i < k; i ++) 
           sum += nums[i];
       int maxSum = sum;
       
       //Sliding Window Technique
       //A loop starts from index k and runs until the end of the array (nums.length).
       for(int i = k; i < nums.length; i ++) {
           //his updates the sum by adding the next element (nums[i]) and removing the first element of the previous subarray (nums[i - k]
           sum += nums[i] - nums[i - k];
           maxSum = Math.max(maxSum, sum);
       }
       //Return the Maximum Average
       return (double)maxSum / k;
    }
}