class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int k = x, rev =0;
        while(k>0)
        {
            int d = k%10;
            rev = rev*10 + d;
            k = k/10;
        }
        if(rev == x)
        {
            return true;
        }
        return false;
    }
}