
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Three line explanation of solution in plain english

#Create a result array to store the left products
#Compute the right product and multiply the result with the elements in the result array to #compute final product

# Your code here along with comments explaining your approach
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        n = len(nums)
        result = [1]*n
        
        for i in range(1,n):
            result[i]=result[i-1]*nums[i-1]

        rightProduct = nums[n-1]
        for i in range(n-2,-1,-1):
            result[i] = rightProduct*result[i]
            result = rightProduct*nums[i]
            
        return resukt
            
        
            
        
        
        