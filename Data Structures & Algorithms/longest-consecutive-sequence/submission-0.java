class Solution {
    public int longestConsecutive(int[] nums) {
      if (nums.length == 0) return 0;

       Set<Integer> set = new HashSet<>();
      for (int num : nums){
        set.add(num);
      }

        int count = 1;
        
       for(int i = 0; i < nums.length; i++){
        int temp = 1;
        if (!set.contains(nums[i]-1)){
          
          int j = 1;
          while (set.contains(nums[i]+j)){
            temp++;
            j++;
          } 
          count = Math.max(count,temp);
         
        }
          
       }

      return count;
    }
}
