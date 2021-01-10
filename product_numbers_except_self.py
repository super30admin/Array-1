# -*- coding: utf-8 -*-
"""
Time Complexity : O(N) as we have to traverse through the given array
Space Complexity : O(2N) approx to O(N),as we are trying to traverse through the array twice
"""
class Solution:
    def productExceptSelf(self, nums:[]) :
        #edge case
        if not nums or len(nums) ==0:
            return -1
        
        rp = 1
        output = [] #array to be returned
        output.append(1)
                
        #forward pass
        #traverse through the array
        for i in range(1,len(nums)):
            rp = rp * nums[i-1]
            output.append(rp) 
        
        #backward pass
        #traverse through the array in reverse
        rp = 1
        for i in range(len(nums)-2,-1,-1):
            rp = rp * nums[i+1]
            output[i] = output[i] * rp
        
        return output 
    
    
nums = [1,2,3,4]
S = Solution()
print(S.productExceptSelf(nums))
