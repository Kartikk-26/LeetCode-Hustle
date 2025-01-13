class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Check if the concatenated strings are equal in both orders
        if (!(str1 + str2).equals(str2 + str1)) {
            return ""; // If not, there is no common divisor
        }

        // Find the GCD of the lengths of the two strings
        int gcdLength = gcd(str1.length(), str2.length());
        
        // Return the substring of str1 up to the GCD length
        return str1.substring(0, gcdLength);
    }

    // Helper method to calculate GCD of two numbers using the Euclidean algorithm
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
