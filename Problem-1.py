# 238. Product of Array Except Self
# https://leetcode.com/problems/product-of-array-except-self/

# Time complexiety: O(n)
# Space complexiety: O(n) 

class Solution:
    def productExceptSelf(self, nums):
        left = [1]*len(nums)
        
        for i in range(1,len(nums)):
            left[i] = left[i-1]*nums[i-1]
        
        right = 1
        for i in range(len(nums)-1,-1,-1):
            left[i] = left[i]*right
            right *= nums[i]
            
        return left

obj = Solution()
print(obj.productExceptSelf([1,2,3,4]))