'''
https://leetcode.com/problems/product-of-array-except-self/

Given an integer array nums, return an array answer such that answer[i] is 
equal to the product of all the elements of nums except nums[i].
Input: nums = [1,2,3,4]
Output: [24,12,8,6]
'''


# Time Complexity : O(N) where N is len(nums)
# Space Complexity : O(1) (no extra space as result array is expected output)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
class Solution:
    def productExceptSelf(self, nums: 'list[int]') -> 'list[int]':
        result = [1]*len(nums)
        running_product = 1
        
        # products to the left of 'i'
        result[0] = running_product # no elements left of i=0, so initialize with 1
        
        for i in range(1,len(nums)):
            result[i] = running_product * nums[i-1]
            running_product = result[i]
        
        # multiply with products to the right of 'i'
        running_product = 1
        for i in range(len(nums)-2, -1, -1):
            running_product = running_product * nums[i+1] # right side
            result[i] = result[i] * running_product # left side * right side 
        
        return result
        
        
        
        
            
            