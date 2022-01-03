# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : YES
# // Any problem you faced while coding this : No I solved this before 
# // Your code here along with comments explaining your approach
# Product except self
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = []
        p = 1
        for i in range(len(nums)):
            res.append(p)
            p *= nums[i]
        p = 1
        for i in range(len(nums)-1, -1, -1):
            res[i] *= p
            p *= nums[i]
        return res