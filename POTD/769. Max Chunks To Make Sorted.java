//Date : 1.12.2024
//Porblem Statement no : 769.                      
//Porblem Statement Topic :  Max Chunks To Make Sorted


class Solution {
    public int maxChunksToSorted(int[] arr) {
        // hecks if the input array arr is either null or has no elements
        if (arr == null || arr.length == 0)
            return 0;

        int count = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            //Updating the Maximum Value
            max = Math.max(max, arr[i]);
            if (max == i)
                count++;
        }

        return count;
    }
}