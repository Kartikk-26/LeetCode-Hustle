//Date : 26.01.2025
//Porblem Statement no : 2127.                          
//Porblem Statement Topic : Maximum Employees to Be Invited to a Meeting

class Solution {
    public int maximumInvitations(int[] favorite) {
        //list of n employees
        // favorite person : attend meeting only if they can sit next to them
        // favorite: [2,2,1,2] : 0 -> 2  , 1 -> 2 , 2-> 1, 3-> 2 : 0 -> 2 -> 1 : 3
        // favorite: [1,2,0] : 0 -> 1 , 1 -> 2, 2 -> 0 : 3
        // favorite: [3,0,1,4,1] : 0 -> 3 , 1 -> 0 , 2 -> 1 , 3 -> 4, 4 -> 1
        // 0 : 3 : 4  : 1 -> 4
        int n=favorite.length;

        int[] ins=new int[n];
        int[] deep=new int[n];
        int[] queue=new int[n];

        //step-1) Caculate the number of indegree of each nodes.

        for(int i=0;i<n;i++)
        {
            ins[favorite[i]]++;
        }
        
        //step-2) Insert in queue the node with indegree 0 for topological sorting.

        int l=0,r=0;
        for(int i=0;i<n;i++)
        {
            if(ins[i]==0)
              queue[r++]=i;
        }

        //step-3) Perform topological sort

        while(l<r)
        {
            int curr=queue[l++];
            int next=favorite[curr];
            deep[next]=Math.max(deep[next],deep[curr]+1);

            if(--ins[next]==0)
            {
                queue[r++]=next;
            }
        }

        //step-4) Process cycles and calculate results
        int smallCircles=0;
        int bigCircles=0;

        for(int i=0;i<n;i++)
        {
            if(ins[i]!=0)
            {
                ins[i]=0;
                int count=1;
                for(int j=favorite[i];j!=i;j=favorite[j])
                {
                    count++;
                    ins[j]=0;
                }

                if(count==2)
                {
                    smallCircles+=deep[i]+deep[favorite[i]]+2;
                }
                else
                {
                    bigCircles=Math.max(bigCircles,count);
                }
            }
        }

        return Math.max(smallCircles,bigCircles);

    }
}