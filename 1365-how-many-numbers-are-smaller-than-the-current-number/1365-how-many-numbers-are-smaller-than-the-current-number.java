class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) 
    {
        int[] ans = new int[nums.length];
        int c=0;
        for (int i = 0; i < nums.length; i++)
        {
            for (int j = 0; j < nums.length; j++)
            {
                if(nums[i] > nums[j] && i!=j)
                {
                    c++;
                }

            }
            ans[i] = c;
            c=0;

        }
        return ans;
    }
}