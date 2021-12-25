class Solution {
    public boolean isPalindrome(int x) {
        int sum=0, rem=0 , k = x;
        while(k!=0)
        {
            rem= k%10;
            sum = sum*10 + rem; 
            k= k/10;
        }
        if(sum == x && x>=0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}