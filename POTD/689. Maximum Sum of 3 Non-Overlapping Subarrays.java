//Date : 28.12.2024
//Porblem Statement no : 689.                           
//Porblem Statement Topic : Maximum Sum of 3 Non-Overlapping Subarrays

class Solution {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k) {
        int n = nums.length, sum1 = 0, sum2 = 0, sum3 = 0;
        int max1 = 0, max12 = 0, max123 = 0;
        int index1 = 0, index12_1 = 0, index12_2 = k;
        int[] ans = {0, k, 2 * k};

        //Loops through the first k elements to calculate the initial sums for the three subarrays
        for (int i = 0; i < k; i++) {
            sum1 += nums[i];
            sum2 += nums[i + k];
            sum3 += nums[i + 2 * k];
        }
        max1 = sum1;
        max12 = sum1 + sum2;
        max123 = sum1 + sum2 + sum3;

        
        //Starts a loop to slide the window through the array while ensuring enough space for three subarrays
        for (int i = 0; i <= n - 3 * k; i++) {
            //For each new position of i, update the sums by
            if (i > 0) {
                sum1 = sum1 - nums[i - 1] + nums[i + k - 1];
                sum2 = sum2 - nums[i + k - 1] + nums[i + 2 * k - 1];
                sum3 = sum3 - nums[i + 2 * k - 1] + nums[i + 3 * k - 1];
            }

            //Updates max1 and index1 if the new sum1 is greater than the previous max1
            if (sum1 > max1) {
                max1 = sum1;
                index1 = i;
            }

            //Updates max12 and the indices of the two subarrays if the sum of max1 and sum2 is 
            //greater than the previous max12
            if (max1 + sum2 > max12) {
                max12 = max1 + sum2;
                index12_1 = index1;
                index12_2 = i + k;
            }

            //Updates max123 and the indices of the three subarrays if the sum of max12 and sum3 is greater than
            //the previous max123
            if (max12 + sum3 > max123) {
                max123 = max12 + sum3;
                ans = new int[]{index12_1, index12_2, i + 2 * k};
            }
        }

        //Returns the starting indices of the three subarrays with the maximum sum.
        return ans;
    }
}