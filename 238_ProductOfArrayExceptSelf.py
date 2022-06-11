"""
Leetcode - https://leetcode.com/problems/product-of-array-except-self/ (submitted)
TC- O(2N) = O(N), SC- O(1)
Lecture- https://youtu.be/o_U50Uzz9Ek
FAQ-
Buildup? Start with division approach, multiplication of all elements in array and divide by number itself.
Since, that's not allowed, take two arrays with left product and right product of the element and divide by the element
itself. Now, since we don't want extra space, we can try using our output array (no auxiliary space needed) to store
left product, and as we calculate the right product, just multiply it into the result array having left product and the
array will be our final array with desired result.


Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of
nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

Constraints:
2 <= nums.length <= 10^5
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.


Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space
for space complexity analysis.)
"""

'''
Ideation - refer FAQ (no space approach)
'''


class Solution:
    def productExceptSelf(self, nums):
        n = len(nums)
        result = [1] * n
        # calculate left product and store it in result array
        tempProduct = 1
        for i in range(n):
            result[i] = tempProduct
            tempProduct *= nums[i]
        # calculate right product and multiply it with left product stored in result array
        tempProduct = 1
        for i in range(n - 1, -1, -1):
            result[i] *= tempProduct
            tempProduct *= nums[i]

        return result


nums = [-1, 1, 0, -3, 3]
result = Solution().productExceptSelf(nums)
print(result)
