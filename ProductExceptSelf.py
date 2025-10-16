# Time Complexity : O(n) where n is the length of the strings
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

'''
My approach:
Calculate the left product for each element, then multiply it with the right running product for each element.
'''
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        
        # Starting with 0s to clarify setting first element to 1
        leftProduct = [0] * n 
        leftProduct[0] = 1
        
        # Calculate left running products
        for i in range(1, len(nums)):
            leftProduct[i] = leftProduct[i-1] * nums[i-1]

        # Keep running counter of right product and multiply with left
        rProduct = nums[len(nums)-1]
        for i in range(len(nums)-2, -1, -1):
            leftProduct[i] = rProduct * leftProduct[i]
            rProduct = rProduct * nums[i]

        return leftProduct
