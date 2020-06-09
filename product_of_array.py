# Time Complexity : Add - O(n)
# Space Complexity :O(1)
# Did this code successfully run on Leetcode : Yes.

# Any problem you faced while coding this : No

'''
1. I have used running multiplication of each element(excluding the element) from the left and in reverse

2. While traversing from the reverse, I multiply the left running multiplication of an elemnent with right
   running multiplication
'''


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        if nums == [] or len(nums) < 1:
            return
        
        left_rmul = 1
        left_rmuls = [1]
        
        for i in range(1, len(nums)):
            
            left_rmul *= nums[i-1]
            left_rmuls.append(left_rmul)
            
        right_rmul = 1
        temp = 1
            
        for i in range(len(nums)-1,-1,-1):
            right_rmul *= temp
            
            left_rmuls[i] = left_rmuls[i] * right_rmul
            temp = nums[i]
            
        return left_rmuls
            
            
            
            
            
        