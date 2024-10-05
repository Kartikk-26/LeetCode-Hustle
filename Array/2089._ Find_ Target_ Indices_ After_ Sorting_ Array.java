//Porblem Statement no : 2089
//Porblem Statement Topic :  Find_ Target_ Indices_ After_ Sorting_ Array_


class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int num = 0;
        int tcount = 0;

        for(int ele : nums){
            if(ele==target){
                tcount++;
            }
            else if(ele<target){
                num++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        while(tcount>0){
            ans.add(num);
            num++;
            tcount--;
        }

        return ans;
    }
}