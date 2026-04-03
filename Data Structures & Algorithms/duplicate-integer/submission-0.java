class Solution {
    public boolean hasDuplicate(int[] nums) {
     Hashtable<Integer,Integer> table = new Hashtable<>();

     int n = nums.length;
     for ( int i = 0; i < n;i++)
     {
        if (table.containsKey(nums[i])){
            return true;
        }
        
            table.put(nums[i],1);
        
     }
     return false;

        
    }
}