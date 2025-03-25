'''
The algorithm computes the product of all elements except the current one by using two passes: one for prefix products (from left to right) and one for postfix products (from right to left).
In the first pass, it fills the result array with the product of all elements to the left of the current index.
In the second pass, it multiplies each value in the result array by the product of all elements to the right of the current index, giving the final result.

Time Complexity: O(n)
Space Complexity: O(1)
'''

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = [1] * len(nums)

        prefix = 1

        for i in range(len(nums)):
            result[i] = prefix
            prefix *= nums[i]
        
        postfix = 1

        for i in range(len(nums)-1,-1,-1):
            result[i] *= postfix
            postfix = postfix * nums[i]

        return result