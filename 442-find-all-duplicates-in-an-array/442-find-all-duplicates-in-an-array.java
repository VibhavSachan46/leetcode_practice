class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<>();
        for(int x: nums)
        {
            if(set.contains(x))
            {
                al.add(x);
                set.remove(x);
            }
            else
            {
                set.add(x);
            }
        }
        
        return al;
    }
}