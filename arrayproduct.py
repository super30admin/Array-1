# https://leetcode.com/problems/product-of-array-except-self/
# Time: O(N)
# Space: O(1), we use the same array for left and right product which is the result.

class Solution:
    def productExceptSelf(self, nums):
        # maintain running product at each index, the idea is a each index the result is the left product and right product
        # time O(n)  space O(1), as we will use the same result array for running product
        
        #base
        if not nums: return []
        
        #start with the first number as it is for left product, no other number on left
        result = [0]*len(nums)
        result[0] = 1
        #Left product
        for i in range(1, len(nums)):
            result[i] = result[i-1]*nums[i-1]
        
        #Right product
        right_product = 1
        for i in range(len(nums)-2,-1,-1):
            right_product *= nums[i+1]
            result[i] *= right_product
            
        return result
            
nums = [1,2,3,4]
s = Solution()
output = s.productExceptSelf(nums)
print(output)       
        
        