# Time Complexity : O(n)
# Space Complexity : O(1) extra space
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :


#  Your code here along with comments explaining your approach

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        r = [1 for i in range(len(nums))]

        for i in range(len(nums) - 2, -1, -1):
            r[i] = r[i + 1] * nums[i + 1]

        acc = nums[0]
        for i in range(1, len(nums)):
            r[i] *= acc
            acc *= nums[i]

        return r