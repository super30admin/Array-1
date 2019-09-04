"""
The approach here is to find the product of elements towards the right side first and then store in a 
array and on the same array now multiply it with the product of elements towards the left side at each
index. then finally return the altered array.
"""
def productExceptSelf(self, nums):
        output=[1]*len(nums)
        n=len(nums)
    
        prod=1
        for i in range(1,n):
            prod=prod*nums[i-1]
            output[i]*=prod
        
        prod=1
        for i in range(n-2,-1,-1):
            prod=prod*nums[i+1]
            output[i]*=prod
    
        return output