class Solution {
    public int longestOnes(int[] nums, int k) {
        int res = 0, sum = 0, i = 0, n = nums.length;

        for (int j = 0; j < n; j++) {
            sum += nums[j];
            while ((j-i+1)-sum > k) {
                sum -= nums[i];
                i++;
            }
            res = Math.max(res, j-i+1);
        }

        return res;
    }
}