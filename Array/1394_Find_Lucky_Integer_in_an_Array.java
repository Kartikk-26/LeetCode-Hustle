//Porblem Statement no : 1394 
//Porblem Statement Topic : Find_Lucky_Integer_in_an_Array_


class Solution {
    public int findLucky(int[] arr) {
        int Rnum = -1;
        for(int i = 0 ; i<arr.length; i++){
            int count = 0;
            int nums = arr[i];
            for(int j=0; j<arr.length; j++){
                int numIn = arr[j];
                if(nums == numIn){
                    count++;
                }
            }
            if(nums == count){
                if(nums>Rnum){
                    Rnum = nums;
                }
            }
        }
        return Rnum;
    }
}