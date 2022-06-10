'''
Time Complexity: O(n)
Space COmplexity: O(1)
Run on Leetcode: YES
'''
class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        result = [1] * len(nums)
        for index in range(1,len(nums)):
            result[index] = result[index-1] * nums[index-1]
        rProduct = 1
        for index in range(len(nums) - 2, -1, -1):
            rProduct *= nums[index+1]
            result[index] *= rProduct
        return result