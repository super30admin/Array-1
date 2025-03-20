# 238. Product of Array Except Self
# https://leetcode.com/problems/product-of-array-except-self/

# Time complexiety: O(n)
# Space complexiety: O(n)

# Logic: We create a result array with all 1s. We start from the left and calculate the running product so far.
# Then we take an interger=1 and calculate the product from the right at the same time updating the result (previously storing the left running product)

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