class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if (len(s) == 0):
            return 0

        max = 1
        left = 0
        right = 1
        window = s[left:right]
        while right < len(s):
            new = s[right]
            while s[left:right].count(new) > 0:
                left += 1
            right += 1
            window = s[left:right]
            if len(window) > max:
                max = len(window)
        
        return max
