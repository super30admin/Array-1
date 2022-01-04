# Time Complexity : O(n) where n is the length of the list.
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        rp = 1 
        product = [1]
        # left product.
        for i in range(1,len(nums)):
            rp = rp*nums[i-1]
            product.append(rp)
        print(product)
        rp =1
        # right product and multiply with left product.
        for i in range(len(nums)-2,-1,-1):
            rp = rp * nums[i+1]
            product[i] = product[i] * rp
        return product
