# Time Complexity : O(n)
# Space Complexity : O(1) --> result space doesn't matter
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
#
#
# Your code here along with comments explaining your approach

class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        n = len(nums)
        rp = 1
        result = [1] * n
        for i in range(1, n):
            rp *= nums[i-1]
            result[i] = rp
        rp = 1
        for i in range(n-2, -1, -1):
            rp *= nums[i+1]
            result[i] = rp * result[i]
        return result


check = Solution()
print(check.productExceptSelf([1, 2, 3, 4]))