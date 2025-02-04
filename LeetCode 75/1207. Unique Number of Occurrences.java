class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i:arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        HashSet<Integer> map1 = new HashSet<>();
        for (int i:map.values()){
            if (!map1.add(i)){
                return false;
            }
        }

        return true;
    }
}