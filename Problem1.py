# https://leetcode.com/problems/product-of-array-except-self/description/

## Problem 1

# Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the 
# elements of nums except nums[i].

# Example:

# Input: [1,2,3,4]
# Output: [24,12,8,6]
# Note: Please solve it without division and in O(n).

# Follow up:
# Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of 
# space complexity analysis.)

# Time Complexity : O(N)
# Space Complexity : O(1) = we are not using any extra space. It would be O(N), if we consider the output array as extra space as well
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach in three sentences only
# We use the prefix and postfix product to solve this. The intuition is based on if we take the product of numbers 
# to the left of a particular number and product of numbers to the right of a particular number, 
# we can get the product of numbers except the number itself. We can do the left product and then right product in the same single array

class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        # storing result
        prodArray = [0] * len(nums)
        # in prefix product first element would always be 1.
        prodArray[0] = 1

        # calculate prefix product. It will maintain the product of elements
        # to one index before the current
        # for that we can keep a running product
        rp = 1
        for i in range(1, len(nums)):
            # running product to one index before
            rp *= nums[i - 1]
            prodArray[i] = rp
            

        # now we calculate the postfix product. We can use a running
        # product variable to maintain the postfix product. We can directly
        # update the result array currently having our prefix product. No need to create separate array for 
        # postfix product
        # we can start from one index before
        rp = 1
        for i in range(len(nums) - 2, -1, -1):
            # running product to one index before from back
            rp *= nums[i + 1]
            prodArray[i] *= rp
        
        return prodArray


sol = Solution()
print(sol.productExceptSelf([1,2,3,4]))
print(sol.productExceptSelf([-1,1,0,-3,3]))