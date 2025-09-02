//leetcode
//274. H-Index

class Solution {
    public int hIndex(int[] citations) {
   
   int max=0;
   int n = citations.length;
   for(int h=1;h<=n;h++)
   {
    int count =0;
    for(int j=0;j<n;j++)
    {
          if(citations[j]>=h)
          {
            count++;
          }

    }
       if(count>=h)
          {
            max=Math.max(max,h);
          }
   
   }
 return max;
    }
}
