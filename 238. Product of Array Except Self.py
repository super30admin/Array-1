"""
Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input:  [1,2,3,4]
Output: [24,12,8,6]
Constraint: It's guaranteed that the product of the elements of any prefix or suffix of the array (including the whole array) fits in a 32 bit integer.

Note: Please solve it without division and in O(n).

Follow up:
Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
"""
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        """
        Generate a Running product to the left.
        Generate a running product from right.
        multiply both left and right values to get output.
        """
        # Run Time Complexity : O(2N) => O(N) for two for loops
        # Space Complexity : O(1) => here in question output array is not considered as extra space.
        len_nums = len(nums)
        right = 1
        left = [1] * len_nums
        for i in range(1, len_nums):
            left[i] = left[i-1] * nums[i-1]
            
        for i in range(len_nums-2, -1, -1):
            right *= nums[i+1]
            left[i] = left[i] * right
        return (left)
