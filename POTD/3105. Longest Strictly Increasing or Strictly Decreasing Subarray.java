//Date : 02.02.2025
//Porblem Statement no : 1752.                              
//Porblem Statement Topic : Check if Array Is Sorted and Rotated

class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int incLength = 1, decLength = 1, maxLength = 1;

        for (int pos = 0; pos < nums.length - 1; pos++) {
            if (nums[pos + 1] > nums[pos]) { // Strictly increasing
                incLength++;
                decLength = 1; // Reset decreasing sequence
            } else if (nums[pos + 1] < nums[pos]) { // Strictly decreasing
                decLength++;
                incLength = 1; // Reset increasing sequence
            } else { // Equal elements → Reset both
                incLength = 1;
                decLength = 1;
            }
            maxLength = Math.max(maxLength, Math.max(incLength, decLength));
        }
        
        return maxLength;
    }
}