"""
Given an array nums of n integers where n > 1, return an array output 
such that output[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

Example:

Input: [1,2,3,4] Output: [24,12,8,6] Note: 
Please solve it without division and in O(n).

Follow up: Could you solve it with constant space complexity? 
(The output array does not count as extra space for the purpose of space complexity analysis.)

"""

# Time Complexity : O(n)
# Space Complexity : O(1) as returning result used in calculations
# Did this code successfully run on leetcode : Yes
# Any problem you faced while coding this : No

from typing import List

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n = len(nums)
        result = [0 for i in range(n)]
        
        result[0] = 1
        
        rp = 1
        
        for i in range(1, n):
            rp = rp * nums[i-1]
            result[i] = rp
        
        rp = 1
        
        for i in range(n-2, -1, -1):
            rp = rp * nums[i+1]
            result[i] = result[i] * rp
            
        return result