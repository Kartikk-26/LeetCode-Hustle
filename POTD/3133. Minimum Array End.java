//Date : 9.11.2024
//Porblem Statement no : 3133
//Porblem Statement Topic : Minimum Array End


class Solution {
    public long minEnd(int n, int x) {
        // Initialize
        long result = x;
        long remaning = n-1;
        long position = 1;

        // Loop until `remaining` becomes zero, indicating no more bits need to be added to `result`.
        while(remaning !=0){
            // Check if the current bit position in `x` is 0 (i.e., not set).
            if((x & position )== 0){
                // If the bit is 0, we add `(remaining & 1) * position` to `result`.
                // `(remaining & 1)` checks if the current bit of `remaining` is 1 or 0.
                // If it's 1, we add `position` to `result`, effectively setting this bit.
                result = result + (remaning & 1) * position;
                // Right shift `remaining` by one bit
                remaning >>=1;
            }
            // Left shift `position` to move to the next bit.
            position <<=1;
        }
        return result;
    }
}