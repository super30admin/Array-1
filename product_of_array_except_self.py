'''
Time: Big O(N)
Space: Big O(1) since result array is not considered as extra space
'''
class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        prefix_product = 1 
        res = [1]*len(nums)

        for i in range(1,len(nums)):
            res[i] = nums[i-1] * prefix_product
            prefix_product = res[i]
        prefix_product = 1 

        for j in range(len(nums)-2,-1,-1):
            res[j] = res[j] * nums[j+1] * prefix_product
            prefix_product = nums[j+1] * prefix_product

        return res