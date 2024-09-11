//Porblem Statement no : 977 
//Porblem Statement Topic : Squares of a Sorted Array
//In this i have two pointers in my original array (start) and (end) and one pointer in final array (ptr) in which i will
//compare start and staop and if start square is bigger than i will push it the place of ptr and if its small than at the ptr -1 place 


class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] ans = new int [nums.length];

        int start =0;
        int end=nums.length-1;

        int ptr = ans.length-1;

        while(start<=end){
            int ss = nums[start] * nums[start];
            int es = nums[end] * nums[end];

            if(ss>es){
                ans[ptr] = ss;
                start++;
            }
            else{
                ans[ptr] = es;
                end--;
            }
            ptr --;
        }
        return ans;

    }
}