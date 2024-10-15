//Porblem Statement no : 225. 
//Porblem Statement Topic : Implement Stack using Queues
// In this i made 2 queue named (main & helper ) and i added data to main than send it to helper and than added again to main and then send the data from helper to main and same goes on till the entry occurs and for delete i deleted the first element and peek peek the last element 

class MyStack {
    private Queue<Integer> main;
    private Queue<Integer> helper;
    public MyStack() {  
        main = new LinkedList<>();
        helper = new LinkedList<>();
    }
    
    public void push(int x) {
        
        // move all element from main to helper 
        while(main.size()>0){
            helper.add(main.remove());
        }
        
        // now add element x in main 
        main.add(x);

        //now move all element from helper to main 
        while(helper.size()>0){
            main.add(helper.remove());
        }
    }
    
    public int pop() {
        return main.remove();
    }
    
    public int top() {
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
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */