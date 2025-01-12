//Date : 12.01.2025
//Porblem Statement no : 2116.                         
//Porblem Statement Topic :   Check if a Parentheses String Can Be Valid

class Solution {
    public boolean canBeValid(String s, String locked) {
        int n = s.length();
        //Check the even condition
        if(n%2!=0){
            return false;
        }

        //Making the two stack for storing ( & ) brackets
        Stack<Integer> stack = new Stack<>(); //for 0 and locked 
        Stack<Integer> unlocked = new Stack<>(); // for 1 and locked

        for(int i=0; i<n; i++){
            //making the character
            char ch = s.charAt(i);
            char state = locked.charAt(i);

            if(state == '0'){
                unlocked.push(i);
            }
            else if(ch == '('){
                stack.push(i);
            }
            else{
                if(!stack.isEmpty()){
                    stack.pop();
                }
                else{
                    if(!unlocked.isEmpty()){
                        unlocked.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }

        //If both stack are not empty pop the elements
        while(!stack.isEmpty() && !unlocked.isEmpty() && stack.peek()< unlocked.peek()){
            stack.pop();
            unlocked.pop();
        }

        return (stack.isEmpty());
    }
}