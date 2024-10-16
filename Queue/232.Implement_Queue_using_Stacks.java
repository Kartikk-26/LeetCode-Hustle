//Porblem Statement no :  232. 
//Porblem Statement Topic : Implement Queue using Stacks
//Problem Statement Description : In this i made another two stack named helper and main and moved all element from 
//main to helper than added element x and moved all from helper to main.


class MyQueue {
    private Stack<Integer> main;
    private Stack<Integer> helper;

    public MyQueue() {  
        main = new Stack<>();
        helper = new Stack<>();
    }
    
    public void push(int x) {
        // Add all element of main to helper
        while(main.size()>0){
            helper.push(main.pop());
        }

        //Now add element to main stack 
        main.push(x);

        //Now move add element of helper to main
        while(helper.size()>0){
            main.push(helper.pop());
        }
    }
    
    public int pop() {
        return main.pop();
    }
    
    public int peek() {
        return main.peek();
    }
    
    public boolean empty() {
        if(main.size()==0){
            return true;
        }
        else{
            return false;
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
