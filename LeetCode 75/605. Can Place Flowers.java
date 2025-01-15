class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length; // Length of the flowerbed
        int i = 0; // Start iterating from the first plot

        // Loop through the flowerbed until all flowers are planted or the flowerbed is fully checked
        while (i < len && n > 0) {
            // If the current plot is already occupied, skip the next plot
            if (flowerbed[i] == 1) {
                i += 2;
            } 
            // If the current plot is empty, check if we can plant a flower here
            else if (i == len - 1 || flowerbed[i + 1] == 0) {
                // Plant a flower
                flowerbed[i] = 1;
                n--; // Decrease the number of flowers left to plant
                i += 2; // Skip the next plot to maintain the no-adjacent-flowers rule
            } 
            // If the next plot is occupied, skip two plots ahead
            else {
                i += 3;
            }
        }

        // Return true if all flowers were planted, otherwise false
        return n <= 0;
    }
}
