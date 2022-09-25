# Time Complexity: O(n)
# Space Complexity: O(1)

# The code sucessfully ran on Leetcode

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if len(nums) == 0 or nums == None:
            return list()
        
        rp = 1
        result = [1]
        
        for i in range(1, len(nums)):
            rp *= nums[i - 1]
            result.append(rp)
        
        rp = 1
        
        for i in range(len(nums) - 2, -1, -1):
            rp *= nums[i + 1]
            result[i] *= rp
            
        return result
        
        