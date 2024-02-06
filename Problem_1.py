#
# @lc app=leetcode id=238 lang=python3
#
# [238] Product of Array Except Self
#

# @lc code=start

'''
Time Complexity - O(n) we are traversing the array twice
Space Complexity - O(n), for storing the result

This code works on Leetcode.
'''
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = [1] 
        rp = 1 #initially the product is 1
        for i in range(1,len(nums)): #start from the index 1 because the product of element at index 1 should not be itself
            rp*=nums[i-1] 
            result.append(rp) #store the result upto 1 index before current index
        rp = 1
        for i in range(len(nums)-2,-1,-1): #again start from second last index
            rp*=nums[i+1]
            result[i]*=rp #product of elements from left comes by traversing left to right and that from those on right comes by traversing right to left
        return result
        
# @lc code=end