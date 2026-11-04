class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        #Optimized - use a hashmap to store frequency
        freq = {}
        n = len(nums)

        for i in range(n):
            freq[nums[i]] = freq.get(nums[i], 0) + 1

            if freq.get(nums[i]) > n//2:
                return nums[i]