# Submitted by : Aryan Singh_RN12MAY2023
# Time Complexity : O(n)
# Space Complexity : Average : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :No

class Solution:
    '''
    - Output at a particular index is the product of all elements towards left and product of all elements towards right.
    - Maintain running product towards right in one iteration (in an array)
    - Update by multiplying the product by calculating running product towards left.
    '''
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        # output array:
        result = [1 for i in range(len(nums))]
        # for left product:
        product = 1
        result[0] = 1
        for i in range(1, len(nums)):
            result[i] = nums[i - 1] * result[i - 1]
        # for right side
        for i in range((len(nums) - 2), -1, -1):
            product *= nums[i + 1]
            result[i] *= product

        return result