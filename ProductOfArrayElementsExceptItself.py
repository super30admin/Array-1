# // Time Complexity : O(N)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode :Yes
# // Any problem you faced while coding this :


# // Your code here along with comments explaining your approach

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        result = [0 for num in range(len(nums))]
        result[0] = 1
        n = len(nums)
        runningProduct = 1
        #right side product of each elemnt in list
        for i in range(1,n):
            runningProduct = runningProduct * nums[i-1]
            result[i] = runningProduct
            
        # reset Running product to 1 before going to left side
        runningProduct = 1
        
        #left side product of each elemnt in list
        for i in range(n-2,-1,-1):
            runningProduct = runningProduct * nums[i+1]
            result[i] = result[i] * runningProduct
        
        return result
        
                                     
                                     
                                
        
        
        