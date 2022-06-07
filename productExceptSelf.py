# Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        left = [1 for i in range(len(nums))]
        
        for i in range(1, len(nums)):
            left[i] = left[i-1] * nums[i-1]
            
        rightPrd = 1
        
        for j in range(len(nums)-2, -2, -1):
            left[j+1] *= rightPrd
            rightPrd *= nums[j+1]
            
        
        return left
