# Time complexity - O(n) (where n : length of nums)
# Space Complexity: O(1) 
# Did this code successfully run on LeetCode?: Yes
# Problems faced while coding this:None
# Approach : First get the forward product into the result and then append the result with backward product.

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if nums == None or len(nums) == 0:
            return nums
        
        #forward
        
        rp = 1
        result = [0]*len(nums)
        
        result[0] = 1
        for i in range(1,len(nums)):
            rp = rp *nums[i-1]
            result[i] = rp
            
        #backward
        
        rp = 1
        for i in range(len(nums)-2,-1,-1):
            rp = rp *nums[i+1]
            result[i] = result[i]*rp
            
        return result
        
        