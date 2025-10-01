# Time Complexity : O(n)   # We make two passes through the array
# Space Complexity : O(1)  # Ignoring the output array, we only use a few variables
# Did this code successfully run on Leetcode : Yes
# Approach:
# 1. First, we build a prefix product array that stores product of all numbers before each index.  
# 2. Then, we traverse from the right and multiply each index with the product of all numbers after it.  
# 3. This way, each element at index i holds product of all nums except itself.
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        
        # Result array that will store our final answer
        result = [0] * n
        
        # Step 1: Build prefix product (product of elements to the left of i)
        result[0] = 1 # For first element, there are no numbers on the left
        rp = 1 # Running product (prefix product so far)
        
        # Traverse left to right
        for i in range(1, n):
            # Multiply running product with previous element
            rp = rp* nums[i - 1]
            # Store prefix product at result[i]
            result[i] = rp 

        # Step 2: Build suffix product (product of elements to the right of i)    
        rp = 1 # Reset running product for suffix

        # Traverse right to left
        for i in range(n - 2, -1, -1): # Start from second last element
            # Multiply running product with next element
            rp = rp * nums[i + 1]
            # Multiply current prefix product with suffix product
            result[i] = result[i] * rp
        return result
        