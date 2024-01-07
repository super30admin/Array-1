#time complexity: O(n)
#space complexity: O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
#Approach: We will be using two pointers to calculate the left and right products and store them in the result array.   
#1. Initialize the result array with 1.
#2. Calculate the left products and store in the result array.
#3. Calculate the right products and multiply with the result array.
#4. Return the result array.
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
      
        n = len(nums)
        
        # Initialize the result array with 1
        result = [1] * n
        
        # Calculate left products and store in the result array
        left_product = 1
        for i in range(1, n):
            left_product *= nums[i - 1]
            result[i] *= left_product
        
        # Calculate right products and multiply with the result array
        right_product = 1
        for i in range(n - 2, -1, -1):
            right_product *= nums[i + 1]
            result[i] *= right_product
        
        return result