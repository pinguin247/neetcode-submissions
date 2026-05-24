class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len*2];
        int j = 0;
        for (int i = 0; i < len*2; i++) {
            ans[i] = nums[j];
            j++;
            if(j>len -1) j = 0;
        }
        return ans;
    }
}