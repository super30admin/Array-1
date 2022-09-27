"""
https://leetcode.com/problems/product-of-array-except-self/

Approach --
- Use 2 pointer approach.
- Use 2 pointers - one from left and other from right
- Left and right pointers are used as left product and right product
- The products of left side elements are stored in left and prod of right side elements are to be stored in right arr

TC - O(n)
SC - O(n)

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
"""

n = [1, 2, 3, 4]


def prodArrExceptSelf(nums):
    nums_len = len(nums) - 1

    left, right = 1, 1
    rtnData = [1] * len(nums)

    for i in range(0, len(nums)):
        rtnData[i] *= left
        rtnData[nums_len - i] *= right
        left *= nums[i]
        right *= nums[nums_len - i]

    return rtnData


print(prodArrExceptSelf(n))
