class Solution {
    public int maxProfit(int[] prices) {
        //buy day must be before sell day
        int ptr1 = 0;
        int ptr2 = 1;
        int currSum = 0;
        int maxProfit = 0;
        //one pass
        while(ptr2 > ptr1 && ptr2 < prices.length){
            if(prices[ptr2] - prices[ptr1] < 0){
                currSum = 0;
                ptr1 = ptr2;
            }else{
                currSum = prices[ptr2] - prices[ptr1];
            }
            maxProfit = Math.max(maxProfit, currSum);
            ptr2++;
        }

        return maxProfit;
    }
}
