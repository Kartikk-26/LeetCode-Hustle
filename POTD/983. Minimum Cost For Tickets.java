//Date : 31.12.2024
//Porblem Statement no : 983.                              
//Porblem Statement Topic : Minimum Cost For Tickets


class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int maxDay = days[days.length - 1];
        
        //A boolean array where travelDay[i] is true if day i is a travel day, and false otherwise.
        boolean[] travelDay = new boolean[maxDay + 1];

        //oops through each day in the days array as true to indicate that this day is a travel day
        for (int day : days)
            travelDay[day] = true;

        //An integer array to store the minimum cost of travel up to each day
        int[] dp = new int[maxDay + 1];
        dp[0] = 0;

        //Iterates through each day from 1 to maxDay.
        for (int i = 1; i <= maxDay; i++) {
            //f day i is not a travel day than the cost remains the same as the previous day (dp[i - 1)
            if (!travelDay[i]) {
                dp[i] = dp[i - 1];
                continue;
            }

            //Calculates the cost for a 1-day ticket, adding costs[0] to the cost up to the previous day.
            dp[i] = costs[0] + dp[i - 1];

            //f i - 7 < 0, it uses Math.max(0, i - 7) to ensure it doesn't access a negative index.
            dp[i] = Math.min(dp[Math.max(0, i - 7)] + costs[1], dp[i]);

            //Ensures the index doesn't go below 0 using Math.max(0, i - 30) days
            dp[i] = Math.min(dp[Math.max(0, i - 30)] + costs[2], dp[i]);
        }

        //Returns the minimum cost to cover all travel days
        return dp[maxDay];
    }
}