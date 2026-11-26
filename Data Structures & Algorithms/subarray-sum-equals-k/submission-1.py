class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        result = 0
        curSum = 0
        prefix = {0:1}
        for i in  range(len(nums)):
            curSum += nums[i]
            result += prefix.get(curSum - k, 0)
            prefix[curSum] = prefix.get(curSum, 0) + 1
        return result