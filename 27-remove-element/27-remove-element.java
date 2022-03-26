class Solution {
    public int removeElement(int[] nums, int val) {
        int s=0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            if(nums[i] != val)
            {
                if(s != i)
                {
                    nums[s++] = nums[i];
                }
                else{
                    s++;
                }
            }
        }
        return s;
    }
}