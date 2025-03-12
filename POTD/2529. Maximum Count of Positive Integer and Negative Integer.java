class Solution {
    public int maximumCount(int[] nums) {
        int l = 0, r = nums.length - 1, mid;
        
        // Find the first positive number using binary search
        while (l <= r) {
            mid = (l + r) / 2;
            if (nums[mid] <= 0) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        
        int pos = nums.length - l; // Number of positive numbers
        
        // Move l backward to skip zeros
        --l;
        while (l >= 0 && nums[l] == 0) {
            --l;
        }
        int neg = l + 1; // Number of negative numbers

        return Math.max(pos, neg);
    }
}