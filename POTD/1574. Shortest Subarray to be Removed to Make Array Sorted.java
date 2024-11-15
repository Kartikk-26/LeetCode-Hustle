//Date : 15.11.2024
//Porblem Statement no : 1574.   
//Porblem Statement Topic : Shortest Subarray to be Removed to Make Array Sorted

class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;

        //Find the longest non decreasing prefix
        int l = 0;
        while(l+1<n && arr[l]<= arr[l+1]){
            l++;
        }

        //Find the longest non decreasing suffix
        int r = n-1;
        while(r>0 && arr[r-1]<=arr[r]){
            r--;
        }

        //if array is sorted 
        if(l == n-1){
            return 0;
        }

        // Find minimum length
        int result = Math.min(n-l-1,r);

        //Use two pointer to find smallest middle part
        int i=0 , j=r;
        while(i <= l && j<n){
            if(arr[i]<=arr[j]){
                result = Math.min(result,j-i-1);
                i++;
            }
            else{
                j++;
            }
        }

        return result;
    }
}