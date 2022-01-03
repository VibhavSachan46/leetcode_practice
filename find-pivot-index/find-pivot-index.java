class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length == 1)
        {
            return 1;
        }
        
        int total =0;
        for(int i = 0 ; i< nums.length ; i++)
        {
            total = total + nums[i];
        }
        int leftsum = 0;
        for(int i =0 ; i< nums.length ; i++)
        {
            total = total - nums[i];
            if(total == leftsum)
            {
                return i;
            }
            leftsum = leftsum + nums[i]; 
        }
        return -1;
    }
}