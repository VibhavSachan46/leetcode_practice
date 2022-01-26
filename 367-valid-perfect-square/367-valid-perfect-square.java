class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 0)
            return false;
        if(num ==1 )
            return true;
        int start=2;
        int end=num;
        while(start<=end)
    {
       // int mid = start+end/2;
        int mid = (start+ (end-start)/2);
        
        if(mid==num/mid && num%mid==0)
        {
            return(true);
        }
        else if (mid>num/mid)
        {
            end=mid-1;
        }
        else
        {
            start=mid+1;
        }
    }
    
        return false;
    }
}