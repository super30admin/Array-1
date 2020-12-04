# Time Complexity - O(N)

# Space Complexity - O(1)

# Did this code successfully run on Leetcode : No

# Any problem you faced while coding this : No

# Approach
# I calculate my intermediate product while treaversing from left - right and store it in array. then I traverse in
# reverse and compute the reverse product.

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if nums == None or len(nums) == 0:
            return 0

        result = []
        product = 1
        for i in range(len(nums)):
            result.append(product)
            product *= nums[i]

        product = 1

        for i in range(len(nums) - 1, 0, -1):
            product = product * nums[i]
            result[i - 1] = result[i - 1] * product

        return result


