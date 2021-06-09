# Time Complexity : O(N)
# Space Complexity : O(N) 
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO

class Solution:
    def productExceptSelf(self, nums) :
        n = len(nums)

        left = [0]*n #cummulative product from left to right
        right = [0]*n #cummulative product from right to left
        left[0] = nums[0]
        right[-1] = nums[-1]
        for i in range(1,len(nums)):
            left[i]=left[i-1]*nums[i]
        
        for i in range(n-2,-1,-1):
            right[i] = right[i+1]*nums[i]
        
        res = [0]*n
        
        res[0] = right[1]

        for i in range(1,n-1):
            res[i] = left[i-1]*right[i+1]
        res[-1] = left[-2]
        return res

nums = [1,2,3,4]
obj = Solution()
print(obj.productExceptSelf(nums))