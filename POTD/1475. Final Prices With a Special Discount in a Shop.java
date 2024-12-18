//Date : 18.12.2024
//Porblem Statement no : 1475.                     
//Porblem Statement Topic :  Final Prices With a Special Discount in a Shop

class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        //New Stack to store all integere and value 
        Stack<Integer> st = new Stack();

        for(int i=n-1; i>=0; i--){
            // Removing Elements from Stack which are greater than current value 
            while(!st.isEmpty() && st.peek()>prices[i]){
                st.pop();
            }

            //Get discount from the stack or 0 if no valid discount
            int discount;
            if(st.isEmpty()){
                discount = 0;
            }
            else{
                discount = st.peek();
            }

            //Pus the original prices before update 
            st.push(prices[i]);

            //Update the prices;
            prices[i] -= discount;
        }

        return prices;
    }
}