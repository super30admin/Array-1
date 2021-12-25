# Time: O(n)
# Space: O(n)
class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        product = []
        product.append(1)
        for i in range(1, len(nums)):
            product.append(nums[i-1]*product[i-1])
        r = 1
        for i in range(len(nums)-1, -1, -1):
            product[i] = product[i]*r
            r = r*nums[i]
        return product
            
        
        
