class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> b = new ArrayList<>();
        int[] dummy = new int[candies.length];
        int n = candies.length;
        for(int i=0;i<n;i++){
            dummy[i] = candies[i];
        } 
        Arrays.sort(dummy);
        int max = dummy[n-1];
        for(int i=0;i<n;i++){
            if((candies[i]+extraCandies)>=max){
                b.add(true);
            }
            else{
                b.add(false);
            }
        }
        return b;

    }
}