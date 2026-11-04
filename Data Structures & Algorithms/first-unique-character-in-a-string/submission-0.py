class Solution:
    def firstUniqChar(self, s: str) -> int:
        #use a set to store character seen before

        freq = {}

        for i in range(len(s)):
            freq[s[i]] = freq.get(s[i], 0) + 1

        for i in range(len(s)):
            if freq.get(s[i]) == 1:
                return i
        return -1;
        