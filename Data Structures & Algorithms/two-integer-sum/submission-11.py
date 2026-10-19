class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        #Brute Force - Continuously loop through for all possible combinations of sum of 2 integers
        length = len(nums)
        # for i in range(length):
        #     for j in range(i + 1, length):
        #         if nums[i] + nums[j] == target:
        #             return [i, j]

        #Optimized - lets use nums[j] = target - nums[i], so we can save the complement in a HashMap
        hashMap = {}
        for i in range(length):
            if target - nums[i] in hashMap:
                return [hashMap[target - nums[i]], i]
            hashMap[nums[i]] = i
            
            