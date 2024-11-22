//Date : 22.11.2024
//Porblem Statement no : 1072.       
//Porblem Statement Topic : Flip Columns For Maximum Number of Equal Rows


class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        //By Using HashMaps
        Map<String, Integer> patterns = new HashMap<>();
        for (int[] currentRow : matrix) {
            String row = "";
            for (int col = 0; col < currentRow.length; col++) {
                if (currentRow[0] == currentRow[col]) {
                    row += "T";
                } else {
                    row += "F";
                }
            }
            patterns.put(row, patterns.getOrDefault(row, 0) + 1);
        }
        int maxFrequency = 0;
        for (int freq : patterns.values()) {
            maxFrequency = Math.max(freq, maxFrequency);
        }
        return maxFrequency;
    }
}