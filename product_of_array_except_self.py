"""
Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

Example:

Input: [1,2,3,4] Output: [24,12,8,6] Note: Please solve it without division and in O(n).

Follow up: Could you solve it with constant space complexity? (The output array does not count as extra space for the purpose of space complexity analysis.)
"""

"""
Time Complexity: O(n)
Space Complexity: O(1) (only result array is created)

"""


def product_array(nums):
    result = [1] * len(nums)
    left, right = 1, 1

    for i in range(len(nums)):
        result[i] *= left
        left *= nums[i]

    for i in range(len(nums)-1, -1, -1):
        result[i] *= right
        right *= nums[i]

    return result


print(product_array([1, 2, 3, 4]))
print(product_array([-1, 1, 0, -3, 3]))
