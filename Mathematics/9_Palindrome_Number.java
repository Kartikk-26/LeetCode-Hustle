//This is the direct solution which i solved on Leetcode 
//Problem Statement Number : 9

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        int n = x;
        int RevNum = 0;

        while(n>0){
            int d = n%10;
            n = n/10;
            RevNum = RevNum*10 + d;
        }

        if(RevNum == x){
            return true;
        }
        else{
            return false;
        }

        
    }
}