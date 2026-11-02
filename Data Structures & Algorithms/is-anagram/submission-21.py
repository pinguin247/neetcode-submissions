class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        #Brute force - start from each character, then count the frequency
        count = 0

        #base case: length not the same means definitely not valid anagram
        if len(s) != len(t):
            return False

        s2 = sorted(s)
        t2 = sorted(t)
        
        for i in range(len(s)):
            if s2[i] != t2[i]:
                return False
        return True
        