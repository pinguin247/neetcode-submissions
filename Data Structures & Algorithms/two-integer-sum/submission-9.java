class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Optimized Solution - use a Hashmap
        //3, 7-3 = 4 {3:0,
        //4, 7-4 = 3 {4: 1}
        int[] index = null;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff), i};
            }else{
                map.put(nums[i], i);
            }
        }
        return index;
    }
}
