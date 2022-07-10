'''
## Problem 238: Product of array except self.

## Author: Neha Doiphode
## Date:   07-09-2022

## Description
    Given an integer array nums,
    return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
    You must write an algorithm that runs in O(n) time and without using the division operation.

## Examples
    Example 1:
        Input: nums = [1,2,3,4]
        Output: [24,12,8,6]

    Example 2:
        Input: nums = [-1,1,0,-3,3]
        Output: [0,0,9,0,0]

## Constraints:
    2 <= nums.length <= 105
    -30 <= nums[i] <= 30
    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)

## Time complexity: O(n), array is traversed twice from left to right and right to left.

## Space complexity: O(1), no auxiliary space is used in the second approach. Space required for the result is not counted.
'''

from typing import List

def get_input():
    print("Enter the inetger array(with spaces): ", end = "")
    inp_list = input()
    inp_list = [int(value) for value in inp_list.split()]
    return inp_list

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        left = 1
        right = 1

        left_product = [None] * len(nums)
        right_product = [None] * len(nums)
        result = [None] * len(nums)

        for i in range(len(nums)):
            left_product[i] = left
            left *= nums[i]

        for i in range(len(nums) - 1, -1, -1):
            right_product[i] = right
            right *= nums[i]

        result = [(left * right) for left, right in zip(left_product, right_product)]
        return result


    def productExceptSelf_Without_Extra_Space(self, nums: List[int]) -> List[int]:
        left = 1
        right = 1

        [1, 2, 3, 4]
        left =   [1,  1, 2, 6]
        right = [24, 12, 4, 1]

        result = [None] * len(nums)

        # First element has no element to its left.
        # If we exclude the element itself then, the product will be 1.
        result[0] = 1
        running_product = 1
        for i in range(1, len(nums)):
            running_product = running_product * nums[i - 1]
            result[i] = running_product

        running_product = 1
        for i in range(len(nums) - 2, -1, -1):
            running_product = running_product * nums[i + 1]
            result[i] *= running_product


        return result

# Driver code
solution = Solution()
inp_array = get_input()
print(f"Input array: {inp_array}")
print(f"Output array with product except self: {solution.productExceptSelf(inp_array)}")
