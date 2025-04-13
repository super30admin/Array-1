#  Time Complexity : O(n)
#  Space Complexity : O(1)
#  Did this code successfully run on Leetcode : Yes
#  Three line explanation of solution in plain english :  We find the product of all the elements on the left of the current element. We store it in the results array. We find the product of all the elements on the right and multiply it with the left sided product already stored in the results array

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if(nums is None or len(nums) == 0):
            return nums
        
        n = len(nums)
        rp = 1
        result = [1] * n

        # l to r
        for i in range(1, n):
            rp *= nums[i - 1]
            result[i] = rp
        
        rp = 1
        # r to l
        for i in range(n - 2, -1, -1):
            rp *= nums[i + 1]
            result[i] = result[i] * rp

        return result