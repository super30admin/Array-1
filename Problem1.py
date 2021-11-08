# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode :
# Three line explanation of solution in plain english

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        p = 1
        n = len(nums)
        output = []
        for i in range(0,n):
            output.append(p)
            p = p * nums[i]
        p = 1
        for i in range(n-1,-1,-1):
            output[i] = output[i] * p
            p = p * nums[i]
        return output