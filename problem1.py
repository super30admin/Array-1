# Time Complexity : O(n))
# Space Complexity : o(1)

# Did this code successfully run on Leetcode : 
# YEs

# Any problem you faced while coding this : 

# Your code here along with comments explaining your approach



class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if nums == None or len(nums) == 0:
            return 0
        n = len(nums)
        result =[1]*n
        
        rp =1
        #find all the product to left of i 
        for i in range(1,n):
            rp =rp * nums[i-1]
            result[i] = rp
        rp = 1
        # find all product to right of i and multiply
        for i in range(n-2,-1,-1):
            rp =rp* nums[i+1]
            result[i] = result[i]*rp
        return result    
        