# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO


# Your code here along with comments explaining your approach
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        ans=[]
        product=1
        # get product from left to right
        for x in range(len(nums)):
            ans.append(product)
            product *= nums[x]
            
        product =1
        
        # multiply with products from right to left
        for x in reversed(range(len(nums))) :
            ans[x] *= product
            product *= nums[x]
            
        return ans