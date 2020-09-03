# 238. Product of Array Except Self

# code:

# Not space optimized!
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        left = [1]
        right = [1]*len(nums)
        
        # Left array
        for i in range(1,len(nums)):
            left.append(nums[i-1]*left[i-1])
        
        # Right array
        for i in reversed(range(len(nums)-1)):
            right[i] = nums[i+1]*right[i+1]
        
        op = []
        # Result array
        for i in range(len(left)):
            op.append(left[i]*right[i])
        
        return op

# Space optimized:

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        res = [0]*len(nums)
        
        prod = 1
        for i in range(len(nums)):
            res[i] = prod
            prod = prod*nums[i]
        
        prod = 1
        for i in reversed(range(len(nums))):
            res[i] = res[i]*prod
            prod = prod*nums[i]
            
        return res

# Time Complexity: O(n)
# Space Complexity: O(1)
# Accepted on Leetcode: YES
# Any problems faced: No.

