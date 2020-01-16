# Time Complexity :O(n) 
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english

'''
Multiplying the each element in the list with the running product from the left
Once we hae traversed the entire list then resetinng the running product to 1 and multiplying
the list with the running product again and saving it in the result list
'''

# Your code here along with comments explaining your approach


class Solution:
    def productExceptSelf(self, nums):
        if(len(nums)==0):
            return(nums)
        result = []
        rp = 1
        temp = 1
    
        for i in range(len(nums)):
            rp = rp*temp 
            result.append(rp)
            temp = nums[i]
        
        
        rp=1
        temp = 1
    
        for i in range(len(nums)-1,-1,-1):
            rp = rp*temp
            result[i] = result[i]*rp
            temp = nums[i]
        
        return(result)

  