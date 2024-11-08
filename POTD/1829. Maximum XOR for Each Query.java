//Date : 8.11.2024
//Porblem Statement no : 1829
//Porblem Statement Topic :  Maximum XOR for Each Query

class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int mask = (1 << maximumBit) - 1;
        int n = nums.length;
        int[] res = new int[n];
        int curr = 0;
        
        for(int i = 0; i < n; i++) {
            curr ^= nums[i];
            res[n-i-1] = ~curr & mask;
        }
        
        return res;
    }
}