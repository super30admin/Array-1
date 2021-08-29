# // Time Complexity : O(n)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Three line explanation of solution in plain english
# In Forward pass,  we calculate the  product of elements to the right of current element.
# In the backward pass we multiply the left products to previously calculated values to get result.
# Product of left elements * Product of right elements = Result at current index
# // Your code here along with comments explaining your approach

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        if nums == None and n == 0:
            return [0]
        rp = 1
        result = [0] * n
        result[0] = 1
        for i in range(1, n):
            rp = rp * nums[i - 1]
            result[i] = rp
        rp = 1  # reset
        for i in range(n - 2, -1, -1):
            rp = rp * nums[i + 1]
            result[i] = result[i] * rp
        return result
