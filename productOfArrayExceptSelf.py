from typing import List

# Time Complexity: O(3n), where n is the length of the input array
# Space Complexity: O(2n), 1 array to store left product and 1 array to store right product
# Did this code successfully run on Leetcode : Yes
# Approach:
# We will be using the running product technique
# 1. We store the product of all the left elements on the left of the current element in an lp array
# 2. We store the product of all the left elements on the right of the current element in an rp array
# 3. Finally, we multiply both arrays and store the products of elements in a resultant array
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        # Initialize lp and rp arrays
        lp = [1] * n
        rp = [1] * n

        # Store the left product at each index
        for i in range(1, n):
            lp[i] = nums[i-1] * lp[i-1]
        # Store the right product at each index
        for i in range(n-2, -1, -1):
            rp[i] = nums[i+1] * rp[i+1]

        # Initialize the result array
        res = [0] * n
        # Multiply elements and each index in lp and rp arrays and store them in the res array
        for i in range(n):
            res[i] = (lp[i] * rp[i])
        # Finally, return the reslut array
        return res


# Space optimized approach
# Time Complexity: O(2n), where n is the length of the input array
# Space Complexity: O(1), not counting the outpur array
# Approach:
# 1. We go over the input array twice.
# 2. One, to get the left product for each element, and then again, to multiply the right product with the obtained left product.
# 3. We keep track of the left product and right product with the variables prod and tmp
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        # Initialize the running product
        prod = 1
        tmp = 1
        # Initialize the result array
        res = [0] * n
        # Go over the input array from left to right to obtain the left product at each index
        # Maintain the running product in 'prod'
        for i in range(n):
            prod = prod * tmp
            res[i] = prod
            tmp = nums[i]
        
        # Go over the input array from right to left to obtain the right product at each index
        # Maintain the running product in 'prod'
        prod, tmp = 1, 1
        for i in range(n-1, -1, -1):
            prod = prod * tmp
            res[i] *= prod
            tmp = nums[i]

        # Finally, return the resultant array
        return res