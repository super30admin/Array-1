# Time Complexity: O(N)
# Space Complexity: O(1)
# Passed Leetcode
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if len(nums) == 0:
            return 

        result = [1]
        for i in range(1, len(nums)):
            
            result.append(nums[i - 1] * result[i - 1])
        
        temp = nums[-1]
        for i in range(len(nums) - 2, -1, -1):
            
            result[i] = result[i] * temp
            
            temp *= nums[i]
        return result

            
            
            
        
        
                
                
        