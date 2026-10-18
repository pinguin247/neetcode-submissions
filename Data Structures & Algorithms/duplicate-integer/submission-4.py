class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:

        length = len(nums)

        # #Brute force -- iterate through the array n times
        # for i in range(length): #check for every element in the array
        #     for j in range(i + 1, length): #Check for duplicate for the rest of the array
        #         if nums[i] == nums[j]: return True

        # return False

        #Optimized Solution -- use a Set
        seen = set()
        for i in range(length):
            if nums[i] in seen:
                return True
            seen.add(nums[i])

        return False



            