class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        HashSet<Integer> set = new HashSet<>();
            Arrays.sort(nums1);
        for(int num : nums2){
            // if num found in 1st array add it to set
            if(BinarySearch(nums1, num)){
                set.add(num);
            }
        }
        
        int[] ans = new int[set.size()];
        int i = 0;
        for(int elem: set)
            ans[i++] = elem;

        return ans;
    }
    
    boolean BinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return true;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}