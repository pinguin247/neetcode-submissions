class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        # use a hashmap
        hashMap = {}
        length = len(nums)

        for i in range(0, length):
            hashMap[nums[i]] = nums[i] 
            
        if length > len(hashMap):
            return True
        else:
            return False
         