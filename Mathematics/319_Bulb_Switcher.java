//Porblem Statement no : 319
//Porblem Statement Topic : Bulb Switcher

class Solution {
    public int bulbSwitch(int n) {
        int count = 0;
        int i = 1;

        while(i*i<=n){
            count++;
            i++;
        }
        return count;
    }
}