class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length > nums2.length)
        {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        int lo=0;
        int hi= nums1.length ;
        int comb = nums1.length + nums2.length;
        while(lo <= hi)
        {
            int partx = (lo+hi)/2;
            int party = (comb + 1)/2 - partx;
            
            int leftx = getMax(nums1 , partx);
            int rightx = getMin(nums1 , partx);
            
            int lefty = getMax(nums2 , party);
            int righty = getMin(nums2 , party);
            
            if(leftx <= righty && lefty <= rightx)
            {
                if(comb%2==0)
                {
                    return (Math.max(leftx ,lefty) + Math.min(rightx , righty)) / 2.0;
                }
                else
                {
                    return Math.max(leftx,lefty);
                }
            }
            if(leftx > righty)
            {
                hi = partx-1;
            }
            else{
                lo = partx + 1;
            }
            
        }
        return -1;
    }
    
    private int getMax(int[] arr , int partition)
    {
        if(partition == 0)
        {
            return (int)Double.NEGATIVE_INFINITY;
        }
        else{
            return arr[partition -1];
        }
    }
    
    private int getMin(int[] arr , int partition)
    {
        if(partition == arr.length)
        {
            return (int)Double.POSITIVE_INFINITY;
        }
        else{
            return arr[partition];
        }
    }
}