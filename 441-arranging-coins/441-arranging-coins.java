class Solution {
    public int arrangeCoins(int n) 
    {
      int ans=0;
        int i=1;
        while(n>0)
        {

            n=n-i;
            if(n>=0)
                ans=i;
            i++;
        }
        return ans;
        
        
    }
}