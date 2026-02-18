# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Approach : Calculate left product and right product for each element.

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        ans = [1] * len(nums)

        rp = 1
        for i in range(1, len(nums)):
            rp *= nums[i-1]
            ans[i] = rp
        
        rp = 1
        for i in range(len(nums) - 2, -1, -1):
            rp *= nums[i+1]
            ans[i] = ans[i] * rp

        return ans