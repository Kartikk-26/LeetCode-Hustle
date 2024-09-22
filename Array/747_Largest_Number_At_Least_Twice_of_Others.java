//Porblem Statement no : 747 
//Porblem Statement Topic : . Largest_Number_At_Least_Twice_of_Others_


class Solution
{
    public  int dominantIndex(int[] nums) {
       int n =nums.length;// to store array length
       int max=0;//to store max element of array
       int k=0;// to store index of max element
      for(int i=0;i<n;i++)// to find max element of nums array
      {
          if(nums[i]>max)
          {
              max=nums[i];
            k=i;
          }
      }
     
      int m=max/2;// cheak if there is any element greater than max/2 
      for(int i=0;i<n;i++){
            if(nums[i]==max)
            {
                continue;
            }
          if(nums[i]>m){
              return -1;// if there is any element greater than max/2 than return -1
          }
      }
      return k;//if there is no element greater than max/2 than return index of max =k
    }
    
}