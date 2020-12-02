# Product of Array Except Self 

# Time Complexity : O(N) 
# Space Complexity : O(N) 
# Did this code successfully run on Leetcode : Yes, Runtime: 248 ms and Memory Usage: 21.1 MB
# Any problem you faced while coding this : Initially Yes, After Class No
# Your code here along with comments explaining your approach
# Approach
"""
An array output is initilized to 1 and a variable temp is initialized to 1. Array is Traversed from 
the start to end.For every index i output[i] is updated as output[i] = temp and temp = temp * array[i]
initilize temp to 1 and traversed the array from last index to start.
For every index i output[i] is updated as output[i] = output[i] * temp and temp = temp * array[i].
After multiplication output is returned.

"""
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        n=len(nums)
        if n == 1:
            return 0
        i=1
        temp=1
        output=[1 for i in range(n)] 
        for i in range(n): 
                output[i] = temp 
                temp *= nums[i] 
        temp = 1
        for i in range(n - 1, -1, -1): 
            output[i] *= temp 
            temp *= nums[i]        
        for i in range(n): 
            output[i]=output[i]
        return output

