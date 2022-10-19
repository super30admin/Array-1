# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No
#https://leetcode.com/problems/product-of-array-except-self/
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        n = len(nums)
        out = [0 for i in range(n)]
        
        prefixProd = 1
        suffixProd = 1
        
        for i in range(n):
            if i == 0:
                prefixProd = 1       
            else:
                prefixProd *= nums[i-1]
            out[i] = prefixProd

        for i in range(n-1,-1,-1):
            if i == (n-1):
                continue
            else:
                suffixProd *= nums[i+1]
            out[i] *= suffixProd
        return out