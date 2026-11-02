class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        #Optimized solution - we use a hashmap to store frequency map of the characters
        #Base case: if length not the same
        if len(s) != len(t):
            return False

        freqs = {}
        freqt = {}
        for c in s:
            freqs[c] = freqs.get(c, 0) + 1

        for c in t:
            freqt[c] = freqt.get(c, 0) + 1

        if freqs == freqt:
            return True
        
        return False