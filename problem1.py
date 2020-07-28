# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this :


# Your code here along with comments explaining your approach

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        cumMul = [1 for _ in range(len(nums))]
        
        temp = nums[0]
        for i in range(1, len(nums)):
            cumMul[i] *= temp
            temp *= nums[i]
            
        print(cumMul)
        temp = nums[-1]
        for i in range(len(nums)-2, -1, -1):
            cumMul[i] *= temp
            temp *= nums[i]
            
        return cumMul