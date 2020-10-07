# Time complexity :- O(n)
# Space complexity :- O(1)

# Ran on leetcode :- yes

class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        n = len(nums)
        left_prod = [1] * n
        right_prod = [1] * n
        output = [1] * n
        
        for i in range(1,n):
            left_prod[i] = nums[i-1] * left_prod[i-1] 
            
            
        for j in range(n-2,-1,-1):
            right_prod[j] = nums[j+1] * right_prod[j+1]

            
        for k in range(n):
            output[k] = left_prod[k] * right_prod[k]
            
        return output