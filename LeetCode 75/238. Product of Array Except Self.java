class Solution {
    //Defines a method productExceptSelf 
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];
        int pre = 1;

        //First Loop: Calculate Prefix Products
        for(int i=0; i<n; i++){
            //Multiplies the current value of ans[i] (which contains the prefix product from the first loop) by pre
            ans[i] = pre;
            //Updates pre by multiplying it with nums[i]
            pre *= nums[i];
        }

        int post = 1;
        
        //Second Loop: Calculate Suffix Products and Combine
        for(int i=n-1; i>=0; i--){
            //Multiplies the current value of ans[i] (which contains the prefix product from the first loop) by post
            ans[i] *= post;
            ////Updates pre by multiplying it with nums[i]
            post*= nums[i]; 
        }
        return ans;
    }
}