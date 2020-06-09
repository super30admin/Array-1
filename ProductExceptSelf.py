// Time Complexity :O(2n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Three line explanation of solution in plain english

// Your code here along with comments explaining your approach
//calculate the left product and right product for each element and multiply it.
class Solution(object):
    def productExceptSelf(self, nums):
       
        result = [None] * len(nums)
        
        lp = 1
        rp = 1
        
        for i in range(len(nums)):
            if(i==0):
                result[i] = 1
            else:
                
                lp = lp*nums[i-1]
                result[i] = lp
        for i, e in reversed(list(enumerate(nums))):
            if(i == len(nums)-1):
                
                result[i] = result[i] * rp
            else:
                
                rp = rp * nums[i+1]
                result[i] = result[i] * rp

        return result  
            
            
            
        
