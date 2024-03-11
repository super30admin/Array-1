
"""
238. Product of Array Except Self
Medium
"""
from leetcode_runner import LeetCode, TestCase, Args
from typing import *

PROBLEM = """
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.
 
Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

 
Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

 
Follow up: Can you solve the problem in O(1) extra space complexity? (The output array does not count as extra space for space complexity analysis.)

"""

class Solution:
    """
    Accepted
    Time Complexity :  O(n)
    Space Complexity : O(1)
    Did this code successfully run on Leetcode : Yes
    Runtime 99%
    Memory  35%
    
    Two pass approach - O(n)
    Explanation: We calculate prefix product and suffix product in two passes.
    For example, for [1,2,3,4], prefix product is [1,1,2,6] and suffix product is [24,12,4,1]. 
    [1,1,2,6] is calculated as [1, 1*1, 1*1*2, 1*1*2*3]
    [24,12,4,1] is calculated as [1*2*3*4, 2*3*4, 3*4, 4*1]
    Result is calculated as [1*24, 1*12, 2*4, 6*1] which is [24,12,8,6]
    Once we have these two arrays, we can calculate the product of all elements except self by multiplying prefix and suffix products
    """
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        lis = [1 for _ in range(len(nums))]
        rp = 1
        for i in range(1,len(nums)): # prefix product
            rp *= nums[i-1]
            lis[i] = rp
        rp = 1
        for i in range(len(nums)-2, -1, -1): # suffix product
            rp *= nums[i + 1]
            lis[i] *= rp # instead of creating a new array, we can just multiply the prefix product with suffix product
        return lis

LeetCode(PROBLEM, Solution).check()
