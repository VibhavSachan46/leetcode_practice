class Solution {
    public int maxRepeating(String sequence, String word) {
        int c = -1;
        String s = "";
        while(sequence.contains(s))
        {
           c++;
           s += word;
        }
        return c;
    }
}