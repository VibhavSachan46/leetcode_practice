class Solution {
    public int peakIndexInMountainArray(int[] arr) 
    {
        int start = 0;
        int end = arr.length-1;
        while(start < end)
        {
            
        int mid = start + (end- start)/2;
            
           // Implemented Case 2 
        if(mid+1 < arr.length &&  arr[mid] > arr[mid+1]) // Now u r in decreasing part of array 
            
            {
                end = mid;
            }
           // Implemented Case 1
            else if((mid+1 < arr.length) && arr[mid] < arr[mid+1]) // Now u r in increaing part of arry
            {
                start = mid+1;
            }
        }
        return start;
    }
}