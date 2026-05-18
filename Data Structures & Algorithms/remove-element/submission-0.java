class Solution {
    public int removeElement(int[] nums, int val) {
       //brute force way - double for loop
        //outer loop - check for nums[i] = val,
        //inner loop - move all the elements to the left, then insert the val at the last index
        //This solution is in order, but O(n^2) time complexity, very bad because worse case can be 100^2 = 10^4

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