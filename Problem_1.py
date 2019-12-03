# Running on leetcode:  YES
# Runtime comlexity:   O(n)
# Memory complexity:  O(n) --only resultant array

class Solution:
    def productExceptSelf(self, nums):
        if not nums:
            return [0]
        result = []
        product = 1
        result.append(1)
        for i in range(1,len(nums)):
            result.append(product * nums[i-1])
            product = result[-1]
            
        product = 1
        for i in range(len(nums)-2,-1,-1):
            product *= nums[i+1]
            result[i] *= product
            
        return result
