class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> intMap = new HashMap();
        for(int i=0; i<nums.length; i++)
        {
            int targetNum = target-nums[i];
            if(intMap.containsKey(targetNum)) 
            {
                if(i<intMap.get(targetNum))
                return new int[]{i,intMap.get(targetNum)};
                else
                return new int[]{intMap.get(targetNum),i};
            }
            intMap.put(nums[i],i);
        }
        return new int[]{};
    }
}
