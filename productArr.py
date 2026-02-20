# Time Complexity : O(n)
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach: First store prefix products in the result array.
# Then traverse from right while maintaining a suffix product and multiply it with current result.

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [1] * len(nums)
        for i in range(1,len(nums)):
            res[i] = res[i - 1] * nums[i - 1]
        suff = nums[-1]
        for i in range(len(nums) - 2,-1,-1):
            res[i] *= suff
            suff   *= nums[i]
        return res