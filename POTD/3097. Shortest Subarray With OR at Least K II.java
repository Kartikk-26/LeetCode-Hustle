//Date : 10.11.2024
//Porblem Statement no : 3097. 
//Porblem Statement Topic : Shortest Subarray With OR at Least K II

class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int n = nums.length;
        int start = 0;
        int w_or = 0;
        int ans = Integer.MAX_VALUE;

        int[] bitCount = new int[32];

        for(int i = 0; i<n; i++){
            w_or|=nums[i];

            for(int j = 0; j<32; j++){
                if((nums[i]&(1<<j)) != 0){
                    bitCount[j]++;
                }
               }

            while(start<=i && w_or>=k){
              ans = Math.min(ans, i-start+1);
              
              for(int t = 0; t<32; t++){
                    if((nums[start]&(1<<t)) != 0){
                        bitCount[t]--;

                        if(bitCount[t] == 0){
                            w_or = w_or & (~(1<<t));
                        }
                    }
                 }
               start++;
            }
        }

        return ans == Integer.MAX_VALUE? -1 : ans;
    }
}