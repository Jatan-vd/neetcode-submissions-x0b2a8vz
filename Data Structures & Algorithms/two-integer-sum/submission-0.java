class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer,Integer> meh = new HashMap<>();
    int n = nums.length;
    
      for (int i = 0; i < n; i++ )
      {
        int dif  = target - nums[i];

        if(meh.containsKey(dif))
        return new int[] {meh.get(dif),i};

        meh.put(nums[i],i);
      } 
      return new int[] {}; 
    }
}
