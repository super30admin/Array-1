# Time Complexity : O(N) //As left and the right product array will have N time the product of number stored in the array
#  Space Complexity : O(1) //As we are using the same array to return the result
#  Did this code successfully run on Leetcode : Yes
#  Any problem you faced while coding this : N/A

#  Your code here along with comments explaining your approach
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:      
        #Declare variable for nums length and an aray of that length
        n = len(nums)
        res = [None] * n
        
        #Iterate to get the left product [1,1,2,6]
        temp = 1
        for i in range(n):
            res[i] = temp
            temp *= nums[i]
        #With the same array get right product and multiply it with our existing left ([24,12,4,1] * [1,1,2,6])
        temp = 1
        for i in range(n-1,-1,-1):
            res[i] *= temp
            temp *= nums[i]
        
        return res