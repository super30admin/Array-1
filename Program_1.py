"""
Time Complexity : O(N), N is the number of elements in the array
Space Complexity :O(N)
Did this code successfully run on Leetcode : Yes

Problem 1: Given an array nums of n integers where n > 1, return an array output such that output[i]
           is equal to the product of all the elements of nums except nums[i].

Example:
Input: [1,2,3,4]
Output: [24,12,8,6]
Note: Please solve it without division and in O(n).

"""




class Solution:
    
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        """
        We will be taking the product of left side of the array and the right side of the array. The left side will have the product
        all the elements before the element. Right side will have the product of all the elements after the element.
        """
        if len(nums) == 0: return 0
        
        left = [1 for i in range(len(nums))]
        right = [1 for i in range(len(nums))]
        res = [1 for i in range(len(nums))]
        
        #left side product
        for i in range(1, len(nums)):
            left[i] = left[i - 1] * nums[i - 1]
            
        for i in range(len(nums) - 2, -1, -1):
            right[i] = right[i + 1]* nums[i + 1]
        
        for i in range(len(nums)):
            res[i] = left[i] * right[i]
            
        return res

"""
Follow up:
Could you solve it with constant space complexity?
(The output array does not count as extra space for the purpose of space complexity analysis.)
Time Complexity : O(N), N is the number of elements in the array
Space Complexity :O(1)
"""
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        """
        Same logic with reduced space complexity. Instead of having extra array to store product, used a singal variable
        """
        if len(nums) == 0: return 0
        
        left = 1
        right = 1
        res = [1 for i in range(len(nums))]
        
        #left side product
        for i in range(1, len(nums)):
            res[i] = res[i - 1] * nums[i - 1]
            
        for i in range(len(nums) - 2, -1, -1):
            right *= nums[i + 1]
            res[i] = right * res[i]
        
        
        
        return res