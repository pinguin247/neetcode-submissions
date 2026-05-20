class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] index = null;
        //Brute Force - O(n^2)
       for (int i = 0; i < nums.length; i++) {
           for (int j = i + 1; j < nums.length; j++) {
               if (nums[i] + nums[j] == target) {
                   index = new int[]{i, j};
                   return index;
               }
           }
       }
       return index;
    }    
}
