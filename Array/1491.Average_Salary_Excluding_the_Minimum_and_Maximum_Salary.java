//Porblem Statement no : 1491.
//Porblem Statement Topic : Average Salary Excluding the Minimum and Maximum Salary
// In this i checked the element is max and min and than i add there sum and excledued from array and than add the remainjng value and took the avearge 


class Solution {
    public double average(int[] salary) {
        int max = salary [0];
        int min = salary [0];
        int sum = salary [0];

        for(int i=1; i<salary.length;i++){
            if(max<salary[i]){
                max = salary[i];
            }
            else if(min>salary[i]){
                min = salary[i];
            }
            sum = sum + salary[i];
        }

        sum = sum - min - max;
        double ans = (double)sum/(salary.length-2);
        return ans;
        
    }
}