//Date : 16.02.2025                        
//Porblem Statement Number & Topic : 1718. Construct the Lexicographically Largest Valid Sequence

class Solution {
    private int[] res;

    public int[] constructDistancedSequence(int n) {
        res = null;
        int[] arr = new int[2 * n - 1];
        boolean[] used = new boolean[n + 1];
        backtrack(n, 0, arr, used);
        return res;
    }

    private boolean backtrack(int n, int l, int[] arr, boolean[] used) {
        if (l == arr.length) {
            res = arr.clone();
            return true;
        }

        if (arr[l] != 0) return backtrack(n, l + 1, arr, used); // Skip occupied

        for (int num = n; num >= 1; num--) {
            if (used[num]) continue;

            int r = (num == 1) ? l : l + num;
            if (r < arr.length && arr[r] == 0) {
                arr[l] = num;
                arr[r] = num;
                used[num] = true;

                if (backtrack(n, l + 1, arr, used)) return true;

                arr[l] = 0;
                arr[r] = 0;
                used[num] = false;
            }
        }

        return false;
    }
}