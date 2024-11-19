//Date : 19.11.2024
//Porblem Statement no : 2461.    
//Porblem Statement Topic : Maximum Sum of Distinct Subarrays With Length K


class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        //Initialize
        int n = nums.length;
        Set<Integer> elements = new HashSet<>();
        long currentSum = 0;
        long maxSum = 0;
        int begin = 0;

        //// Iterate through the array with the end pointer.
        for(int end=0; end<n; end++){
            if(!elements.contains(nums[end])){
                currentSum += nums[end];
                elements.add(nums[end]);

                // Check if the window size equals k
                if(end-begin+1 ==k){
                    maxSum = Math.max(maxSum , currentSum);
                    currentSum -= nums[begin];
                    elements.remove(nums[begin]);
                    begin++;
                }
            }
            else{
                // If the current element is a duplicate:
                while(nums[begin]!= nums[end]){
                    currentSum -= nums[begin];
                    elements.remove(nums[begin]);
                    begin++;
                }
                begin++;
            }
        }
        return maxSum; 
    }
}