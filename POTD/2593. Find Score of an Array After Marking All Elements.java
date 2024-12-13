//Date : 13.12.2024
//Porblem Statement no : 2593.                
//Porblem Statement Topic :  Find Score of an Array After Marking All Elements


class Solution {
    public long findScore(int[] nums) {
        int n = nums.length;
        int[][] dp = new int[n][2];

        //A loop runs from 0 to n-1. It fills the dp array with two pieces
        for (int i = 0; i < n; i++) {
            dp[i][0] = nums[i];
            dp[i][1] = i;
        }

        Arrays.sort(dp, (a, b) -> a[0] - b[0]);

        // A boolean array marked is created with n elements
        boolean[] marked = new boolean[n];
        long result = 0;

        //A for-each loop is used to iterate through each element (arr) in the sorted dp array.
        for (int[] arr : dp) {
            int val = arr[0];
            int ind = arr[1];

            if (!marked[ind]) {
                result += val;

                //The current index ind is marked as processed by setting marked[ind] to true.
                marked[ind] = true;
                if (ind > 0)
                    marked[ind - 1] = true;
                if (ind < n - 1) 
                    marked[ind + 1] = true;
            }
        }

        return result;
    }
}