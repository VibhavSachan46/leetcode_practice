class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) 
    {
        int c = 0;
        for(List<String> itm : items)
        {
            if("type".equals(ruleKey) && itm.get(0).equals(ruleValue))
            {
                c++;
            }
            else if("color".equals(ruleKey) && itm.get(1).equals(ruleValue))
            {
                c++;
            }
            else if("name".equals(ruleKey) && itm.get(2).equals(ruleValue))
            {
                c++;
            }
        }
        return c;
    }
}