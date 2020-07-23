# Leetcode 238. Product of Array Except Self

# Time Complexity :  O(n) where n is the size of the array

# Space Complexity : O(1)

# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Approach: Condition: Calculate the product of elements left to index and store them in result array
# Calculate the right product in reverse and multiply the right product at an index to corresponding
# left product in the result array. Return the result

# Your code here along with comments explaining your approach

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        if not nums or len(nums) == 0:
            return [0]
        result = [1]*len(nums)

        prod = 1
        for i in range(len(nums)):
            result[i] = prod
            prod *= nums[i]

        prod = 1
        for i in range(len(nums)-1, -1, -1):
            result[i] *= prod
            prod *= nums[i]

        return result
