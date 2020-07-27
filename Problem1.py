# # Array-1

# ## Problem 1

# Given an array nums of n integers where n > 1, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

 #Time Complexity : O(n)
# Space Complexity : O(1) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# we have two pass: first pass we keep the product from left to right and in second pass
# we keep the product from right to left except the element at that index and multiply the product
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if len(nums)==0 or nums == None:
            return 0
        result=[0]*len(nums)
        rp=1
        temp=1
        for i in range(0,len(nums)):
            rp=rp*temp
            result[i]=rp
            temp=nums[i] 
        rp=1
        temp=1
        
        for j in range(len(nums)-1,-1,-1):
            rp=rp*temp
            result[j]=result[j]*rp   
            temp=nums[j]
            
        return result
        