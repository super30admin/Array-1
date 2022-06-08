'''
-- Passes Test Cases on Leetcode
'''
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        #Time Complexity : O(n) ; Space Complexity : O(1)
        n = len(nums)
        res = [1]
        rprod = 1
        
        for i in range(1, n):
            ans = res[i-1] * nums[i-1]
            res.append(ans)
            
        lprod = 1
        
        for i in range(n-1, -1, -1):
            res[i] = lprod * res[i]
            lprod *= nums[i]
            
        return res
            
            
        
