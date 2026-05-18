class Solution {
    public int removeElement(int[] nums, int val) {
       //brute force way - extra array
        //Optimized solution: just do a one pass and track the number of elements that not equal to val
        int len = nums.length;
        int k = 0;

        for (int i = 0; i < len; i++) {
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    
    }
}