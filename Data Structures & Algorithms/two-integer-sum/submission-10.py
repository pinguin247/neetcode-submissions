class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        #Brute Force - Continuously loop through for all possible combinations of sum of 2 integers
        length = len(nums)
        for i in range(length):
            for j in range(i + 1, length):
                if nums[i] + nums[j] == target:
                    return [i, j]
                
            