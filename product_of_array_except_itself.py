# O(N) TIME AND O(N) SPACE WHERE N IS THE LENGTH OF NUMS ARRAY
class Solution:
    def productExceptSelf(self,nums):
        products = [1 for num in nums]
        current_product = 1
        for i in range(len(nums)):
            products[i] *= current_product
            current_product *= nums[i]
        current_product = 1
        for i in reversed(range(len(nums))):
            products[i] *= current_product
            current_product *= nums[i]
        return products
